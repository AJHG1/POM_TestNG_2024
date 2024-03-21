package sda.pages.sauceDemo;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utlitiles.Driver;

public class FacebookLoginPage {

    //Go to https://www.facebook.com/
//Log in (faker class)
//Test the "Failed to login" message
    public FacebookLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Log in (faker class)
    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement loginbutton;

    public void login(Faker name, Faker password) {
Faker faker = new Faker();

        loginbutton.click();
    }
}