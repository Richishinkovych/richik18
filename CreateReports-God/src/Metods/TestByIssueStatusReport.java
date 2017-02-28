package Metods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by oem on 2/27/17.
 */
public class TestByIssueStatusReport {
    public void TestByIssueStatusMethod (WebDriver driver) throws InterruptedException{
        driver.findElement(By.linkText("Test reports")).click();
        Thread.sleep(600);
        driver.findElement(By.linkText("Choose type of report")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("Issues by status")).click();
        Thread.sleep(50);
        driver.findElement(By.id("report-button")).click();
    }
}
