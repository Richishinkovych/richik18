package Metods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by oem on 2/28/17.
 */
public class TestIssuesByTypeReport {
    public void TestIssuesByTypeMethod(WebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("Test reports")).click();
        Thread.sleep(600);
        driver.findElement(By.linkText("Choose type of report")).click();
        Thread.sleep(50);
        driver.findElement(By.linkText("Issues by type")).click();
        Thread.sleep(50);
        driver.findElement(By.id("report-button")).click();

    }
}
