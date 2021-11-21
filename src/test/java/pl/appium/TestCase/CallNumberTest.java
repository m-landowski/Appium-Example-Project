package pl.appium.TestCase;

import org.testng.annotations.Test;
import pl.appium.PageObject.ContactPage;
import pl.appium.base.TestBase;


public class CallNumberTest extends TestBase {

    @Test
    public void setNumberTest() throws InterruptedException {
        System.out.println("---------  Start Tes");
        ContactPage contactPage = new ContactPage();
        contactPage.setBtnNumber();
    }
}
