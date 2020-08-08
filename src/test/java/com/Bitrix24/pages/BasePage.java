package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;


public class BasePage {
    private final static Logger logger = Logger.getLogger(BasePage.class);
    protected WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void navigateTO(String modulname){
        String xpath="//span[contains(text(),'"+modulname+"') and @class='menu-item-link-text']";
        wait.until(ExpectedConditions.presenceOfElementLocated( By.xpath(xpath))).click();
     logger.info("Navigating to: "+modulname);

    }
}
