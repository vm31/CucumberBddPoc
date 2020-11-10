package pages;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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


    public void printListOFElements(String text)  {
        Actions builder = new Actions(driver);
        builder.moveToElement(menuItemWomen).build().perform();
        List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"mainMenu\"]//a[@href='/womens/']/../div/ul/li/a"));
        int sizeOfOpts = allOptions.size();
        System.out.println(sizeOfOpts);
        try {
            for (WebElement element : allOptions) {
                String itemName = element.getText();
                //System.out.println("option name is : " + itemName);
                if (element.getText().equalsIgnoreCase(text)) {
                    System.out.println(element);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void getSingleItem(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        //throws TimeoutException if element does not become as clickable in given time
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@id='mainMenu']/ul/li/a[@href='/womens/']")));
        Actions builder = new Actions(driver);
        builder.moveToElement(menuItemWomen).build().perform();
        String name= itemWomen.getText();
        char[] ch=name.toCharArray();
        for (char c:ch){
            System.out.println(c);
        }

    }

}







