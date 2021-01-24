package Class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDobleClickActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text() = 'right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickBtn).perform();
        WebElement editOption = driver.findElement(By.xpath("//span[text() = 'Edit']"));
        //editOption.click();
        action.click(editOption).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
        action.doubleClick(doubleClickBtn).perform();
        System.out.println(alert.getText());
        alert.accept();



    }
}