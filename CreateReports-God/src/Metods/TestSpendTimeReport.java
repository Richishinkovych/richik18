package Metods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by oem on 2/27/17.
 */
public class TestSpendTimeReport {
    public void TestSpendTimeReportMethod (WebDriver driver) throws InterruptedException{
        driver.findElement(By.linkText("Test reports")).click();
        Thread.sleep(600);
        driver.findElement(By.linkText("Choose type of report")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("User spent time")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("Choose user")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("Mark Dubovii")).click();
        Thread.sleep(150);
        driver.findElement(By.id("report-button")).click();
    }


}
