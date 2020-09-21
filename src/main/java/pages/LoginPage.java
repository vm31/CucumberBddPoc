package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, 30);
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    @FindBy(xpath = "//div[@class=\"icon\"]")
    private WebElement loginIcon;
    @FindBy(id = "ctl00_ctl00_ContentMain_ContentPlaceHolder1_emailbox")
    private WebElement emailBox;
    @FindBy(id = "ctl00_ctl00_ContentMain_ContentPlaceHolder1_passwordbox")
    private WebElement passwordBox;
    @FindBy(id= "ctl00_ctl00_ContentMain_ContentPlaceHolder1_btnLogin")
    private WebElement loginBtn;


public void clickOnLoginIcon(){
    loginIcon.click();
}
public void enterEmailId(String email){
    emailBox.sendKeys(email);
}
public void enterPassword(String pwd){
    passwordBox.sendKeys(pwd);

}
public void clickOnLoginBtn(){

    loginBtn.click();
}
}

