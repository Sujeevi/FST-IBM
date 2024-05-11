
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.By.className;

public class testng_9 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

    }


    @BeforeMethod
    public void beforeMethod() {
        driver.switchTo().defaultContent();
    }


    @Test
    public void Salert() {
        WebElement simplealert = driver.findElement(By.id("simple"));
        simplealert.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Reporter.log(alert.getText());
        alert.accept();
    }

    @Test
    public void Calert() {
        WebElement confirmationalert = driver.findElement(By.id("confirm"));
        confirmationalert.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Reporter.log(alert.getText());
        alert.accept();
    }

    @Test
    public void Palert() {
        //Find the username and password fields
        WebElement promptalert = driver.findElement(By.id("prompt"));
        promptalert.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Reporter.log(alert.getText());
        alert.accept();
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}




