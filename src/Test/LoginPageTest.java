package Test;

import Pages.LoginPage;
import Utils.CommonMethods;

public class LoginPageTest {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage login=new LoginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();
    }
}
