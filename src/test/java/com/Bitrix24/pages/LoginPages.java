package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
    public LoginPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(id="USER_REMEMBER")
    public WebElement rememberMe;

    @FindBy(xpath="//input[@class='login-btn']")
    public WebElement loginBttn;
}
