package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Homework01 {

    /*HW

    go to https://the-internet.herokuapp.com/dynamic_controls
    click on checkbox and click on remove
    verify the text
    click on enable verify the textbox is enabled
    enter text and click disable
    verify the textbox is disabled*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        checkBox.click();
        WebElement remove = driver.findElement(By.xpath("//button[text ()  = 'Remove']"));
        remove.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id = 'message']")));

        WebElement removeText = driver.findElement(By.xpath("//p[@id = 'message']"));
        String removeMsgText = removeText.getText();
        String expectedRemoveText = "It's gone!";
        if (removeMsgText.equals(expectedRemoveText)) {
            System.out.println("Correct Message");
        }else {
            System.out.println("Incorrect Message");
        }

        WebElement enableBtn = driver.findElement(By.xpath("//button[text () = 'Enable']"));
        System.out.println(enableBtn.isEnabled());
        enableBtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id = 'message']")));

        WebElement textBox = driver.findElement(By.xpath("//input[@type = 'text']"));
        System.out.println(textBox.isEnabled());
        textBox.sendKeys("My Name is Qasim");
        WebElement disableBtn = driver.findElement(By.xpath("//button[text ()  = 'Disable']"));
        disableBtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id = 'message']")));
        System.out.println(textBox.isEnabled());

    }
}
