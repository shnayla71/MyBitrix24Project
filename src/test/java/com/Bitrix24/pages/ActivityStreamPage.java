package com.Bitrix24.pages;

import com.Bitrix24.utilities.BrowserUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class ActivityStreamPage extends BasePage{

    @FindBy(id="microoPostFormLHE_blogPostForm_inner")
    private WebElement sendMessageInputBox;

    @FindBy(css="[title='Upload files']")
    private WebElement uploadFilesIcon;

    @FindBy(name="bxu_files[]")
    private WebElement uploadFilesAndImages;
    @FindBy(id="blog-submit-button-save")
    private WebElement sendButton;

    public void clickOnSendMessage(){
        wait.until(ExpectedConditions.visibilityOf(sendMessageInputBox)).click();
    }
    public void uploadFile(String filePath){
        filePath=System.getProperty("user.dir")+"/"+filePath.replace("/", File.separator);
       wait.until(ExpectedConditions.visibilityOf(uploadFilesIcon)).click();
        BrowserUtility.waitfor(2);
        uploadFilesAndImages.sendKeys(filePath);

    }
    public void clickOnSendButton(){
        wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
    }
}
