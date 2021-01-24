package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    /*
    HW
Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */
    public static String url = "http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton = driver.findElement(By.xpath("//button[@class = 'btn btn-default']"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        Thread.sleep(2000);

        WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[@class = 'btn btn-default btn-lg']"));
        confirmAlertBtn.click();
        Thread.sleep(2000);
        Alert confirmeAlert = driver.switchTo().alert();
        String confirmeAlertText = confirmeAlert.getText();
        System.out.println(confirmeAlertText);
        confirmeAlert.dismiss();
        Thread.sleep(2000);

        WebElement promptAlertBtn = driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']"));
        promptAlertBtn.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        promptAlert.sendKeys("Ahmad Qasim");
        Thread.sleep(2000);
        promptAlert.accept();
        driver.quit();

    }
}
