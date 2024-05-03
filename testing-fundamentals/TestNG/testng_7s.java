import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class testng_7s {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(value = " -> new", pure = true)
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][]{
                {"admin","password"},
                {"user1","pass"}
    };
}

@Test(dataProvider ="Authentication")
public void testCase1(String Username,String Password) {
    //This test case will pass
    WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
    user.sendKeys(Username);

    WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    pass.sendKeys(Password);

    WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
    login.click();

    user.clear();
    System.out.println("The credentials are correct");
    pass.clear();
    System.out.println("The credentials are incorrect");
}

@AfterClass
public void afterMethod() {
    //Close the browser
    driver.close();

}

;
}

