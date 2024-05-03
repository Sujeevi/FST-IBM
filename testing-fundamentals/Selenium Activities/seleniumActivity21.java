//https://v1.training-support.net/selenium/tab-opener
//get the title and print it to the console
//find the button to open a new tab and click it
//wait for new tab to open
//print all the handles
//switch to newly opened tab print its title and heading
//repeat the steps by clicking the button in the new page
//close the browser


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class seleniumActivity21 {

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/tab-opener");

        driver.manage().window().maximize();

        driver.getTitle();

        driver.findElement(By.id("launcher")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.numberOfWindowsToBe((2)));

        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);

        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));

        driver.findElement(By.id("actionButton")).click();

        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);

            System.out.println(handle);
            driver.close();
        }

    }
}

