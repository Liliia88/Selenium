package Pages2FindElemts;

import Utils1Start.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory extends CommonMethods {
    //or this way to use to find element
    @FindBy(id = "txtUsername")
    public WebElement usernamefield;

    @FindBy(xpath = "//input[@id = 'txtPassword']")
    public WebElement passwordfield;

    @FindBy(css = "input#btnLogin")
    public WebElement loginbtn;

    //    call the constructor to intialize all elements
    public loginPageWithPageFactory() {
        PageFactory.initElements(driver, this);
    }
}
