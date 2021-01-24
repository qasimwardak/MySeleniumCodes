package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPageWithFactory extends CommonMethods {
    @FindBy(id = "txtUsername")
    public WebElement userNameTextbox;

    @FindBy(xpath = "//input[@id = 'txtPassword']")
    public WebElement passowrdTextbox;

    @FindBy(css = "Input#btnLogin")
    public WebElement loginBtn;

    public LoginPageWithFactory(){
        PageFactory.initElements(driver, this);

    }


}
