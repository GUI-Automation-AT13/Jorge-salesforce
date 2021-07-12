package SalesForceTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import salesforce.BeforeContract;

public class ContractTests extends BeforeContract {

    @Test(groups = "CreateContract")
    public void CreateContract(){

        driver.findElement(By.cssSelector(".allTabsArrow")).click();
        driver.findElement(By.linkText("Contracts")).click();
        driver.findElement(By.name("new")).click();
        driver.findElement(By.id("ctrc7")).click();
        driver.findElement(By.id("ctrc7")).sendKeys("TestContract");
        driver.findElement(By.id("ctrc5")).click();
        driver.findElement(By.id("ctrc5")).sendKeys("7/12/2021");
        driver.findElement(By.cssSelector("tr:nth-child(6) > .last:nth-child(3)")).click();
        driver.findElement(By.id("ctrc40")).click();
        driver.findElement(By.id("ctrc40")).sendKeys("3");
        driver.findElement(By.cssSelector("tr:nth-child(6) > .col02")).click();
        driver.findElement(By.cssSelector("#bottomButtonRow > .btn:nth-child(1)")).click();
        String actual = driver.findElement(By.cssSelector("div[id*=\"ctrc7_ileinner\"]")).getText();
        String expected = "TestContract";
        Assert.assertEquals(actual,expected);
    }
}
