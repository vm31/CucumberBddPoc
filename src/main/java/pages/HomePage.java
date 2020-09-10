package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;}


    @FindBy(xpath = "//a[@class='headerLogo']")
    private WebElement homepageLogo;

    public boolean verifyHomePageLogo(){
        return homepageLogo.isDisplayed();

    }

}
