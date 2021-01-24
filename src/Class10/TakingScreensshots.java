package Class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class TakingScreensshots {
    public static void main(String[] args) {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB);
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test", Keys.ENTER);

        TakesScreenshot tSs= (TakesScreenshot) driver;
        File srcFile = tSs.getScreenshotAs(OutputType.FILE); //screen shot is taken here
        try {
            FileUtils.copyFile(srcFile, new File("screenshots/HRMS/adminLogin.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
