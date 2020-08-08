package com.Bitrix24.step_definition;

import com.Bitrix24.pages.ActivityStreamPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class ActivityStepDefinition {
    ActivityStreamPage activityStreamPage=new ActivityStreamPage();
    @When("user cliks on send message button")
    public void user_cliks_on_send_message_button() {
    activityStreamPage.clickOnSendMessage();
    }

    @When("uploads following file:")
    public void uploads_following_file(Map<String,String> dataTable) {
        activityStreamPage.uploadFile(dataTable.get("File path"));
    }
    @Then("user click on send button")
    public void user_click_on_send_button() {
      activityStreamPage.clickOnSendButton();
    }



}
