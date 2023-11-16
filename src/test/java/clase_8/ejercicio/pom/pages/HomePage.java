package clase_8.ejercicio.pom.pages;

import org.openqa.selenium.By;

public class HomePage {
    private String urlHomePage = "https://www.saucedemo.com/";


    private By txt_user_name = By.id("user-name");
    private By txt_user_password = By.id("password");
    private By btn_login = By.id("login-button");

    public By getTxt_user_name() {
        return txt_user_name;
    }

    public By getTxt_user_password() {
        return txt_user_password;
    }

    public By getBtn_login() {
        return btn_login;
    }

    public String getUrlHomePage(){
        return this.urlHomePage;
    }
}
