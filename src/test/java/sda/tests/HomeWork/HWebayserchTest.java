package sda.tests.HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;
import sda.pages.HomeWork.HWebayserch;
import sda.utlitiles.Driver;

public class HWebayserchTest {
     Actions addcart;
     Actions item;
     Actions searchfiled;

    //Day20:HW04
    //// Navigate to https://www.ebay.com/
    //// Perform a search after typing {search_keyword} in the search box
    //// Add the first product in the search results to the cart
    //// Go to the cart
    //// Increase the quantity of the purchased product to {quantity}
    //// Verify the total amount in the cart should be calculated as unit productPrice * quantity

    @Test
    public void ebay() throws InterruptedException {

        HWebayserchTest ebayserch = new HWebayserchTest();
        Driver.getDriver().get("https://www.ebay.com/");
        ebayserch.searchfiled.sendKeys("iphone", Keys.ENTER);

        ebayserch.item.click();
        Thread.sleep(5000); // This is to wait for the cart operation. Prefer explicit waits in real scenarios.
        ebayserch.addcart.click();
        Assert.assertEquals(0, "Total price does not match expected calculation.");

    }
}

