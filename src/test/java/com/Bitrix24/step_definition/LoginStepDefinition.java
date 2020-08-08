package com.Bitrix24.step_definition;

import com.Bitrix24.pages.BasePage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {
   public LoginPage loginPage=new LoginPage();

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrix24_url"));
    }




    @Then("User logs in as {string}")
    public void user_logs_in_as(String role) {
       loginPage.login(role);
    }

    @And("User navigate to {string}")
    public void userNavigateTo(String modulname) {
     loginPage.navigateTO(modulname);// loginpage extends basepage o yuzden
    }
}
