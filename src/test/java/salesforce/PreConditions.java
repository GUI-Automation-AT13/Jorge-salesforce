package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PreConditions {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    public void generalConfig(){
        String PATH = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", PATH + "\\thirdparty\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,30);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
