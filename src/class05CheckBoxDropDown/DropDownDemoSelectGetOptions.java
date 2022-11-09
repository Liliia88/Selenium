package class05CheckBoxDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemoSelectGetOptions {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //maximize
        driver.manage().window().maximize();
        //find the WebElement dropdown by looking for select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));
        //use Select class
        Select select = new Select(dropDown);

       //There are 3 options to select!!!
//        select an option by index
        select.selectByIndex(5);
        Thread.sleep(3000);
        //select by visible text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
        //select by value
        select.selectByValue("Sunday");
        //get all the options available in the dropdown

        Thread.sleep(3000);
        List<WebElement> options = select.getOptions();
      //traverse through the options
       for(int i=0;i<options.size();i++){

       WebElement option = options.get(i);
        String text =option.getText();
        if(text.equalsIgnoreCase("Friday")){
        select.selectByIndex(i);
       }

    }
}}