package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Xpath by contains partially
        driver.findElement(By.xpath("//a[contains(@class,'btn-success')]")).click();
        Thread.sleep(2000);
        //Xpath by starts-with
       // driver.findElement(By.xpath("//a[starts-with(@class,'list')]")).click();
                //make unique 1 way
        driver.findElement(By.xpath("//a[@class='list-group-item'][1]")).click();
                //make unique 2 way
        //driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();
        //Xpath by attribute value
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Have a good night, babies");
        //Xpath by text
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
