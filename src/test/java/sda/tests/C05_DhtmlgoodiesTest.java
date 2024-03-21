package sda.tests;

import org.testng.annotations.Test;
import sda.pages.sauceDemo.DhtmlgoodiesPage;
import sda.pages.sauceDemo.InventoryPage;
import sda.pages.sauceDemo.LoginPage;
import sda.utlitiles.ConfigReader;
import sda.utlitiles.Driver;

public class C05_DhtmlgoodiesTest {

// Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
// Fill in capitals by country.

    @Test
    public void pageObjectsTest() {

        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();


        Driver.getDriver().get(ConfigReader.getProperty("sauceDemoUrl"));
    }
}