package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);

    }
}
