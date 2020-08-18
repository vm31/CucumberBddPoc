package steps;

import base.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseTest {
    @Before
    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver","libraries//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @After
    public void TearDown(){
        driver.quit();
    }
}
