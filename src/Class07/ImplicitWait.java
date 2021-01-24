package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        String url = "http://syntaxtechs.com/selenium-practice/index.php";
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement startPracticingButton = driver.findElement(By.id("btn_basic_example"));
        startPracticingButton.click();

    }
}