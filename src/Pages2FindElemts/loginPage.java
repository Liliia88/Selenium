package Pages2FindElemts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils1Start.CommonMethods.driver;

public class loginPage {
//or this way
    public WebElement userNameField = driver.findElement(By.id("txtUsername"));
    public WebElement passwordField = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));
    //driver.
}
