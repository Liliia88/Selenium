package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//GOT TO FB.COM
/*
Enter username
enter password
click login
 */

public class LocatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create a Webdriver instance
        WebDriver driver=new ChromeDriver();
        //goto fb,com
        driver.get("https://www.facebook.com/");
        //enter the Username in the TextBOX
        //1. locate the element and send keys
        driver.findElement(By.id("email")).sendKeys("ABRACADABRA");
        // enter the password in the textBox
        driver.findElement(By.name("pass")).sendKeys("sdjksjdksjd");
        //click the login
        driver.findElement(By.name("login")).click();
    }
}
