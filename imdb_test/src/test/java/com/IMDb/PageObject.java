package com.IMDb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//This is the PageObject class
public class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
