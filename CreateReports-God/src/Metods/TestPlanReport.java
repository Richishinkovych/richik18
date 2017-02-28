package Metods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by oem on 2/27/17.
 */
public class TestPlanReport {

    public void testPlanreportMethod (WebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("Test reports")).click();
        Thread.sleep(600);
        driver.findElement(By.linkText("Choose type of report")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("Test plan")).click();
        Thread.sleep(250);
        driver.findElement(By.linkText("Choose test plan")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("ChetkiiTestplan")).click();
        Thread.sleep(150);
        driver.findElement(By.id("report-button")).click();

    }


}


