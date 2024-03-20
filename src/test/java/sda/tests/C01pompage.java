package sda.tests;

import org.testng.annotations.Test;
import sda.utlitiles.driver;

import java.sql.Driver;

public class C01pompage {

    @Test
    public void test(){
        driver.getDriver().get("https://www.google.com");

    }
}
