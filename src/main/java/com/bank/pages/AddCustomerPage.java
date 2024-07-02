package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    //locators
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement fName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode ;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickAddCustomer;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement popUpclickOk;



    //methods
    public void addfName(){
        sendTextToElement(fName,"Ron");
        log.info(" enter "+fName.toString());
    }
    public void addlName(){
        sendTextToElement(lName,"Weasly");
        log.info(" enter "+lName.toString());
    }
    public void addPostCode(){
        sendTextToElement(postCode,"HA2 0AD");
        log.info(" enter "+postCode.toString());
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(clickAddCustomer);
        log.info("Click on button"+clickAddCustomer.toString());
    }
    public void clickOnOKButtonInAlert() {
        acceptAlert();
    }
    public String getSuccessTextFromAlert(){
        return getTextFromAlert();
    }

}
