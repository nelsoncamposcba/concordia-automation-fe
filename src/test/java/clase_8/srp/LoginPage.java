package clase_8.srp;

import org.openqa.selenium.By;

public class LoginPage {
    private final By txt_user_name =  By.cssSelector("#user-name");
    private final By txt_user_password = By.id("password");
    private final By btn_login = By.xpath("//input[@id='login-button']");


    public By getTxt_user_name() {
        return txt_user_name;
    }

    public By getTxt_user_password() {
        return txt_user_password;
    }

    public By getBtn_login() {
        return btn_login;
    }
}
