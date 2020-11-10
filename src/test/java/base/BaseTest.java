package base;

import helper.Utility;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class BaseTest {
    protected HomePage homePageObj;
    public static WebDriver driver;
    protected HeaderIconsPage headerIconsPageObj;
    protected LoginPage loginPageObj;
    protected SearchPage searchPageObj;
    protected Utility util;
    protected CommonActionPage commonActionPageObj;
    public static Logger logger;




    public BaseTest(){
        homePageObj= PageFactory.initElements(driver, HomePage.class);
        headerIconsPageObj=PageFactory.initElements(driver, HeaderIconsPage.class);
        loginPageObj=PageFactory.initElements(driver, LoginPage.class);
        searchPageObj=PageFactory.initElements(driver, SearchPage.class);
        util=PageFactory.initElements(driver, Utility.class);
        commonActionPageObj=PageFactory.initElements(driver, CommonActionPage.class);

    }


    public void getLogs(){

    }

}
