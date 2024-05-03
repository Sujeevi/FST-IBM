import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumActivity4 {
    private static Object Assertions;

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/input-events");

        System.out.println(driver.getTitle());

        WebElement box = driver.findElement(By.xpath("//*[@id=\"D3Cube\"]"));
        box.click();
        WebElement header = driver.findElement(By.className("active"));
        System.out.println(header.getText());

        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly

        driver.close();

    }
}




