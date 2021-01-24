package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        //driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement draggAble = driver.findElement(By.id("draggable"));
        WebElement droppAble = driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
        action.dragAndDrop(draggAble, droppAble).perform();
        //action.clickAndHold(draggAble).moveToElement(droppAble).release().build().perform();
    }
}
