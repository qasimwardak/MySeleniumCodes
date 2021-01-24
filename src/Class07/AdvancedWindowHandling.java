package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        String url = "http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        WebElement instaButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement FbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instaAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instaButton.click();
        Thread.sleep(2000);
        FbButton.click();
        Thread.sleep(2000);
        instaAndFbButton.click();
        Thread.sleep(2000);

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);
        Iterator<String> iterator=allWindowHandles.iterator();
        while (iterator.hasNext()) {
          String childHandle = iterator.next();
          driver.switchTo().window(childHandle);

          /*String title=driver.getTitle();
            System.out.println("title of the page:" +title);
            if(title.contentEquals("Syntax Technologies (@syntaxtechs) • Instagram photos and videos")){
                driver.switchTo().window(childHandle);
                driver.manage().window().maximize();
                }
                */

          if(!childHandle.equals(mainPageHandle)) {
         driver.switchTo().window(childHandle);
              System.out.println(driver.getTitle());
              driver.close();
          }
    }
     driver.switchTo().window(mainPageHandle);
          instaButton.click();

}
}
