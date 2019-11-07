package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeLink =driver.findElement(By.className("nav-link"));
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //lazy way
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        // common way
        WebElement messageElement =driver.findElement(By.tagName("h3"));
        String message=messageElement.getText();
        System.out.println(message);

    }
}
