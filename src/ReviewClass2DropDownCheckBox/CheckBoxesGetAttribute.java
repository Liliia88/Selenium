package ReviewClass2DropDownCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesGetAttribute {
    public static void main(String[] args) {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//        create an instance
        WebDriver driver = new ChromeDriver();
//        open the syntax
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//     find the checkBoxes

        List<WebElement> checkbxes = driver.findElements(By.xpath("//input[@name='color']"));

// what does this list contain?
//        it contains all the 6 Webelements

        for (WebElement checkBx : checkbxes) {
            String color = checkBx.getAttribute("value");
        if (color.equalsIgnoreCase("orange")) {
             checkBx.click();
                //break;
            }
        }
    }
}
