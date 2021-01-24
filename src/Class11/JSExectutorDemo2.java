package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExectutorDemo2 {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.amazon.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -500)");
        WebElement backToTop = driver.findElement(By.xpath("//span[text() = 'Back to top']"));
        js.executeScript("arguments[0].scrollIntoView(false)", backToTop);

    }
}
