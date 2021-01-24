package ReviewClass01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//        WebDriver driver=new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        List<WebElement> departments= driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));

        int numOfDepts=departments.size();
        System.out.println("Number of Departments : "+ numOfDepts);

        for(WebElement dept:departments){
            System.out.println(dept.getText());
        }


        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        driver.quit();


    }
}
