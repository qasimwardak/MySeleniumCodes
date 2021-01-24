package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework02 {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Elham");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Wardak");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("7034568765");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Shabeer123$%^");
        Thread.sleep(2000);
        WebElement monthDD = driver.findElement(By.xpath("//select[@name = 'birthday_month']"));
        Select selectMonth = new Select(monthDD);
        selectMonth.selectByVisibleText("May");
        Thread.sleep(2000);
        WebElement dayDD = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
        Select selectDay = new Select(dayDD);
        selectDay.selectByValue("15");
        Thread.sleep(2000);
        WebElement yearDD = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
        Select selectYear = new Select(yearDD);
        selectYear.selectByValue("1995");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text () = 'Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();


    }
}