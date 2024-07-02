package com.bank.steps;

import com.bank.pages.AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class WithDrawSteps {
    @And("click on Withdraw")
    public void clickOnWithdraw() {
        new AccountPage().clickOnWithdraw();
    }

    @And("click on Withdraw button")
    public void clickOnWithdrawButton() {
        new AccountPage().clickOnWithdrawButton();
    }

    @Then("I verify Transction successful")
    public void iVerifyTransctionSuccessful() {
        Assert.assertEquals(new AccountPage().verifyWithdrawtMsg(),"Transaction successful","Mismatch");
    }

    @And("enter amount")
    public void enterAmount() {
        new AccountPage().withdrawAmount();
    }
}
