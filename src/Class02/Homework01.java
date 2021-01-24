package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Homework
navigate to
 https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
         */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qasim\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Zaki");
        driver.findElement(By.name("customer.lastName")).sendKeys("Tabesh");
        driver.findElement(By.name("customer.address.street")).sendKeys("12345 Tanterra Court");
        driver.findElement(By.id("customer.address.city")).sendKeys("Woodbridge");
        driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("22191");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.name("customer.username")).sendKeys("zaki.tabesh");
        driver.findElement(By.id("customer.password")).sendKeys("hejran123#");
        driver.findElement(By.name("repeatedPassword")).sendKeys("hejran123");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);
        driver.close();


    }
}
