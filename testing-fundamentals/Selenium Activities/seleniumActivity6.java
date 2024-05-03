import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class seleniumActivity6 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());

        WebElement name=driver.findElement(By.tagName("body"));
        name.sendKeys("S");

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("A").perform();
        action.keyDown(Keys.CONTROL).sendKeys("C").perform();

        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.close();

    }
}




