package pages;

import TestBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory extends CommonMethods{
    public static void main(String[] args) throws IOException {
        BaseClass.setUp();
        LoginPageWithFactory loginPageWithFactory=new LoginPageWithFactory();
        loginPageWithFactory.userNameTextbox.sendKeys("Admin");
        loginPageWithFactory.passowrdTextbox.sendKeys("Hum@nhrm123");
        loginPageWithFactory.loginBtn.click();

        TakesScreenshot takesScreenshot= (TakesScreenshot)BaseClass.driver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("screenshots/HRMS/dashboard.jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }
        DashboardPage dashboardPage = new DashboardPage();
       String welcomeText = dashboardPage.welcomeAdmin.getText();
        System.out.println(welcomeText);
        driver.quit();
    }
}
