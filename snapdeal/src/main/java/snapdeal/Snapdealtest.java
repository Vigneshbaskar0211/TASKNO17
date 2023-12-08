package snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdealtest {

    public static void main(String[] args) {
        // Set the path to ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Snapdeal website
        driver.get("https://www.snapdeal.com/");
        // Locate the Sign In button
        WebElement signInButton = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));

        // Move the cursor to the Sign In button and click
        Actions action = new Actions(driver);
        action.moveToElement(signInButton).click().perform();
        
        WebElement LoginInButton = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(LoginInButton).click().perform();


        // Wait for the email field to be visible and enter a valid email
       WebElement emailField = driver.findElement(By.id("userName"));

        Actions actions1 = new Actions(driver);
        actions1.moveToElement(emailField).click().perform();
        emailField.click();

        emailField.sendKeys("vigneshbaskar020511@gmail.com");

        // Click on Continue button
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\'checkUser\']"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(continueButton).click().perform();
        continueButton.click();
        

        // Close the browser
        driver.quit();
    }
}