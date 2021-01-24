package Class05;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.Select;
        import java.util.List;
/*
TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
 */
public class Homework01 {
    public static String url = "https://www.facebook.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
        Thread.sleep(2000);

        WebElement monthDD = driver.findElement(By.xpath("//select[@name = 'birthday_month']"));
        Select selectMonth = new Select(monthDD);
        selectMonth.selectByVisibleText("May");
        Thread.sleep(1000);
        List<WebElement> allMonths = selectMonth.getOptions();
        int MonthsSize = allMonths.size();
        System.out.println("Month DD has "+MonthsSize+" months options");
        Thread.sleep(2000);
        WebElement dayDD = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
        Select selectDay = new Select(dayDD);
        selectDay.selectByValue("15");
        List<WebElement> allDays = selectDay.getOptions();
        int daysSize = allDays.size();
        System.out.println("day DD has "+daysSize+" days options");
        Thread.sleep(2000);
        WebElement yearDD = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
        Select selectYear = new Select(yearDD);
        selectYear.selectByValue("1995");
        List<WebElement> allYears = selectYear.getOptions();
        int yearsSize = allYears.size();
        System.out.println("day DD has "+yearsSize+" years options");
        driver.quit();

    }
}