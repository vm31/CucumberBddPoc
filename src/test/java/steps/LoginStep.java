package steps;

import base.BaseTest;
import cucumber.api.java.en.*;
import org.openqa.selenium.Cookie;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginStep extends BaseTest {

    @Given("I click on login icon")
    public void i_click_on_login_icon() {
        loginPageObj.clickOnLoginIcon();

    }

    @When("I enter email id is {string} and password is {string}")
    public void i_enter_email_id_and_password(String email_id, String password) throws IOException {
        loginPageObj.enterEmailId(util.readPropertyFile(email_id));
        loginPageObj.enterPassword(util.readPropertyFile(password));

        // create file named Cookies to store Login Information
        File file = new File("Cookies.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for (Cookie ck : driver.manage().getCookies()) {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
                driver.manage().addCookie(new Cookie("currency", "1"));
                // Get cookie details with named cookie 'currency'
                Cookie cookie1 = driver.manage().getCookieNamed("currency");
                System.out.println(cookie1);



            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @When("I click on login button")
    public void i_click_on_login_button() {
        //util.waitForElement(loginPageObj.clickOnLoginBtn());
        loginPageObj.clickOnLoginBtn();

    }

}
