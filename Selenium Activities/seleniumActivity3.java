import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumActivity3 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
        WebElement input = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println(input.getText());
        WebElement hue = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println(hue.getCssValue("color"));

        WebElement violetButton = driver.findElement(By.cssSelector(".ui.violet.button"));
        System.out.println(violetButton.getAttribute("class"));


        driver.close();

    }
}



