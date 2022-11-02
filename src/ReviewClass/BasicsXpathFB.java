package ReviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsXpathFB {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create a Webdriver instance
        WebDriver driver=new ChromeDriver();
        // use the get() function to open up the required website
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@id,'u')]")).click();
        //driver.quit();

    }
}
