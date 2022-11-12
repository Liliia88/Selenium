package ReviewClass2DropDownCheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com simple-form-demo
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //maximize
        driver.manage().window().maximize();
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //traverse through the list of webElements
        for (WebElement radioBtn : radioBtns) {
            //find the desired rsdio button
            String option = radioBtn.getAttribute("value");
            if (option.equalsIgnoreCase("5 - 15")) {
                //click on the radio Btn
                radioBtn.click();
            }
        }
    }
}
