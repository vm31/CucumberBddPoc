package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePageStep extends BaseTest {


    @Given("I am on home page")
    public void i_am_on_home_page() {
        driver.get("https://www.justyouroutfit.com");
        System.out.println(driver.getCurrentUrl());


    }

    @And("I verify home page logo")
    public void i_verify_home_page_logo(){
        Assert.assertTrue(homePageObj.verifyHomePageLogo());
        System.out.println(homePageObj.verifyHomePageLogo());
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        JavascriptExecutor jse = ((JavascriptExecutor)driver);

        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }


    @Then("I get all the menu items on homepage")
    public void iGetAllTheMenuItemsOnHomepage() {
        homePageObj.getOptions();
    }

    @When("I select menu item {string}")
    public void iClickOn(String pname) {
        //homePageObj.getOptions();
        //homePageObj.clickOnOption(pname);
        homePageObj.getMenuItem(pname);
    }

    @Then("I verify current url:{string}")
    public void iVerifyCurrentUrl(String arg0) {
        Assert.assertEquals(arg0, driver.getCurrentUrl());
    }
}
