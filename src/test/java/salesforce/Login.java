package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Login extends  PreConditions{
    @BeforeTest
    public void Login(){
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("jorge@fundacionjala.com");
        driver.findElement(By.id("password")).sendKeys("l2Cr0OnCfDxz1QRXUiet");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    }
    @AfterTest
    public void LogOut(){
        driver.findElement(By.id("userNav-arrow")).click();
        driver.findElement(By.linkText("Logout")).click();
    }
}
