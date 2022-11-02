package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1cssSelectorDisplayed {
    /*
    Open chrome browser. Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there on the top right corner
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //create the Webdriver instance
        WebDriver driver = new ChromeDriver();
        //goto syntaxProject.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.cssSelector("input[id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.cssSelector("input[id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login=driver.findElement(By.cssSelector("input[id='btnLogin']"));
        Thread.sleep(2000);
        login.click();
        WebElement messageWelcome = driver.findElement(By.cssSelector("a[id='welcome']"));
        boolean displayStatus = messageWelcome.isDisplayed();
        System.out.println("The message Welcome Admin is Displayed :"+displayStatus);
    }
}
