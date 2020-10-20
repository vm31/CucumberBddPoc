package helper;





import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Properties;

public class Utility {
    public WebDriver driver;
   static Properties prop = new Properties();

    public Utility(WebDriver driver) {
    }

    //method for reading property file
    public String readPropertyFile(String propertyName) throws IOException {
        String propertyValue = null;
        try {
            InputStream input = new FileInputStream("data.properties");
            prop.load(input);
           propertyValue= prop.getProperty(propertyName);
        } catch (Exception e) {
            e.printStackTrace();
        }return propertyValue;
    }


    // method to set value in property file
    public String updatePropertyValue(String upName) throws IOException {
        String pName="abcdefg@gmail.com";
        FileInputStream in = null;
        try {
            in = new FileInputStream("data.properties");
            prop.load(in);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("data.properties");
            prop.setProperty("EMAIL",pName);
            prop.store(out, null);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }return pName;


    }
    public WebElement waitUntilElementVisible(WebElement locator){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(locator));
        return locator;
    }




}
