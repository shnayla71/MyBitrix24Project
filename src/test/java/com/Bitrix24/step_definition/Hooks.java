package com.Bitrix24.step_definition;

import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks {
    private final static Logger logger = Logger.getLogger(String.valueOf(Hooks.class));

    @Before
    public void setup() {
        logger.info("::: Starting automation :::");
        logger.info("Browser type: "+ ConfigurationReader.getProperty("browser"));
        logger.info("URL: "+ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            logger.info("Taking a screenshot");
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
        logger.info("::: Ending automation :::");
    }
}
