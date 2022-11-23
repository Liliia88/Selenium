package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.CommonMethods.driver;

public class LoginPage {

    public WebElement userNameField = driver.findElement(By.id("txtUsername"));
    public WebElement passwordField = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));
    //driver.
}
