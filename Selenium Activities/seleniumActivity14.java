//open a browser to https://v1.training-support.net/selenium/tables
//get the title and print it to the console
//using xpaths on the first table:
//- Find the number of rows and columns in the table and print them
//- find and print all the cell values in the third row of table
//-find and print all cell value at the 2nd tow 2nd column
import org.apache.poi.ss.formula.functions.Column;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;


public class seleniumActivity14 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/tables");

        System.out.println(driver.getTitle());
        List<WebElement> rowsNumber = driver.findElements(By.xpath("*//table[@class='ui celled striped table']/tbody/tr"));
        int rowCount;
        rowCount = rowsNumber.size();
        System.out.println("No of rows in this table : " + rowCount);

        List<WebElement> columnsNumber = driver.findElements(By.xpath("*//table[@class='right aligned collapsing']/tbody/td"));
        int columnCount;
        columnCount = columnsNumber.size();
        System.out.println("No of columns in this table : " + columnCount);

    driver.close();


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




