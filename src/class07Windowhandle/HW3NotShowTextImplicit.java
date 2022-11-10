package class07Windowhandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class HW3NotShowTextImplicit {
    public static void main(String[] args) {
        /*
        HomeWork3: (do not use thread .sleep  or Explicit wait)
1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console

the text will be Empty

write down  whatever the reason you understand  of text being empty after exploring DOM
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();
        WebElement startbtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startbtn.click();
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String t = text.getText();
        System.out.println(t+"the text is empty because the values of DOM and UI are not synchronised, since WebElement " +
         " with it's text Welcome Syntax Technologies is appeared in DOM it is not appeared yet in UI");

    }
}
