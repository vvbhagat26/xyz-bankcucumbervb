package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());
    //locators
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement  customerNameDropDown;

    @CacheLookup
    @FindBy(id = "currency" )
    WebElement currencyDropDown;

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Process']" )
    WebElement  processButton;

    //methods
    public void selectCustomerDropDown(){
        selectByVisibleTextFromDropDown(customerNameDropDown,"Ron Weasly");
        log.info("Click on button"+customerNameDropDown.toString());
    }
    public void selectCurrencyDropDown(){
        selectByValueFromDropDown(currencyDropDown,"Pound");
        log.info("select currency"+currencyDropDown.toString());
    }
    public void clickOnProcess(){
        clickOnElement(processButton);
        log.info("Click on button"+processButton.toString());
    }
    public String getSuccessTextFromAlert(){
        return getTextFromAlert();
    }
}
