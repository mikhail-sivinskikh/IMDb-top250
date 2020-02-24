package com.IMDb;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

//This class is responsible for setting up the web driver functioning
public class WebDriverSettings {
    public OperaDriver driver;

    //This method manages settings before running the test
    @Before
    public void setUp() {
        //You will need to download operadriver on your PC and set the correct path to it in the next line
        System.setProperty("webdriver.opera.driver", "C:/operadriver/operadriver.exe");
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //This method deletes cookies and closes browser after test is finished
    @After
    public void close() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
