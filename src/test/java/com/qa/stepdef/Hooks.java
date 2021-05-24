package com.qa.stepdef;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.net.URL;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



public class Hooks {

    public static WebDriver wdriver;
    public static AppiumDriver<MobileElement> driver;
    private static Properties properties;
    private final String propertyFilePath= System.getProperty("user.dir")+"/src/main/resources/config.properties";
    FileInputStream fileInput = null;


    public void ConfigFileReader() {
        BufferedReader reader;
        try {
            File file = new File(propertyFilePath);
            fileInput = new FileInputStream(file);

            properties = new Properties();
            try {
                properties.load(fileInput);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }


        @Before
    public static void initialize(Scenario scenario) throws Exception {
            Hooks hooks = new Hooks();
            hooks.ConfigFileReader();
        String testtype = scenario.getName().substring(0,3);

    if(testtype.equalsIgnoreCase("mob")) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", properties.getProperty("platformName"));
        caps.setCapability("platformVersion", properties.getProperty("platformVersion"));
        caps.setCapability("deviceName", properties.getProperty("deviceName"));
        caps.setCapability("udid", properties.getProperty("udid"));
        //caps.setCapability("app", "apps/selendroid-test-app-0.17.0.apk");
        caps.setCapability("appPackage", properties.getProperty("appPackage"));
        caps.setCapability("appActivity", properties.getProperty("appActivity"));
        caps.setCapability("autoAcceptAlerts", true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, caps);

        System.out.println("Mobile Application started");
    }
        else if(testtype.equalsIgnoreCase("web")) {

            wdriver = new ChromeDriver();
            wdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            System.out.println("********Starting chrome browser web validation********");
            wdriver.get("https://jqueryui.com/");

        }

        else if(testtype.equalsIgnoreCase("rst")){
        System.out.println("********Starting rest assured validation********");
    }



    }


@After
    public void quit(Scenario scenario) throws IOException {
        String testtype = scenario.getName().substring(0, 3);

        if (testtype.equalsIgnoreCase("rst")) {
            System.out.println("*********Stopping rest assured validation*********");
        } else if (testtype.equalsIgnoreCase("web")){

            try {

                byte[] screenshot = ((TakesScreenshot) wdriver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());


            } catch (Exception e) {
                System.out.println(e.toString());
            }
            finally {
                wdriver.quit();
            }



        } else if(testtype.equalsIgnoreCase("mob")){
            try {

                byte[] screenshot = ((TakesScreenshot) wdriver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());


            } catch (Exception e) {
                System.out.println(e.toString());
            }
            finally {
                driver.quit();
            }


        }
    }
}
