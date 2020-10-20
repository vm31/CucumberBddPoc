package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SearchStep extends BaseTest {


    @And("I print all options in women section")
    public void iPrintAllOptionsInWomenSection() {

        //searchPageObj.printListOFElements();

        searchPageObj.getSingleItem();

    }
}
