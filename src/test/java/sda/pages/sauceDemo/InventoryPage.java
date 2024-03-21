package sda.pages.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import sda.utlitiles.Driver;

public class InventoryPage {

    //Navigate to https://www.saucedemo.com/
    //Enter the user name as standard_user
    //Enter the password as secret_sauce
    //Click on login button.
    //        - Choose price low to high with soft Assert.
    //        - Verify item prices are sorted from low to high with hard Assert.
    public InventoryPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(tagName = "select")
    public WebElement drobDowen;


    @FindBy(xpath = "//span[@class='active_option']")
    public WebElement selecetdOprion;


    public void selectByindex(int index) {

        Select select = new Select(drobDowen);
        select.selectByIndex(index);
    }

    public void selectByvisibleText(String text) {

        Select select = new Select(drobDowen);
        select.selectByVisibleText(text);
    }

    public String getTextOfSelectedOption() {

        return selecetdOprion.getText();
    }

}
