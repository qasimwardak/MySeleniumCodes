package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {
    public static void main(String[] args) {
        String url = "http://syntaxtechs.com/selenium-practice/dynamic-elements-loading.php";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
       WebElement startBtn = driver.findElement(By.id("startButton"));
       startBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome')]")));

        WebElement Msg = driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
        String MsgText = Msg.getText();
        System.out.println(MsgText);

    }
}
