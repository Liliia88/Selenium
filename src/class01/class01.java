package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class01 {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create a Webdriver instance
        WebDriver driver=new ChromeDriver();
        // use the get() function to open up the required website
        driver.get("https://www.google.com/");
        //get the url of the website
        String url=driver.getCurrentUrl();
        // print the url
        System.out.println("The current URL loaded in browser is: "+url);
        // get the title
        String title=driver.getTitle();
        //print the title
        System.out.println("The current title of the page is: "+title);
        //close the chrome
        driver.quit();
        driver.close();
    }
}
