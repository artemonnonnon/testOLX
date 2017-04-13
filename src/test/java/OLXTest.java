import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OLXTest {

    @BeforeClass public static void setup() {
        System.setProperty("webdriver.chrome.driver", "seleniumDrivers/chromedriver.exe");
    }

    @Test public void testNewAd() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.olx.ua");
    }
}
