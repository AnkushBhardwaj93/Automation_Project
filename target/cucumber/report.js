$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/jqueryui.feature");
formatter.feature({
  "name": "Verify actions on jquery website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "web_Verify User is able to drag and drop a element",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Navigated to Draggable Interaction Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.userNavigatedToDraggableInteractionPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User perform drag and drop",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.userPerformDragAndDrop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "element drag and drop wworked",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.elementDragAndDropWworked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "web_Verify user can click on item1, item 3, item7",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Navigated to Selectable Interaction Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.userNavigatedToSelectableInteractionPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Selected items",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.userSelectedItems()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "item should get selected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.itemShouldGetSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "web_verify user can select  control group options",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Navigated to controlGroup Interaction Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.userNavigatedToControlGroupInteractionPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select group items",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.userSelectGroupItems()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "group items should get selected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.WebInteractionsStepDefinations.groupItemsShouldGetSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});