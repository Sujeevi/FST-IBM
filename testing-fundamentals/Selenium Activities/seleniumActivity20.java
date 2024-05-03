// ACTIVITY 20:
// Using Selenium:
// Open a new browser to https://v1.training-support.net/selenium/javascript-alerts
// Get the title of the page and print it to the console.
// Find the button to open a PROMPT alert and click it.
// Switch the focus from the main window to the Alert box and get the text in it and print it.
// Type "Awesome!" into the prompt.
// Close the alert by clicking Ok.
// Close the browser.

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class seleniumActivity20{

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        System.out.println(driver.getTitle());
        WebElement promptbutton = driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
        promptbutton.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Awesome");
        alert.accept();
        System.out.println("Accepted");

        driver.close();
        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly

    }
}








