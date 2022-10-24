package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//COMMAND ENTER make the imports automatically
public class MaximizeWindow {
    public static void main(String[] args) {
        //go to google.com
        //maximize your window
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //create instance of Webdriver
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("https://www.google.com/");
        //maximize
        driver.manage().window().maximize();
        //fullscreen
        driver.manage().window().fullscreen();
        //quit
        driver.quit();
        //comment
    }
}
