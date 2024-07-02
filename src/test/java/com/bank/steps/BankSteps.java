package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import com.bank.pages.OpenAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BankSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @And("I click on Add customer tab")
    public void iClickOnAddCustomerTab() {
    new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("enter FirstName")
    public void enterFirstName() {
       new AddCustomerPage().addfName();
    }

    @And("enter LastName")
    public void enterLastName() {
    new AddCustomerPage().addlName();

    }

    @And("enter PostCode")
    public void enterPostCode() {
        new AddCustomerPage().addPostCode();
    }

    @And("I click on Add customer button")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("I click on ok from the alert")
    public void iClickOnOkFromTheAlert() {
        new AddCustomerPage().clickOnOKButtonInAlert();
    }

    @And("I verify message Customer added")
    public void iVerifyMessageCustomerAdded() {
        Assert.assertEquals(new AddCustomerPage().getSuccessTextFromAlert().substring(0,27),"Customer added successfully","error");
    }

    @Then("I click on ok button on popup")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnOKButtonInAlert();
    }

    @When("I click on Bank Manger login tab")
    public void iClickOnBankMangerLoginTab() {
        new HomePage().clickOnManagerlogin();
    }






    @And("I click on Open account tab")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccount();
    }

    @And("Search customer that created in first test")
    public void searchCustomerThatCreatedInFirstTest() {
        new OpenAccountPage().selectCustomerDropDown();
    }

    @And("select currency")
    public void selectCurrency() {
        new OpenAccountPage().selectCurrencyDropDown();
    }

    @And("click on process")
    public void clickOnProcess() {
        new OpenAccountPage().clickOnProcess();
    }

    @And("I verify message Account created")
    public void iVerifyMessageAccountCreated() {
        Assert.assertEquals(new OpenAccountPage().getSuccessTextFromAlert().substring(0,28),"Account created successfully","Mismatch");
    }


}
