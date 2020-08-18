package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderIconsPage {
    public WebDriver driver;

    public HeaderIconsPage(WebDriver driver) {
        this.driver = driver;}




    @FindBy(xpath = "//div[@class=\"headerAccount group\"]//div[@class='icon']")
    private WebElement loginIconBtn;


    public boolean isLoginIconDisplayed(){
        return loginIconBtn.isDisplayed();

    }
}
