package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
        // make sure clear for the chrome window
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       // WebElement homeLink=driver.findElement(By.xpath("/html/body/nav/ul/li/a "));
     //  homeLink.click();
       // WebElement button1=driver.findElement(By.xpath("//button[@onclick='button1()'] "));
       // button1.click();

       // driver.get("http://practice.cybertekschool.com/sign_up");
       // WebElement signUpButton=driver.findElement(By.xpath("//button[.='Sign Up']"));
       // signUpButton.click();


    }
}
