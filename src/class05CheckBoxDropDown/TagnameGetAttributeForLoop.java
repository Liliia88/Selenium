package class05CheckBoxDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagnameGetAttributeForLoop {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //get all the links i.e. anchor tags from the website
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
        //print the size of the list
        System.out.println("the size of the list :"+ebayLinks.size());
        //implementing a for loop to traverse through the list of WebElements
        for(WebElement ebaylink:ebayLinks){
         //  extracting the value of attribute href because it contains the link embedded in the Webelement
        String link = ebaylink.getAttribute("href");
        //  print the link
            System.out.println(link);

        }
        }

}
