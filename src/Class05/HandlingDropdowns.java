package Class05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropdowns {

    public static String url = "http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDD = driver.findElement(By.id("select-demo")); // locate the dropdown
        Select select = new Select(daysDD); // create an object of a select class
//        select.selectByIndex(2); // select by index
//        Thread.sleep(1000);
//
//        select.selectByVisibleText("Wednesday");
//        Thread.sleep(1000);
//
//        select.selectByValue("Sunday");

        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println(size);



    }
}
