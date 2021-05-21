package com.qa.stepdef;

import com.qa.pages.Jqueryweb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebInteractionsStepDefinations {

    @Given("^User Navigated to Draggable Interaction Page$")
    public void userNavigatedToDraggableInteractionPage() {
        new Jqueryweb().setDraggable();

    }

    @When("^User perform drag and drop$")
    public void userPerformDragAndDrop() throws InterruptedException {
        new Jqueryweb().switchtoiframe();
        new Jqueryweb().setElementToBeDragged();

    }

    @Then("^element drag and drop wworked$")
    public void elementDragAndDropWworked() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^User Navigated to Selectable Interaction Page$")
    public void userNavigatedToSelectableInteractionPage() {
        new Jqueryweb().setSelectable();

    }


    @When("^User Selected items$")
    public void userSelectedItems() throws InterruptedException {
        new Jqueryweb().switchtoiframe();
        new Jqueryweb().selectElements();

    }
    @Then("^item should get selected$")
    public void itemShouldGetSelected() {

    }

    @Given("^User Navigated to controlGroup Interaction Page$")
    public void userNavigatedToControlGroupInteractionPage() {

        new Jqueryweb().setControlgroup();
    }

    @When("^User select group items$")
    public void userSelectGroupItems() throws InterruptedException {

      new Jqueryweb().switchtoiframe();
      new Jqueryweb().selectOptions();
    }

    @Then("^group items should get selected$")
    public void groupItemsShouldGetSelected() {

    }

}
