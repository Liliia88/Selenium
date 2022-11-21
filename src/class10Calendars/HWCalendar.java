package class10Calendars;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class HWCalendar {
    /*
    Go to syntax hrms .
Go-to the recruitment tab.
From the calendar  just select a date
8 August 2023
     */
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //click on PIM
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();

        driver.findElement(By.xpath("//b[text()='Recruitment']")).click();

        WebElement calendar = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendar.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement monthBtn = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(monthBtn);
        select.selectByVisibleText("Aug");

        WebElement yearBtn = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select2 = new Select(yearBtn);
        select2.selectByValue("2023");

        boolean isFound = false;
        while (!isFound) {
        List<WebElement> dateBtn = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for (WebElement date:dateBtn){
                String currentDate = date.getText();
                if(currentDate.equalsIgnoreCase("8")){
                    date.click();
                    break;
                }
            }
            System.out.println("Date, 8 August 2023, is found");
            isFound=true;
        }



    }
}