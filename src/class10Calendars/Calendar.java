package class10Calendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://www.delta.com/");
        //maximize
        driver.manage().window().maximize();

        //click on the calendar
        WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();
       //get the month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

       boolean isFound=false;

       while(!isFound){
           String monthName= month.getText();

           if(monthName.equalsIgnoreCase("March")){
               //get all the dates from the table
               List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
               //traverse through the list to find your desired date
               for (WebElement date:dates){
                   String currentDate = date.getText();
                   if(currentDate.equalsIgnoreCase("15")){
                       date.click();
                       break;
                   }
               }
               System.out.println("March is found");
               isFound=true;

           }
           else{
               driver.findElement(By.xpath("//span[text()='Next']")).click();
           }
       }

      }}
