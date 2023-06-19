package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

    public class ChromeBrowser {
        public static void main(String[] args) throws InterruptedException {
            String baseurl = "https://courses.ultimateqa.com/users/sign_in";
//Set up the Chrome browser
            WebDriver driver = new ChromeDriver();
            // open the URL into Browser
            driver.get(baseurl);
            //Get the Title of the page

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            String title = driver.getTitle();
            System.out.println("Page Title is " + title);
            //Get the current URL
            driver.getCurrentUrl();
            System.out.println("Current URL " + driver.getCurrentUrl());
            // Get Page Source
            System.out.println("Page Source : " + driver.getPageSource());

            //Find the Email field Element
            WebElement emailField = driver.findElement(By.name("user[email]"));
            //Type the email address to the email field
           emailField.sendKeys("Shweta123@gmail.com");
            //Find the password and Type the Password to the password field
            driver.findElement(By.name("user[password]")).sendKeys("1234");
            Thread.sleep(5000);
            driver.close();
        }
    }



