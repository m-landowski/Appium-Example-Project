package pl.appium.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppFactory {
    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities capabilities;


    public static void Android_LaunchApp() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.android.dialer");
        capabilities.setCapability("appActivity", ".app.DialtactsActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        AppDriver.setDriver(driver);
        System.out.println("--------- Android driver is set");

    }

    public static void iOS_LaunchApp() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformVersion", "13.5");
        capabilities.setCapability("bundleId", "io.cloudgrey.the-app");
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        AppDriver.setDriver(driver);
        System.out.println("--------- iOS driver is set");

    }

    public static void closeApp() {
        System.out.println("--------- ");
        driver.quit();
    }
}
