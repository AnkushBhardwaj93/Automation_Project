package com.qa.stepdef;

import com.qa.pages.restAssuredPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class restAssuredStepDefination {

    @Given("^launch \"([^\"]*)\"$")
    public void launch(String endpoint) {
        new restAssuredPage().setUrl(endpoint);
    }

    @Then("^verify status code as \"([^\"]*)\"$")
    public void verifyStatusCodeAs(int statuscode) {
        new restAssuredPage().verifystatuscode(statuscode);

    }

    @Then("^verify firstname as \"([^\"]*)\"$")
    public void verifyFirstnameAs(String fname) {

        new restAssuredPage().getfirstname(fname);
    }

    @Then("^verify post api status code as \"([^\"]*)\"$")
    public void verifyPostApiStatusCodeAs(int statuscode) {
         new restAssuredPage().postApiStatusCode(statuscode);
    }




    @Then("^verify new created id is genrated$")
    public void verifyIdIsGenrated() {
        new restAssuredPage().verifynewidcreated();

    }


}
