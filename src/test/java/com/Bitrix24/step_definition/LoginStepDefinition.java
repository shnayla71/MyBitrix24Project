package com.Bitrix24.step_definition;

import com.Bitrix24.pages.LoginPages;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinition {

    LoginPages loginPages=new LoginPages();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrix24_url"));

    }
        @Then("User logs in username and password")
        public void user_logs_in_username_and_password () {

        loginPages.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPages.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPages.rememberMe.click();
        loginPages.loginBttn.click();

        }
        @Then("User sees  Portal title")
        public void user_sees_portal_title () {
         String actualTitle=Driver.getDriver().getTitle();
         String expectedTitle="Portal";

            Assert.assertEquals(actualTitle,expectedTitle);

        }
        @Then("User clicks more and selects file")
        public void user_clicks_more_and_selects_file () throws InterruptedException{

            WebElement moreBttn=Driver.getDriver().findElement(By.xpath("//*[@id=\"feed-add-post-form-link-text\"]"));
            moreBttn.click();
            Thread.sleep(2000);
            WebElement selectFiles=Driver.getDriver().findElement(By.xpath("//span[.='File']"));
            selectFiles.click();

        }
        @Then("User clicks on upload files and pictures from local diskis")
        public void user_clicks_on_upload_files_and_pictures_from_local_diskis () throws InterruptedException{
            Thread.sleep(2000);
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15, 100);
            WebElement uploadFileElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[3]")));
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].style.left='0'", uploadFileElement);
            uploadFileElement.sendKeys("/Users/bilalsahin/Desktop/pupy.jpg");
            Thread.sleep(2000);
        }
        @Then("User downloads from external drive")
        public void user_downloads_from_external_drive (){

        }
        @Then("User selects documents bitrix24")
        public void user_selects_documents_bitrix24 () {

        }
        @Then("User creates file to upload")
        public void user_creates_file_to_upload () {

        }

    }
