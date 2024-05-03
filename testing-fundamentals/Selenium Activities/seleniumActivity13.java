import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumActivity13 {
    private static Object Assertions;

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        System.out.println(driver.getTitle());


        WebElement input = driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
        input.isEnabled();

        if (input.isEnabled()
        ) {
            System.out.println("box is Enabled.");
        } else {
            System.out.println("box is not Enabled.");
        }

        WebElement inputb = driver.findElement(By.xpath("//*[@id=\"toggleInput\"]"));
        inputb.click();

        if (inputb.isEnabled()) {
            System.out.println("text is enabled.");
        } else {
            System.out.println("text is not enabled.");
        }

    driver.close();;

//
//
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[1]/div[1]/label")));
//        System.out.println("box is delayed");


        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly

    }
}



