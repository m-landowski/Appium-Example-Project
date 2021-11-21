package pl.appium.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class TestBase {

    @BeforeTest
    public void setUp() throws MalformedURLException {
        AppFactory.Android_LaunchApp();
    }

    @AfterTest
    public void teraDown(){
        AppFactory.closeApp();
    }

}
