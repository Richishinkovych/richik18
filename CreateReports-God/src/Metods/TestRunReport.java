package Metods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
/**
 * Created by oem on 2/27/17.
 */
    public class TestRunReport {

    public void TestRunReportMethod (WebDriver driver) throws InterruptedException{
        driver.findElement(By.linkText("Test reports")).click();
        Thread.sleep(600);
        driver.findElement(By.linkText("Choose type of report")).click();
        Thread.sleep(50);
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/ul/li[3]/a/label")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("Choose test run")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("kkk")).click();
        Thread.sleep(150);
        driver.findElement(By.id("report-button")).click();
    }

}
