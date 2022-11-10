package class07Windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW1WindowHandleSwitch {
    public static void main(String[] args) throws InterruptedException {
        /*
        **HomeWork 1**
**WindowHandles**
1.goto
http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your user name in form
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        String gmailPage = driver.getWindowHandle(); //Store the window handle title in a variable
        //1.click on help and privacy btn
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click(); //click on help btn
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click(); //click on privacy btn
        Thread.sleep(2000);
        //2.CLICK ON COMMUNITY BTN
        Set<String> allHandles = driver.getWindowHandles(); //get all the window handles in a set
        for(String handle:allHandles){ //traverse through all the handles of the set
            driver.switchTo().window(handle);// switch focus to the current handle in a set
            String title = driver.getTitle(); //get the title of the window to which the driver has switched
            if(title.equalsIgnoreCase("Google Account Help")){ //check if the title is help page
                Thread.sleep(2000);
                System.out.println("the current page under focus is :"+title);
                break;
            }
        }
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click(); //find the community btn and click on it
        //String text = communityBtn.getText();
        //if(text.equals("Community")){
          //  communityBtn.click();
       // }
       // 3. goto gmailpage page and enter usernamename in the form
        driver.switchTo().window(gmailPage); //switch to gmailcom page window
        WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));//find username field
        username1.sendKeys("lili"); //enter username
    }}

