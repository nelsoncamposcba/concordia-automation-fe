package clase_7.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private final By txt_user_name =  By.cssSelector("#user-name");
    private final By txt_user_password = By.id("password");
    private final By btn_login = By.xpath("//input[@id='login-button']");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void ingresarUserName(String userName){
        this.driver.findElement(txt_user_name).sendKeys(userName);
    }

    public void ingresarUserPassword(String userPassword){
        this.driver.findElement(txt_user_password).sendKeys(userPassword);
    }
    public void clickLogin(){
        this.driver.findElement(btn_login).click();
    }


    public void iniciarSesion(String userName, String userPassword){
        ingresarUserName(userName);
        ingresarUserPassword(userPassword);
        clickLogin();
    }

}
