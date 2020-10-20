package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }


    @FindBy(xpath = "//a[@class='headerLogo']")
    private WebElement homepageLogo;

    public boolean verifyHomePageLogo() {
        return homepageLogo.isDisplayed();


    }

    public String getOptions() {
        List<WebElement> opts = driver.findElements(By.xpath("//*[@id=\"mainMenu\"]//a[@href='/womens/']/../div/ul/li"));// to get list of web elements
        String optName = ""; //this is to get as string 
        int sizeOfOpts = opts.size();
        System.out.println(sizeOfOpts);
        for (int i = 0; i < opts.size(); i++) {
            optName = opts.get(i).getText();
            System.out.println(optName);


        }
        return optName;
    }


    public void getMenuItem(String mName) {
        List<WebElement> allText = driver.findElements(By.xpath("//ul[@class='menu group']"));
        for (WebElement element : allText) {
            System.out.println(element.getText());
            if (element.getText().equalsIgnoreCase(mName)) {
                element.click();
            }
        }

    }


}
