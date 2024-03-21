package sda.tests;

import org.testng.annotations.Test;
import sda.utlitiles.ConfigReader;
import sda.utlitiles.Driver;

public class C03UseConfigReader {

// Go to Amazon
// Go to google
// Use configReader class

    @Test
    public void configReaderTest() throws InterruptedException {

        // Go to Amazon
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Thread.sleep(2000);
        // Go to google
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Thread.sleep(2000);
        // Use configReader class

        Driver.closeDriver();
    }

}
