package com.IMDb;

import org.junit.Assert;
import org.junit.Test;

public class ImdbTest extends WebDriverSettings {


    @Test
    public void firstTest() {
        /*This test will iterate through the whole list of top 250 movies
        Tested features: 1. Number of movies should be 250, not more, not less
                         2. Page after loading has a correct title
                         3. Each movie link from the list redirects to the correct movie page
         */
        for (int i = 1; i < 251; i++) {
            //opening the tested page
            driver.get("http://www.imdb.com/chart/top?ref_=nv_mv_250_6");

            //Checking that the Top250 movies web page opened
            Top250 top250 = new Top250(driver);
            Assert.assertTrue(top250.isInitialized());

            //As long as the movie list is a table, only one value from the XPath will change between the list, it will be used as iterator i
            String movieXpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[" + i + " ]/td[2]/a[1]";
            String yearXpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[" + i + "]/td[2]/span[1]";

            //Putting the name and year of release of the movie into variables
            String movieName = driver.findElementByXPath(movieXpath).getText();
            String movieYear = driver.findElementByXPath(yearXpath).getText();

            //Creating the log of the process
            System.out.println(i);
            System.out.println(movieName);
            System.out.println(movieYear);

            //Clicking the movie link
            driver.findElementByXPath(movieXpath).click();

            //Checking that the clicked link redirected to the correct page
            MoviePage moviePage = new MoviePage(driver);
            Assert.assertTrue((moviePage.isInitialized(movieName + " " + movieYear + " - IMDb")));
        }

    }


}
