package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework02 {
    /*HW
    navigate to http://www.uitestpractice.com/Students/Contact
    click on the link
    get text
    print out in the console*/
    public static void main(String[] args) {
        String url = "http://www.uitestpractice.com/Students/Contact";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("This is a Ajax link")).click();
        String text= driver.findElement(By.xpath("//div[@class='ContactUs']")).getText();
        System.out.println(text);
    }
}
