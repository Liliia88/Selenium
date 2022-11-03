package class04CssSelectorGetDispl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW2CssGetText {
    public static void main(String[] args) throws InterruptedException {
        /*
        HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

Hint:
you can use if else condition for verification of message
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //create the Webdriver instance
        WebDriver driver = new ChromeDriver();
        //goto syntaxProject.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        WebElement username=driver.findElement(By.cssSelector("input[id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement login=driver.findElement(By.cssSelector("input[id='btnLogin']"));
        login.click();
        Thread.sleep(2000);
        WebElement message= driver.findElement(By.cssSelector("span#spanMessage"));
        String text = message.getText();
        boolean displayStatus = message.isDisplayed();
        if(displayStatus) {
            System.out.println("The text on message is: " + text);
        } else{
            System.out.println("The text on message is undefined");
        }
//..
    }
}
