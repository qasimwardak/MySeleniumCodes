package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/upload");
        WebElement chooseFileBtn = driver.findElement(By.id("file-upload"));
        chooseFileBtn.sendKeys("C:\\Users\\Qasim\\Desktop\\Old Rag Mountain Pics\\0D9A2515.JPG");
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.click();
    }
}