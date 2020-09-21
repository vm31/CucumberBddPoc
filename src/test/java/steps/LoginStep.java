package steps;

import base.BaseTest;
import cucumber.api.java.en.*;

import java.io.IOException;

public class LoginStep extends BaseTest {

    @Given("I click on login icon")
    public void i_click_on_login_icon() {
        loginPageObj.clickOnLoginIcon();

    }

    @When("I enter email id is {string} and password is {string}")
    public void i_enter_email_id_and_password(String email_id, String password) throws IOException {

        //loginPageObj.enterEmailId(util.readPropertyFile(email_id));
        loginPageObj.enterEmailId(util.updatePropertyValue(email_id));
        loginPageObj.enterPassword(util.readPropertyFile(password));

    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        //util.waitForElement(loginPageObj.clickOnLoginBtn());
        loginPageObj.clickOnLoginBtn();

    }

}
