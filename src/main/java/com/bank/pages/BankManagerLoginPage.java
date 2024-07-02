package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    //locators
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement clickOnOpenAccount;

    //Methods
    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerTab);
        log.info("Click on button"+addCustomerTab.toString());
    }
    public void clickOnOpenAccount(){
        clickOnElement(clickOnOpenAccount);
        log.info("Click on button"+clickOnOpenAccount.toString());
    }
}
