package ReviewClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");

        driver.findElement(By.linkText("Alerts & Modals")).click();
        driver.findElement(By.linkText("Window Popup Modals")).click();


    }
}
