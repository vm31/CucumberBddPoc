package steps;

import base.BaseTest;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;

public class HomePageStep extends BaseTest {


    @Given("I am on home page")
    public void i_am_on_home_page() {
        driver.get("https://www.justyouroutfit.com");

    }

    @And("I verify home page logo")
    public void i_verify_home_page_logo() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePageObj.verifyHomePageLogo());
        System.out.println(homePageObj.verifyHomePageLogo());

    }



}
