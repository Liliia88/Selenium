package class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1Facebook {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Lili");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Petrova");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kate.petrova@gmzil.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("kate.petrova@gmzil.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("lili88");
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        //use Select class
        Select select = new Select(month);
        select.selectByVisibleText("Jan");
        Thread.sleep(2000);
        WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
        Select select2 = new Select(date);
        select2.selectByIndex(3);
        Thread.sleep(2000);
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select select3 = new Select(year);
        select3.selectByValue("1988");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@class='_58mt']")).click();
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        }
        }

