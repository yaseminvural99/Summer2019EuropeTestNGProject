package day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class basic_navigation {

    public static void main(String[]args) {

        //we have to setup based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        //creating object for using selenium driver
        WebDriver driver=new ChromeDriver();
        //open browser

        driver.get("https://amazon.com");
        //driver.get("https://www.cybertekschool.com");
        //driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

    }
}
