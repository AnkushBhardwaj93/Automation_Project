package com.qa.stepdef;

import com.qa.pages.mobilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPageStepDefinitions {


    @Given("^application is launched$")
    public void iLaunchMyApplication() throws InterruptedException {
        System.out.println("Starting app in connected device using before method");

    }

    @Then("^click on continue on firstpage$")
    public void clickOnContinueOnFirstpage() {
        new mobilePage().clickContinue();

    }
    @Then("^click Ok on notification$")
    public void clickOkOnNotification() {
        new mobilePage().acceptNotification();

    }
    @Then("^click on Display a Toast$")
    public void clickOnDisplayAToast() {
        new mobilePage().clickOnTost();

    }
    @Then("^verify Toast text$")
    public void verifyToastText() {

    }

    @Then("click on pop-up button")
    public void clickOnPopUpButton() {
       new mobilePage().clickOnShowPop();
    }
    @Then("click on Dismiss")
    public void clickOnDismiss() {

    }
    @Then("click on progress Bar")
    public void clickOnProgressBar() {
        new mobilePage().clickOnProgressBar();
    }

    @Then("click on unhandled Exception")
    public void clickOnUnhandledException() {
        new mobilePage().clickonUnhandledException();
    }
    @Then("verify page title")
    public void verifyPageTitle() {

    }

}
