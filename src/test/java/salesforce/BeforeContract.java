package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeContract extends Login {

    @BeforeMethod(onlyForGroups = "CreateContract")
    public void CreateAccount(){
        driver.findElement(By.cssSelector(".allTabsArrow")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accounts")));
        driver.findElement(By.linkText("Accounts")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("tryLexDialogX")));
        driver.findElement(By.id("tryLexDialogX")).click();
        driver.findElement(By.name("new")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("acc2")));
        driver.findElement(By.id("acc2")).click();
        driver.findElement(By.id("acc2")).sendKeys("TestContract");
        driver.findElement(By.cssSelector("#bottomButtonRow > .btn:nth-child(1)")).click();
    }

    @AfterMethod(onlyForGroups = "CreateContract")
    public void cleanEnvironment(){
        wait.until(ExpectedConditions.elementToBeClickable(By.name("del")));
        driver.findElement(By.name("del")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector(".allTabsArrow")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.cssSelector(".first a")).click();
        driver.findElement(By.name("delete")).click();
        driver.switchTo().alert().accept();
    }
}
