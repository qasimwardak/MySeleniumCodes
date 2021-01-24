package Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
            System.out.println("The Title is Right");
        }else {
            System.out.println("The Title is Wrong");
        }
    }
}
