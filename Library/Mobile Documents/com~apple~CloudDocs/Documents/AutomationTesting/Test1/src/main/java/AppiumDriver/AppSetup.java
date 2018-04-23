package AppiumDriver;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;


public class AppSetup {

    public AppiumDriver driver;
    public WebDriverWait wait;

    URL serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
    public AppSetup() throws MalformedURLException {
    }

    public void Setup(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "***");
        capabilities.setCapability("platformVersion", "***");
        capabilities.setCapability("appPackage", "***");
        capabilities.setCapability("appActivity", "***");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("skipUnlock", true);

        driver = new AndroidDriver(serverUrl,capabilities);

        if (driver != null) {
            System.out.println("driver is not null");
        }
    }

}
