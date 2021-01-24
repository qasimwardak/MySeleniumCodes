package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    /*
    Task
Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name = 'txtPassword']")).sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id = 'btnLogin']")).click();
        Thread.sleep(2000);
        Boolean disPlay=driver.findElement(By.xpath("//img[@src = '/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']")).isDisplayed();
        System.out.println("Display "+disPlay);

    }
}
