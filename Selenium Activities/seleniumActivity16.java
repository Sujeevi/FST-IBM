//open a browser to https://v1.training-support.net/selenium/dynamic-attributes
//get the title and print it to the console
//find the input fields of sign up form
//fill in the details in field with your own data
//wait for success message to appear and print it to the console


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumActivity16{
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

        Actions action = new Actions(driver);

        //wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // get the title of the page
        System.out.println(driver.getTitle());

        //find field of signup form
        WebElement signUpUserName = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
        WebElement signUpPwd = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
        WebElement signUpConfirmPwd = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input"));
        WebElement signUpEmail = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));

        //Filling details in signup form
        signUpUserName.sendKeys("admin");
        signUpPwd.sendKeys("password");
        signUpConfirmPwd.sendKeys("password");
        signUpEmail.sendKeys("admin@test.com");

        //Find the signup button
        WebElement signUpButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button"));

        //Click the button
        signUpButton.click();

        //wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

        //find message text
        WebElement text = driver.findElement(By.id("action-confirmation"));
        System.out.println(text.getText());

        // exit browser
        driver.close();
    }
}





















