package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class CalendarHandling extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        setUp();
        WebElement userName =  driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login =  driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        login.click();
        Thread.sleep(2000);
        WebElement leaveBtn = driver.findElement(By.linkText("Leave"));
        leaveBtn.click();
        WebElement leaveList = driver.findElement(By.linkText("Leave List"));
        leaveList.click();
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();
        WebElement moDD = driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD=new Select(moDD);
        monthDD.selectByVisibleText("Jul");

        WebElement yDD = driver.findElement(By.className("ui-datepicker-year"));
        Select yearDD=new Select(yDD);
        yearDD.selectByVisibleText("2021");

        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement fromDate:fromDates) {
            if (fromDate.getText().equals("4")) {
                fromDate.click();
                break;
            }
        }
    }
}
