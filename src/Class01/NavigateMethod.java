package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        //driver.close(); closes the current Tab only
        driver.quit();// closes the whole browser

    }
}
