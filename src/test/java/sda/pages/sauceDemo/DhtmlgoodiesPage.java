package sda.pages.sauceDemo;

import org.openqa.selenium.support.PageFactory;
import sda.utlitiles.Driver;

public class DhtmlgoodiesPage{

    public DhtmlgoodiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
