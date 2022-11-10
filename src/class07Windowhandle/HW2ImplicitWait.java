package class07Windowhandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class HW2ImplicitWait {
    /*
    *********************HomeWork 2*********************************
*********************Implicit wait**************************
1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
2. click on get New User
3. get the firstname  of user and print it on console
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();
        WebElement btn = driver.findElement(By.xpath("//button[@type='button']"));
        btn.click();
        WebElement fname = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String text = fname.getText();
        System.out.println(text);
    }
}
