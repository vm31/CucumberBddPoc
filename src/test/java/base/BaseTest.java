package base;

import helper.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HeaderIconsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected HomePage homePageObj;
    public static WebDriver driver;
    protected HeaderIconsPage headerIconsPageObj;
    protected LoginPage loginPageObj;
    protected SearchPage searchPageObj;
    protected Utility util;




    public BaseTest(){
        homePageObj= PageFactory.initElements(driver, HomePage.class);
        headerIconsPageObj=PageFactory.initElements(driver, HeaderIconsPage.class);
        loginPageObj=PageFactory.initElements(driver, LoginPage.class);
        searchPageObj=PageFactory.initElements(driver, SearchPage.class);
        util=PageFactory.initElements(driver, Utility.class);

    }

}
