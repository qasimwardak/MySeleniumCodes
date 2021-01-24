package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework {
    public static void main(String[] args) {
       /* HW
        Go to aa.com/homePage.do
            select depart date
        select return date
        select destination
        click on search
        quit the browser*/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.aa.com/homePage.do");

        WebElement From = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
        From.clear();
        From.sendKeys("Washington Dulles Intl, DC");
        WebElement To = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        To.sendKeys("Khwaja Rawash, Afghanistan");
        WebElement departCal = driver.findElement(By.className("ui-datepicker-trigger"));
        departCal.click();





    }
}
