package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.Cookie;

public class CookieStep extends BaseTest {
    @Given("I open Url {string}")
    public void i_open_Url(String url) {
        driver.get(url);

    }

    @And("I get all cookies")
    public void i_get_all_cookies() {
        System.out.println(driver.manage().getCookies());

        // Get cookie details with named cookie '_octo'
        Cookie cookie1 = driver.manage().getCookieNamed("_octo");
        System.out.println(cookie1);




    }

}
