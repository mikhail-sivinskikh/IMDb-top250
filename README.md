# IMDb-top250
This is a repository for a test task for MalwareBytes where I did some test automation using Selenium WD against IMDb Top250 movies page.

To run the tests you should do the following preparations:
1 install Opera Browser
2 download the operadriver for Selenium https://github.com/operasoftware/operachromiumdriver/releases 
(make sure you extracted the files from the archive)
3 copy the path for the operadriver executable
4 open the \imdb_test\src\test\java\com\IMDb\WebDriverSettings.java
5 in the lane 17 change the value "C:/operadriver/operadriver.exe" into the path to the operadriver on your PC, which you got on the step 3. Make sure you leave the quote signs when inserting the path
6 open and run \imdb_test\src\test\java\com\IMDb\ImdbTest.java
It will run the test in Opera browser and close it in the end.


