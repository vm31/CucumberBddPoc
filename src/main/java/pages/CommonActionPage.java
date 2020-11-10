package pages;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CommonActionPage {
    public WebDriver driver;
    public Utility util;


    public CommonActionPage(WebDriver driver) {

        this.driver = driver;
        this.util=new Utility(driver);

    }


    public void click(WebElement element){
        element.click();
        System.out.println(element);
    }
    public void click(By locator) {
        click(driver.findElement(locator));

    }


    public void sendKeys(WebElement element,String value) {
        element.sendKeys(value);


    }
    public void getUrl(String url){
        driver.get(url);
    }
    public String getCurrentUrl(){
       String currentUrl= driver.getCurrentUrl();
       return currentUrl;
    }
    public String getTitle(String s){
        String title=driver.getTitle();
        return title;
    }






}
