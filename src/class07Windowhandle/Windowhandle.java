package class07Windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //task: goto gmail and get the window handle
        //got gmail signup page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        //get the window handle for the current page
        String gmailHandle = driver.getWindowHandle();
        System.out.println("the handle of the current page is "+gmailHandle);
    }
}
