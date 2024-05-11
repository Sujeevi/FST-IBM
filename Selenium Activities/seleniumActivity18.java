//open a browser to https://v1.training-support.net/selenium/selects
//get the title and print it to the console
//on multiselect:
//-select the "JavaScript"option using the visible text
//-select 4th,5th,6th options using index
//-select "NodeJs" option using the value
//-deselect the 5th option using index

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class seleniumActivity18{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/selects");

        System.out.println(driver.getTitle());
        WebElement js = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/select/option[8]"));
        js.click();
        WebElement dropdown= driver.findElement(By.xpath(("//*[@id=\"single-select\"]")));
        Select select = new Select(dropdown);

        List<WebElement> options = select.getOptions();
        select.selectByIndex(3);
        select.selectByIndex(3);
        select.selectByIndex(3);
        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly

    }
}






