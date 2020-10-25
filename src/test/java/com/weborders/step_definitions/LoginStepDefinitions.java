package com.weborders.step_definitions;

import com.weborders.pages.HomePage;
import com.weborders.pages.LoginPage;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user in on the landing page")
    public void user_in_on_the_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

    @When("user logs in")
    public void user_logs_in() {
       loginPage.login();
    }

    @Then("user should see see {string} page title")
    public void user_should_see_see_page_title(String string) {
        String actualTitle = homePage.getHomePageText();
        Assert.assertEquals(string, actualTitle);

    }


}
