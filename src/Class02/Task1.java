package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders";
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title match");
        } else {
            System.out.println("Title does not match");
        }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        driver.quit();
    }
    }
