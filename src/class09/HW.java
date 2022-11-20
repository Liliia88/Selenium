package class09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class HW {
    public static void main(String[] args) {
        /*
got to the url
click on PIM
click on Employee List
from the table choose one id (it must be from the first page)
and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
         */
        // create a WebDriver instance
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
        List<WebElement> idOFPeople = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));

        for (int i = 0; i < idOFPeople.size(); i++) {
            String id = idOFPeople.get(i).getText();
            if (id.equalsIgnoreCase("44965A")) {
                System.out.println(i);
                System.out.println("the index of the row which contains 44965A is " + (i+1));
                WebElement btn = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]"));
                //WebElement btn = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr/td[1]")); - it works too.
                btn.click();
                // }else{
                //      driver.findElement(By.xpath("//a[text()='Next']")).click();
                //  }

            }
        }

    }}