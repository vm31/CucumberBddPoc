package pages;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class SearchPage {
    public WebDriver driver;
    public Utility util;


    public SearchPage(WebDriver driver) {

        this.driver = driver;
        this.util=new Utility(driver);

    }

    @FindBy(xpath = "//nav[@id='mainMenu']/ul/li/a[@href='/womens/']")
    private WebElement menuItemWomen;
    @FindBy(xpath = "//*[@id=\"mainMenu\"]//a[@href='/womens/']/../div/ul/li[1]/a")
    private WebElement itemWomen;



    //action method


    public void printListOFElements()  {
        Actions builder = new Actions(driver);
        builder.moveToElement(menuItemWomen).build().perform();
        List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"mainMenu\"]//a[@href='/womens/']/../div/ul/li/a"));
        int sizeOfOpts = allOptions.size();
        System.out.println(sizeOfOpts);
        for (WebElement element:allOptions){
            String itemName=element.getText();
            System.out.println("option name is : " + itemName);
        }

    }
    public void getSingleItem(){
        Actions builder = new Actions(driver);
        builder.moveToElement(menuItemWomen).build().perform();
        System.out.println("option name is : " + itemWomen.getText());
    }

}







