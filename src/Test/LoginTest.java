package Test;

import TestBase.BaseClass;
import pages.LoginPage;
import utils.ConfigsReader;

public class LoginTest {
    public static void main(String[] args) {
        BaseClass.setUp();
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys(ConfigsReader.getPropertyValue("username"));
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.login.click();
    }
}
