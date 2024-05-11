//open a browser to https://v1.training-support.net/selenium/javascript-alerts
//get the title and print it to the console
//find the button to open a CONFIRM alert and click it
//switch the focus from the main window to the alert box and get the text in it and print it
//close the alert once with ok and again with cancel
//close the browser

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class seleniumActivity19{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        System.out.println(driver.getTitle());

        WebElement confbutton = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        confbutton.click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println("accepted");
        confbutton.click();
        alert.dismiss();
        System.out.println("dismissed");
        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly

    }
}







