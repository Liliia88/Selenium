package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Register {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        //maximize the window
        driver.manage().window().maximize();
       // driver.findElement(By.linkText("register.htm")).click();
        //enter username
        driver.findElement(By.id("customer.firstName")).sendKeys("Kate");
        driver.findElement(By.id("customer.lastName")).sendKeys("Petrova");
        driver.findElement(By.id("customer.address.street")).sendKeys("189 Kate Ln");
        driver.findElement(By.id("customer.address.city")).sendKeys("Tampa");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("33568");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7277823981");
        driver.findElement(By.id("customer.ssn")).sendKeys("234-345-121");
        driver.findElement(By.id("customer.username")).sendKeys("Katti");
        driver.findElement(By.id("customer.password")).sendKeys("Tampa88");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Tampa88");
        driver.findElement(By.className("button")).click();
        driver.close();
    }
}