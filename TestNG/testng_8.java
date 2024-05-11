//Activity7 Test
//https://v1.training-support.net/selenium/simple-form
//Using data provider, use 3 sets of data to fill up and submit simple form in one test case.
//Remove data provider part to a separate class and use that to populate the test cases in separate
//test classes using either subclassing and the import method.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
//import org.testng.annotations.DataProvider;

public class testng_8 extends dataforact8{
    // Declare the WebDriver object
    WebDriver driver ;

    @BeforeClass (alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    @Test (dataProvider = "Information")
    public void exampleTestCase(String fname, String lname, String email, String number, String message) {
//        System.out.println("username: " + username + "Password: " + password);

        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        WebElement emailaddress = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement num = driver.findElement(By.xpath("//*[@id=\"number\"]"));
        WebElement msg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea"));
        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input"));
        WebElement clearBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[2]"));


        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        emailaddress.sendKeys(email);
        num.sendKeys(number);
        msg.sendKeys(message);

        submitBtn.click();

        driver.switchTo().alert().accept();

        //clear fields
        clearBtn.click();
    }

    @AfterClass (alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}