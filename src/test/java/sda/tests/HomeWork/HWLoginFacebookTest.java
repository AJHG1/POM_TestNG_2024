package sda.tests.HomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;
import sda.pages.HomeWork.HWLoginFacebook;
import sda.utlitiles.ConfigReader;
import sda.utlitiles.Driver;

public class HWLoginFacebookTest {


    //login to facebook by useing faker class
    // -----> in the (pages folder we defin the element the username and password and login button and Error massage)
    // we dfin the Url or any kay and value in the folder(config.properties)
    @Test
    public void login() {

        HWLoginFacebook facebookLoginPage = new HWLoginFacebook();

        //Go to https://www.facebook.com/
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));


        //Log in (faker class)
        // Method which have all the sing in fields with faker class

        facebookLoginPage.loginFakeClassTOfeacbook();


        Assert.assertTrue(facebookLoginPage.errorMess.isDisplayed());
    }
}

