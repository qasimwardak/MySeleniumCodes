package Class04;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for(WebElement link : allLinks) {
            String fullLink = link.getAttribute("href");
            String linkText = link.getText();
            if(!linkText.isEmpty()) {
                System.out.println(linkText + "       " +fullLink);
            }

        }
    }
}
