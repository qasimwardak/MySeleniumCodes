package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class JSExecutorDemo extends CommonMethods {

    public static void main(String[] args) {
        setUp();
        WebElement userName =  driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login =  driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor='red'", password);
        js.executeScript("arguments[0].click()", login);
    }
}
