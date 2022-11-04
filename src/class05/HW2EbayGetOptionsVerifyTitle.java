package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2EbayGetOptionsVerifyTitle {
    public static void main(String[] args) throws InterruptedException {
        /*
       1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement allCategories = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        //use Select class
        Select select = new Select(allCategories);
       // select.selectByVisibleText("Antiques");

        List<WebElement> options = select.getOptions();
        //traverse through the options
        for (int i = 0; i < options.size(); i++) {

            WebElement option = options.get(i);
            String text = option.getText();
            //or String text = option.getText().getText();
            System.out.println(text);
            if(text.equalsIgnoreCase("Computers/Tablets & Networking")){
                select.selectByIndex(i);
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Search']")).click();
//verify the title

        String title=driver.getTitle();
        System.out.println(title);
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("The title " + title+" is varified");
        } else {
            System.out.println("The title " + title+" is not varified");
        }

    }}