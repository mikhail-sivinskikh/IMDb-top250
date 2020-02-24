package com.IMDb;

import org.openqa.selenium.WebDriver;

//This class is a PageObject for the Top250 IMDb page
public class Top250 extends PageObject {

    public Top250(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        //Checking that the correct web page has opened by validating Title
        String title = driver.getTitle();
        return title.equals("IMDb Top 250 - IMDb");
    }
}
