package com.qa.pages;

import com.qa.stepdef.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class mobilePage extends Hooks {

    public mobilePage(){
        this.driver = driver;
    }


    @AndroidFindBy(id="com.android.permissioncontroller:id/continue_button")
    private MobileElement continueButton;
    @AndroidFindBy(id="io.selendroid.testapp:id/buttonStartWebview")
    private MobileElement ChromeView;
    @AndroidFindBy(id="io.selendroid.testapp:id/startUserRegistration")
    private MobileElement fileLogo;
    @AndroidFindBy(id="io.selendroid.testapp:id/waitingButtonTest")
    private MobileElement progressBar;
    @AndroidFindBy(id="io.selendroid.testapp:id/showPopupWindowButton")
    private MobileElement showPopup;
    @AndroidFindBy(id="io.selendroid.testapp:id/showToastButton")
    private MobileElement tost;
    @AndroidFindBy(id="io.selendroid.testapp:id/exceptionTestButton")
    private MobileElement unhandledException;
    @AndroidFindBy(id="io.selendroid.testapp:id/exceptionTestField")
    private MobileElement unhandledExceptionfield;



    public void clickContinue(){
        try {
            continueButton.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void acceptNotification(){
        try {
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public  void clickonChromeImage()  {
        try {
            ChromeView.click();
         }catch (Exception e){
        e.printStackTrace();
    }
    }

    public  void TaponFileLogo()  {
        try{
            fileLogo.click();
           }catch (Exception e){
        e.printStackTrace();
    }
    }
    public  void clickOnProgressBar() {
        try {
            progressBar.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void clickOnShowPop() {
        try {
            showPopup.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void clickOnTost() {
        try {
            tost.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void clickonUnhandledException() {
        try {
            unhandledException.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void unhandledExceptionField() {
        try {
            unhandledExceptionfield.sendKeys("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}
