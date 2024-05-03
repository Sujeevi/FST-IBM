//https://v1.training-support.net/selenium/popups
//print the title of the page
//find the sign in button and hover over it. print the tooltip message
//click the button to open sign in form
//Enter the credentials
//-username:admin
//-password:password
//click login and print the message on the page after logging in

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class seleniumActivity22{
    
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/popups");

        System.out.println(driver.getTitle());
        ///html/body/div[2]/div/div/div[2]/div[2]/button
        WebElement signinbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/button"));
        signinbutton.click();
        WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        user.sendKeys("admin");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));;
        pass.sendKeys("password");
        ///html/body/div[4]/div/div[2]/div/div/button
        WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/button"));
        loginbutton.click();

        WebElement input=driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        System.out.print(input.getText());

        driver.close();

        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly

    }
}










