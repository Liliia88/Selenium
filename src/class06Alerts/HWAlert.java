package class06Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HWAlert {
    /*
    goto https://chercher.tech/practice/frames
1.check the checkBox
2.Select BabyCat from drop down
3. Send text in text box "DONE"
     */public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox1.click();
        boolean check = checkBox1.isSelected();
        System.out.println(check);
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dropdown);
        Thread.sleep(2000);
        select.selectByVisibleText("Baby Cat");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("DONE");
    }
}
