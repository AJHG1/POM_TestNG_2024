package sda.pages.HomeWork;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utlitiles.Driver;

public class HWLoginFacebook {

    public HWLoginFacebook() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Faker faker = new Faker();

    //Email or phone number filed
    @FindBy(id = "email")
    public WebElement emailField;

    //password filed
    @FindBy(id = "pass")
    public WebElement passwordField;

    //login button
    @FindBy(xpath = "//*[@data-testid='royal_login_button']")
    public WebElement loginButton;

    // Error massage filed
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement errorMess;

    // use The faker class to login user name and password ---- the click in login
    public void loginFakeClassTOfeacbook() {
        emailField.sendKeys(faker.internet().emailAddress());
        passwordField.sendKeys(faker.internet().password());
        loginButton.click();

    }

}

