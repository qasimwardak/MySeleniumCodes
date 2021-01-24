package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

/*
HW2
Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
 */
public class Homework03 {
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       WebElement categories = driver.findElement(By.name("_sacat"));
        Select select=new Select(categories);
        List<WebElement> allCategories = select.getOptions();
        for (WebElement category:allCategories) {
            String categoryText = category.getText();
            System.out.println(categoryText);

        }
        select.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(2000);
        boolean header= driver.findElement(By.xpath("//span[@class = 'b-pageheader__text']")).isDisplayed();
        System.out.println("Is the header displayed ? = "+header);

        }
        }

