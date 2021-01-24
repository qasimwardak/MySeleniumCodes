package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class HandlingPagination extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        setUp();

       WebElement userName =  driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
       userName.sendKeys("Admin");
       WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
       password.sendKeys("Hum@nhrm123");
       WebElement login =  driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
       login.click();

       WebElement PIM= driver.findElement(By.id("menu_pim_viewPimModule"));
       PIM.click();
       Thread.sleep(2000);
       WebElement addEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
       addEmployee.click();
       WebElement firstName = driver.findElement(By.id("firstName"));
       firstName.sendKeys("Zaki");
       WebElement lastName = driver.findElement(By.id("lastName"));
       lastName.sendKeys("Tabesh");
       WebElement employeeId = driver.findElement(By.id("employeeId"));
       String employeeIdText = employeeId.getAttribute("value");
       WebElement saveBtn = driver.findElement(By.id("btnSave"));
       saveBtn.click();

       WebElement employeeList = driver.findElement(By.linkText("Employee List"));
       employeeList.click();
        boolean flag = true;
        while(flag) {
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
            for (int i=0; i<tableRows.size(); i++) {
                String rowText = tableRows.get(i).getText();
                if (rowText.contains(employeeIdText)) {
                    flag = false;
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr["+ i +"]/td[1]"));
                    checkBox.click();
                    WebElement deleteBtn = driver.findElement(By.id("btnDelete"));
                    deleteBtn.click();
                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                    break;

                }
            }
            WebElement next = driver.findElement(By.linkText("Next"));
            next.click();
        }



    }
}
