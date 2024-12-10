import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    @Test
    void setup(){
        ChromeOptions ChromeOptions = new ChromeOptions();
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://datacom.com/nz/en/contact-us");
        //Click Contact Us
        driver.findElement(By.xpath("//*[@id=\"cmp-mrkto-modal-thank-you\"]")).click();

    }



}
