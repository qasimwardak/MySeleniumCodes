package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarHandling {

    public static void main(String[] args) {
        String url = "https://www.delta.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebElement calendarBtn = driver.findElement(By.id("input_departureDate_1"));
        calendarBtn.click();
        WebElement departMonth = driver.findElement(By.className("dl-datepicker-month-0"));
        String departMonthText = departMonth.getText();
        WebElement nextBtn = driver.findElement(By.xpath("//span[text () = 'Next']"));

        while (!departMonthText.equals("July")) {
            nextBtn.click();
            departMonthText = departMonth.getText();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> departDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-0']/tr/td"));
        for (WebElement departDate:departDates) {
            if (departDate.getText().equals("4")) {
                departDate.click();
                break;
            }
        }
            WebElement returnMonth = driver.findElement(By.className("dl-datepicker-month-1"));
                    String returnMonthText = returnMonth.getText();
            while (!returnMonthText.equals("September")) {
                nextBtn.click();
                returnMonthText = returnMonth.getText();
            List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-1']/tr/td"));
            for (WebElement returnDate: returnDates) {
                if (returnDate.getText().equals("11")) {
                    returnDate.click();
                    break;
                }
            }
            WebElement doneBtn = driver.findElement(By.className("donebutton"));
            doneBtn.click();

            }



    }

}
