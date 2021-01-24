package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework03 {
    /*
    HRMS Application Negative Login:
Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name = 'Submit']")).click();
        boolean disPlay= driver.findElement(By.xpath("//input[@name = 'Submit']")).isDisplayed();
        System.out.println("Display "+ disPlay);


    }
}
