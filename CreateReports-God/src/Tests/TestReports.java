package Tests;

import Metods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by oem on 2/27/17.
 */
public class TestReports extends BaseTest {
    @Test

    public void testPlanReport() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestPlanReport testPlanReportPositive = new TestPlanReport();
        testPlanReportPositive.testPlanreportMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("Cases by type"));

    }

    @Test

    public void testRunReport() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestRunReport testRunReportPositive = new TestRunReport();
        testRunReportPositive.TestRunReportMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("Cases by status"));
    }

    @Test

    public void SpendTimeReport() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestSpendTimeReport testSpendTimeReportPositive = new TestSpendTimeReport();
        testSpendTimeReportPositive.TestSpendTimeReportMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("User spent time"));
    }

    @Test

    public void ProjectSpendTimeReport() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestProjectSpendTimeReport testProjectSpendTimeReportPositive = new TestProjectSpendTimeReport();
        testProjectSpendTimeReportPositive.TestProjectSpendTimeReportMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("Project users spent time"));

    }

    @Test

    public void IssuesByStatus() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestByIssueStatusReport testByIssueStatusReport = new TestByIssueStatusReport();
        testByIssueStatusReport.TestByIssueStatusMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("Issues by status"));

    }


    @Test

    public void IssuesByPriority() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestByPiorityReport testByPiorityReportPositive = new TestByPiorityReport();
        testByPiorityReportPositive.TestByPiorityReportMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("Issues by priority"));
    }
    @Test

    public void IssuesBySeverity() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestIssuesBySeverityReport testIssuesBySeverityReportPositive = new TestIssuesBySeverityReport();
        testIssuesBySeverityReportPositive.TestIssuesBySeverityMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("Issues by severity"));
    }
    @Test

    public void IssuesByType() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestIssuesByTypeReport testIssuesByTypeReport = new TestIssuesByTypeReport();
        testIssuesByTypeReport.TestIssuesByTypeMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("Issues by type"));
    }
    @Test

    public void IssuesByCrashes() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "qwe@qwe.qwe", "qweqweqwe");
        Thread.sleep(2000);
        GetToReports getToReports = new GetToReports();
        getToReports.PassAllStepsCorrectly(driver);
        TestCrashesByVersionReport testCrashesByVersionReport = new TestCrashesByVersionReport();
        testCrashesByVersionReport.TestCrashesByVersionMethod(driver);
        WebElement blockName = driver.findElement(By.className("report-title"));
        assertTrue(blockName.getText().contains("Crashes by build"));

    }


}


