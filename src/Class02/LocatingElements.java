package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Qasim");
        driver.findElement(By.id("pass")).sendKeys("kabul123");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}