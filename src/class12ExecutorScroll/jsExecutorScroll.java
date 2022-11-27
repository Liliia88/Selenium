package class12ExecutorScroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class jsExecutorScroll {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //        scroll down
        JavascriptExecutor js= (JavascriptExecutor) driver; //initialize instance JavascriptExecutor
        js.executeScript("window.scrollBy(0,500)"); //to exectute whatever you put
        Thread.sleep(2000);
        //scroll up
        js.executeScript("window.scrollBy(0,-500)");
    }
}
