package class09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class HWAnotherWayGoNextPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //click on PIM
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        //List<WebElement> idperson = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));

        boolean idfound = false;
        while (!idfound) {
            List<WebElement> idperson = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));

            for (int i = 0; i < idperson.size(); i++) {
                String text = idperson.get(i).getText();
                if (text.equalsIgnoreCase("40907A")) {
                    System.out.println(i);
                    System.out.println("the index of the row which contains 45155A is " + (i + 1));
                    WebElement btn = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    btn.click();
                    idfound = true;
                    break;
                }
            }
            if (!idfound) {
                driver.findElement(By.xpath("//a[text()='Next']")).click();
            }

        }
    }}