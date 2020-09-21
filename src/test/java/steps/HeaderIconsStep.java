package steps;

import base.BaseTest;
import cucumber.api.java.en.And;

public class HeaderIconsStep extends BaseTest {
    @And("I verify login icon is displayed")
    public void iVerifyLoginIconIsDisplayed() {
        headerIconsPageObj.isLoginIconDisplayed();

    }
}
