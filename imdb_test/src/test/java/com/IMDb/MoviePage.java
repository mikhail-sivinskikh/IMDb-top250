package com.IMDb;

import org.openqa.selenium.WebDriver;

//This class is a PageObject for the Top250 Movie page
public class MoviePage extends PageObject {
    public MoviePage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized(String movie) {
        //Checking that the correct web page has opened by validating the Title
        String title = driver.getTitle();
        return title.equals(movie);
    }
}
