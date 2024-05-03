import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class seleniumActivity7{
    private static Object Assertions;

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/drag-drop");

        System.out.println(driver.getTitle());

        WebElement ball=driver.findElement(By.id("draggable"));
        Actions action = new Actions(driver);
        WebElement drag
                = driver.findElement(By.id("draggable"));
        WebElement drop
                = driver.findElement(By.id("droppable"));
        action.dragAndDrop(drag, drop)
                .build()
                .perform();
        WebElement drop2
                = driver.findElement(By.id("dropzone2"));
        action.dragAndDrop(drop, drop2)
                .build()
                .perform();

        Actions builder = new Actions(driver);
        WebElement dz1op = drop.findElement(By.tagName("p"));
        System.out.println(dz1op.getText()+"left");
        builder.clickAndHold(drag).moveToElement(drop2).release().perform();
        WebElement dz2op = drop2.findElement(By.tagName("p"));
        System.out.println(dz2op.getText()+"right");


        // Perform testing and assertions
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.close();

    }
}





