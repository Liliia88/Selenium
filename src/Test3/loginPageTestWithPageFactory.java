package Test3;

import Pages2FindElemts.loginPageWithPageFactory;
import Utils1Start.CommonMethods;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPageWithPageFactory login =new loginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
    }
}
