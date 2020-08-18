package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HeaderIconsPage;
import pages.HomePage;

public class BaseTest {
    protected HomePage homePageObj;
    public static WebDriver driver;
    protected HeaderIconsPage headerIconsPageObj;




    public BaseTest(){
        homePageObj= PageFactory.initElements(driver, HomePage.class);
        headerIconsPageObj=PageFactory.initElements(driver, HeaderIconsPage.class);

    }

}
