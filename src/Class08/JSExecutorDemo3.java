package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open();");
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("Photos");
        //driver.switchTo().()
    }
}