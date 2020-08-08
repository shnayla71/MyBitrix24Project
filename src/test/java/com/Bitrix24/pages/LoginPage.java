package com.Bitrix24.pages;

import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

;

public class LoginPage extends BasePage{
    private final static Logger logger = Logger.getLogger(LoginPage.class);

    @FindBy(name = "USER_LOGIN")
    private WebElement email;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    public void login() {
        String usernameString = ConfigurationReader.getProperty("username");
        String passwordString = ConfigurationReader.getProperty("password");
        email.sendKeys(usernameString);
        password.sendKeys(passwordString, Keys.ENTER);
        //don't print password at work
        logger.info("Login with "+usernameString+" username and "+passwordString+" password");
//        System.out.println("Login with "+usernameString+" username and "+passwordString+" password");
    }
    public void login(String role){
        role=role.toLowerCase();//role hr,marketing,helpdesk
        String usernameString=ConfigurationReader.getProperty("email."+role);
        String passwordString=ConfigurationReader.getProperty("password");
        email.sendKeys(usernameString);
        password.sendKeys(passwordString,Keys.ENTER);
        logger.info("Logins as "+role);
    }
}


