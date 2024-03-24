package sda.pages.HomeWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utlitiles.Driver;

public class HWebayserch {

//Day20:HW04
    //// Navigate to https://www.ebay.com/
    //// Perform a search after typing {search_keyword} in the search box
    //// Add the first product in the search results to the cart
    //// Go to the cart
    //// Increase the quantity of the purchased product to {quantity}
    //// Verify the total amount in the cart should be calculated as unit productPrice * quantity

    public HWebayserch() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Actions actions = new Actions(Driver.getDriver());


    // xpath gor search filed
    @FindBy(xpath = "//*[@id='gh-ac']")
    public WebElement searchfiled;

//xpath for add to cart button
    @FindBy(xpath = "//*[.='Add to cart']")
    public WebElement item;


    @FindBy(xpath = "//*[@class='ux-call-to-action__cell'][.='Add to cart']")
    public WebElement addcart;

    public void loginFakeClassTOfeacbook() {
        searchfiled.sendKeys("iphone");
        item.click();
        addcart.click();

    }
}