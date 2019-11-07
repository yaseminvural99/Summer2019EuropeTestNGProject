package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput=driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("Mike Smith");

        WebElement emailInput =driver.findElement(By.name("email"));
        emailInput.sendKeys("yasemin.vural99@gmail.com");

        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";
        WebElement messageElement=driver.findElement(By.name("signup_message"));

       //String actualMessage=messageElement.getAttribute("value"); you can use instead of gettext method
       String actualMessage=messageElement.getText();
        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage: "+expectedMessage);
            System.out.println("actualMessage: "+actualMessage);

        }
        Thread.sleep(3000);
        driver.quit();







    }
}
