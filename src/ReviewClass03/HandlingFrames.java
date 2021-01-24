package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url= "https://the-internet.herokuapp.com";
        driver.get(url);
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//body[@id = 'tinymce']/p"));
        textBox.clear();
        textBox.sendKeys("Hello Qasim Jan");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        boolean isDisplay=driver.findElement(By.xpath("//img[@alt = 'Fork me on GitHub']")).isDisplayed();

        if(isDisplay) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        Thread.sleep(2000);








    }
}
