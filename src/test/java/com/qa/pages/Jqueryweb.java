package com.qa.pages;

import com.qa.stepdef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Jqueryweb extends Hooks{

public Jqueryweb(){
    this.wdriver = wdriver;
}

By draggable = By.xpath("//a[@href='https://jqueryui.com/draggable/']");
By elementToBeDragged = By.xpath(("//div[@id='draggable']"));
By iframe = By.xpath("//iframe[@class=\"demo-frame\"]");
By selectable =By.xpath("//a[@href=\"https://jqueryui.com/selectable/\"]");
By itemList=By.xpath("//*[@class=\"ui-widget-content ui-selectee\"]");
By controlgroup=By.xpath("//a[@href='https://jqueryui.com/controlgroup/']");
By automatic_radio=By.xpath(".//label[@for = \"transmission-automatic\"]");
By insurance_radio=By.xpath(".//label[@for = \"insurance\"]");
By standard_checkbox=By.xpath(".//label[@for = \"transmission-standard-v\"]");
By insurance_checkbox=By.xpath(".//label[@for = \"insurance-v\"]");


    public void setDraggable() {
        wdriver.findElement(draggable).click();

    }

    public void setElementToBeDragged()  {
        Actions act = new Actions(wdriver);
        act.dragAndDropBy(wdriver.findElement(elementToBeDragged), 700,150);


    }

    public void setSelectable() {
        wdriver.findElement(selectable).click();
    }

    public void switchtoiframe()throws InterruptedException{
        Thread.sleep(5000);
        wdriver.switchTo().frame(wdriver.findElement(iframe));

    }

    public void selectElements(){
        List<WebElement> elements =  wdriver.findElements((itemList));
        elements.get(0).click();
        elements.get(2).click();
        elements.get(6).click();
       // wdriver.findElement(By.xpath("//li[contains(text(),'Item 3')]")).click();
    }

    public void setControlgroup() {
        wdriver.findElement(controlgroup).click();
    }

    public void selectOptions(){
        try {
            wdriver.findElement(automatic_radio).click();
            wdriver.findElement(insurance_radio).click();
            wdriver.findElement(standard_checkbox).click();
            wdriver.findElement(insurance_checkbox).click();
        }catch(Exception e){ System.out.println(e.toString());}


    }
}
