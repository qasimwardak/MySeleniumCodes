package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
HW
Navigate to http://syntaxtechs.com/selenium-practice/index.php
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
 */
public class Homework01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.findElement(By.xpath("//a[@id = 'btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class = 'list-group-item']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id = 'user-message']")).sendKeys("Hello Qasim");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class = 'btn btn-default']")).click();



    }
}
