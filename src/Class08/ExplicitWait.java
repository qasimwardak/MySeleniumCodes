package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        String url = "http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        WebElement userBtn = driver.findElement(By.id("save"));
        userBtn.click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'First Name :')]")));

        WebElement fName = driver.findElement(By.xpath("//p[contains(text(), 'First Name :')]"));
        String fNameText = fName.getText();
        System.out.println(fNameText);

    }
}
