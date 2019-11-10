package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://amazon.com");

        WebElement searhBox=driver.findElement(By.id("twotabsearchtextbox"));
        searhBox.sendKeys("Selenium");
       // WebElement searchButton=driver.findElement(By.xpath("//*[@type='submit']"));  or
        WebElement searchButton=driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();
        WebElement results=driver.findElement(By.xpath("//span[contains(text(),'result for']"));
        results.click();
    }
}
