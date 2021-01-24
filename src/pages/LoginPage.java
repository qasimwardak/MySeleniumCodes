package pages;

import TestBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

   public WebElement userName =  driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
   public WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
   public WebElement login =  driver.findElement(By.xpath("//input[@id = 'btnLogin']"));

}
