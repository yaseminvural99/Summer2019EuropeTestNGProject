package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo{
    public static void main(String[] args) throws InterruptedException{
        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //import class CMD+enter or Alt+Enter or Control+Space
        //selenium object
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
       // Thread.sleep(3000);

        driver.navigate().to("http://www.facebook.com");
        //goes back to previus webpage
        driver.navigate().back();

      // Thread.sleep(3000);
        //goes forward after back
        driver.navigate().forward();

        //refresh the page
        driver.navigate().refresh();
    }
}
