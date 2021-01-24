package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SingleWindowHandling {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        String url = "https://accounts.google.com/signup";
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        System.out.println("Parent Handle "+mainPageHandle);
        WebElement helpLink= driver.findElement(By.ByLinkText.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles=driver.getWindowHandles();// will automatically return Linkedhashset.
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator=allWindowHandles.iterator();// Iterating through the windows
        mainPageHandle = iterator.next();//strpping forword to the main page
        String childHandle = iterator.next();//stepping forward to child
        System.out.println("Child Handle "+childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);
        //driver.close();
        driver.quit();


    }

}
