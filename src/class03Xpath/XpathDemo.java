package class03Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //create the Webdriver instance
        WebDriver driver = new ChromeDriver();
        //go to google.com
        driver.get("https://www.facebook.com/");
        // enter the username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadabra");
        //click  on forgot password
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
    }
}
