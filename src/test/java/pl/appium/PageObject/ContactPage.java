package pl.appium.PageObject;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.appium.base.AppDriver;

public class ContactPage {
    public ContactPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
    }

    @FindBy(id = "com.android.dialer:id/fab")
    private WebElement buttonGoKeyboard;

    @FindBy(id = "com.android.dialer:id/five")
    private WebElement btnSetFive;

    @FindBy(id = "com.android.dialer:id/dialpad_floating_action_button")
    private WebElement btnSetnNUmber;


    public void  setBtnNumber() throws InterruptedException {
        Thread.sleep(5000);
        buttonGoKeyboard.click();
        btnSetFive.click();
        btnSetnNUmber.click();
    }
}
