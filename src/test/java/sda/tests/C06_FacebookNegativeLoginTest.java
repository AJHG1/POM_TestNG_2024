package sda.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import sda.pages.sauceDemo.FacebookLoginPage;
import sda.utlitiles.ConfigReader;
import sda.utlitiles.Driver;

public class C06_FacebookNegativeLoginTest {

    //Go to https://www.facebook.com/
//Log in (faker class)
//Test the "Failed to login" message
    @Test
    public void Test() {

        //Go to https://www.facebook.com/
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
    }


    //Log in (faker class)
    @FindBy(id = "email")
    public WebElement login;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement password;

    @Test
    public void teest(){

        FacebookLoginPage loginPage = new FacebookLoginPage();
        String url = "";

        Driver.getDriver()
    }
}
