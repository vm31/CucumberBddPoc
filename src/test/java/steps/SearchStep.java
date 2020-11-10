package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SearchStep extends BaseTest {


    @And("I print all options in women section{string}")
    public void iPrintAllOptionsInWomenSection(String text) {
        logger = Logger.getLogger("justForYourOutFit");
        PropertyConfigurator.configure("log4j.properties");
        logger.info("printing all items in women section");

        //searchPageObj.printListOFElements(text);

        searchPageObj.getSingleItem();


    }


}
