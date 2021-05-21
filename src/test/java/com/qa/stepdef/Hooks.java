package com.qa.stepdef;

import com.qa.utils.ServerManager;
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

import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class Hooks {

    public static WebDriver wdriver;
    static AppiumDriver<MobileElement> driver;


    @Before
    public static void initialize(Scenario scenario) throws Exception {
        String testtype = scenario.getName().substring(0,3);

    if(testtype.equalsIgnoreCase("mob")) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "ANDROID");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("deviceName", "SM A505F");
        caps.setCapability("udid", "RZ8M301ZBTL");
        //caps.setCapability("app", "apps/selendroid-test-app-0.17.0.apk");
        caps.setCapability("appPackage", "io.selendroid.testapp");
        caps.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");

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
        } else {

            try {

                byte[] screenshot = ((TakesScreenshot) wdriver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png", scenario.getName());


            } catch (Exception e) {
                System.out.println(e.toString());
            }

            wdriver.quit();

        }
    }
}
