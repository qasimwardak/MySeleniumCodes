package Class07;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.java2d.windows.GDIRenderer;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Homework01 {
    /*HW
    Go to https://demoqa.com/browser-windows
    click on New Tab and print the text from new tab in the console
    click on New Window and print the text from new window in the console
    click on New Window Message and print the text from new window in the console
    Verify the title is displayed
    Print out the title of the all pages*/
    public static void main(String[] args)  {
        String url = "https://demoqa.com/browser-windows";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        System.out.println("--------------------- Windwow 1 ------------------------------------");
        String mainWindow=driver.getWindowHandle();
        WebElement tab =  driver.findElement(By.id("tabButton"));
        tab.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Set<String> allWindows1 = driver.getWindowHandles();
        Iterator<String> iterator1 = allWindows1.iterator();
        mainWindow = iterator1.next();
        String chlidWindow1 = iterator1.next();
        driver.switchTo().window(chlidWindow1);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String tabText = driver.findElement(By.id("sampleHeading")).getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(tabText);
        String title1 = driver.getTitle();
        if (title1.isEmpty()) {
            System.out.println("The Title is Empty");
        }else {
            System.out.println(title1);

        }
        driver.close();
        System.out.println("--------------------- Windwow 2 ------------------------------------");

        driver.switchTo().window(mainWindow);
        WebElement window =  driver.findElement(By.id("windowButton"));
        window.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Set<String> allWindows2 = driver.getWindowHandles();
        Iterator<String> iterator2 = allWindows2.iterator();
        mainWindow = iterator2.next();
        String chlidWindow2 = iterator2.next();
        driver.switchTo().window(chlidWindow2);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String windowText = driver.findElement(By.id("sampleHeading")).getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(windowText);
        String title2 = driver.getTitle();
        if (title2.isEmpty()) {
            System.out.println("The is Empty");
        }else {
            System.out.println(title2);
        }
        driver.close();
        System.out.println("--------------------- Windwow 3 ------------------------------------");

        driver.switchTo().window(mainWindow);
        WebElement windowMessage =  driver.findElement(By.id("messageWindowButton"));
        window.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Set<String> allWindows3 = driver.getWindowHandles();
        Iterator<String> iterator3 = allWindows3.iterator();
        mainWindow = iterator3.next();
        String chlidWindow3 = iterator3.next();
        driver.switchTo().window(chlidWindow3);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String windowMsgText = driver.findElement(By.xpath("/html/body")).getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(windowMsgText);
        String title3 = driver.getTitle();
        if (title3.isEmpty()) {
            System.out.println("The Title is Empty");
        }else {
            System.out.println(title3);
        }
        driver.close();
        driver.switchTo().window(mainWindow);
        driver.quit();

    }
}
