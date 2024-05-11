//
//add 4 @test methods
//in first @Test method, use getTitle() to get and assert the title of the page
//in the 2nd @Test method, use findElement() to look for the black button
//For the third @Test method skip it by setting its enabled parameter to false
//for the fourth @Test method skip it by throwing a Skip Exception inside the method
// the fourth method will be skipped and it will be shown as skipped

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.By.className;

public class testng_3 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void loginTest() {
        //Find the username and password fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        //Enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");

        //Click login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}



