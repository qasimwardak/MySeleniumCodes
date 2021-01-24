package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
import java.util.List;

public class Homework extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        setUp();
        /*HW
        Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        click on leave
        click on leave list
        choose from "From calendar"
        choose from "To calendar"
        click only on cancelled and rejected checkboxes
        uncheck Pending Approval
        select IT support from DD
        click search
        quit the browser*/
        WebElement userName = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        login.click();
        Thread.sleep(2000);
        WebElement LeaveBtn = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        LeaveBtn.click();
        WebElement LevListBtn = driver.findElement(By.linkText("Leave List"));
        LevListBtn.click();
        WebElement DateFrom = driver.findElement(By.id("calFromDate"));
        DateFrom.click();
        Thread.sleep(2000);
        WebElement monthField = driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD = new Select(monthField);
        monthDD.selectByVisibleText("Dec");
        Thread.sleep(2000);
        WebElement yearField = driver.findElement(By.className("ui-datepicker-year"));
        Select yearDD = new Select(yearField);
        yearDD.selectByVisibleText("2019");
        Thread.sleep(2000);
        List<WebElement> dayFields = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement dayDD : dayFields) {
            if (dayDD.getText().contains("15")) {
                dayDD.click();
                break;
            }
        }
        WebElement toDate = driver.findElement(By.id("calToDate"));
        toDate.click();
        WebElement monthField2 = driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD2 = new Select(monthField2);
        monthDD2.selectByVisibleText("Jan");
        Thread.sleep(2000);
        WebElement yearField2 = driver.findElement(By.className("ui-datepicker-year"));
        Select yearDD2 = new Select(yearField2);
        yearDD2.selectByVisibleText("2020");
        Thread.sleep(2000);
        List<WebElement> dayFields2 = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement dayDD2 : dayFields2) {
            if (dayDD2.getText().contains("5")) {
                dayDD2.click();
                break;
            }
        }
        WebElement cancelled = driver.findElement(By.id("leaveList_chkSearchFilter_0"));
        cancelled.click();
        System.out.println(cancelled.isSelected());
        Thread.sleep(2000);
        WebElement rejected = driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
        rejected.click();
        System.out.println(rejected.isSelected());
        WebElement pendingUnchecked = driver.findElement(By.id("leaveList_chkSearchFilter_1"));
        pendingUnchecked.click();
        System.out.println(pendingUnchecked.isSelected());
        Thread.sleep(2000);
        WebElement DropDown = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select ITsDD = new Select(DropDown);
        ITsDD.selectByVisibleText("IT Support");
        WebElement serachBtn = driver.findElement(By.id("btnSearch"));
        serachBtn.click();
        driver.quit();

            }
        }
