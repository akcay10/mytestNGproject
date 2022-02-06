package techproed.tests.smoketest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.RegistrationPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day15_RegistrationTest {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    public void registrationTest() throws IOException, InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        Thread.sleep(2000);
        registrationPage.ssn.sendKeys("12134");
        registrationPage.lastname.sendKeys("ak");
        registrationPage.firstname.sendKeys("una");
        registrationPage.address.sendKeys("calgaryt");
        registrationPage.mobilephone.sendKeys("403999999");
        registrationPage.username.sendKeys("akc");
        registrationPage.email.sendKeys("unalak@hotmail.com");
        registrationPage.firstPassword.sendKeys("%B6B*q1!TH");
        registrationPage.secondPassword.sendKeys("%B6B*q1!TH");
        registrationPage.registerButton.click();
       ReusableMethods.getScreenshot("RegistrationPage");

    }
    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}