//open a browser to https://v1.training-support.net/selenium/tables
//get the title and print it to the console
//using xpaths on the second table:
//- Find the number of rows and columns in the table and print them
//- find and print all the cell value at 2nd row 2nd column
//-click the header of first column to sort by name
//-find and print the cell value at the 2nd row 2nd column
//-print the cell values of the table footer
import org.apache.poi.ss.formula.functions.Column;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;


public class seleniumActivity15 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/tables");

        System.out.println(driver.getTitle());
        List<WebElement> rowsNumber = driver.findElements(By.xpath("*//table[@class='ui sortable celled table']/tbody/tr"));
        int rowCount;
        rowCount = rowsNumber.size();
        System.out.println("No of rows in this table : " + rowCount);

        List<WebElement> columnsNumber = driver.findElements(By.xpath("*//table[@class='ui sortable celled table']/tbody/tr[1]/td"));
        int columnCount;
        columnCount = columnsNumber.size();
        System.out.println("No of columns in this table : " + columnCount);

        WebElement columnx = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/tbody/tr[2]/td[3]"));
        columnx.getText();
        System.out.println(columnx.getText());
        WebElement clicker = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/thead/tr/th[1]"));
        clicker.click();
        System.out.println("The header is clicked");
        WebElement footer = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/tfoot/tr"));
        footer.getText();
        System.out.println(footer.getText());
        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly

    }
}





