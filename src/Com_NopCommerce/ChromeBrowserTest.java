package Com_NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into the Browser
        driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().maximize();

        //we give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //Getting Source, Url and title
        System.out.println("Page title is : " + driver.getTitle());
        System.out.println("Page url is : " + driver.getCurrentUrl());
        System.out.println("Page Page source is : " + driver.getPageSource());

        //Entering the email in the field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("Asdf@gmail.com");

        //Entering the Password in the field
        WebElement pass = driver.findElement(By.id("Password"));
        pass.sendKeys("Asdfasdf@12");

        //We give Implicit wait for 3 secs
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //close the browser
        driver.close();
    }
}