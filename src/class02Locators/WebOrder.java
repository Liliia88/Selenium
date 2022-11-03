package class02Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create a Webdriver instance
        WebDriver driver=new ChromeDriver();
        //goto smart bear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize the window
        driver.manage().window().maximize();
        //enter the user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(("Tester"));
        //enter the Password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //click login
        driver.findElement(By.className("button")).click();
        //Make sure the title is correct i.e. Web Orders

        // get the title of the page
       String title=driver.getTitle();
        System.out.println(title);
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The title is correct: "+ title);
        } else {
            System.out.println("The title is incorrect: "+title);
        }

    }
}
