package class08;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class HW {
    public static void main(String[] args) {
        /*
go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  go to https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //click on checkbox and click on remove
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        WebElement btnRemove = driver.findElement(By.xpath("//button[text()='Remove']"));
        btnRemove.click();
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        //verify the text
        WebElement btnMessage = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(btnMessage.getText()); //"It's gone"
       //click on enable
        WebElement btnEnable = driver.findElement(By.xpath("//button[text()='Enable']"));
        btnEnable.click();
       //verify the textbox is enabled

        //expilicit
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//enter text
        WebElement typeText = driver.findElement(By.xpath("//input[@type='text']"));
        typeText.sendKeys("Soon I'll find a job!");

        WebElement btnText = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(btnText.getText()); //"its enabled"
        System.out.println(btnText.isEnabled());


        //and click disable
        WebElement clickDisable = driver.findElement(By.xpath("//button[text()='Disable']"));
        clickDisable.click();
        //verify the textbox is disabled
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement btnText2 = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(btnText2.getText());  //it's disabled
        if(btnText2.getText().equalsIgnoreCase("It's disabled!")){
            System.out.println(btnText2.getText());
        } else {
            System.out.println("false");
        }


    }
}
