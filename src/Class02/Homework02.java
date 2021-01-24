package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    /*
    navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_b")).sendKeys("Zaki");
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_d")).sendKeys("Tabesh");
        driver.findElement(By.id("u_1_g")).sendKeys("1234567890");
        driver.findElement(By.id("password_step_input")).sendKeys("hejran123");
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_s")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_9")).click();
        driver.close();
        Thread.sleep(2000);
        driver.quit();
    }
}

