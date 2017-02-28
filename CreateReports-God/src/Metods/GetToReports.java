package Metods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class GetToReports {
    public void PassAllStepsCorrectly(WebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("My Projects")).click();
        Thread.sleep(1500);
        driver.findElement(By.linkText("GoogleChotinadsit+1")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("SvgjsSvg1044")).click();

    }
}
