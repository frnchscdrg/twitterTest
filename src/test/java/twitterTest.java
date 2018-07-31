import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class twitterTest {
    WebDriver driver = new ChromeDriver();
    String URL = "https://www.facebook.com/";

    @BeforeClass
    public static void BeforeClass() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    public void anExampleTest() {
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        // Start a new Chrome browser instance and maximize the browser window
        //driver = new ChromeDriver();
        // driver.manage().window().maximize();

        // Navigate to the Amazon.com home page
        // driver.get("https://www.facebook.com/");
        driver.get(URL);

        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        username.click();
        username.sendKeys("yourusername");
//        TimeUnit.SECONDS.sleep(3);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        password.click();
        password.sendKeys("yourpassword");
//        TimeUnit.SECONDS.sleep(3);

        password.sendKeys(Keys.chord(Keys.ENTER));

        driver.quit();

    }

}
