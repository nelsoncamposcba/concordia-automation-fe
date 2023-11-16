package clase_8.pagefactory;

import clase_7.drivermanager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Mapeo de los elementos de la pagina Login de SauceDemo.
 * Implementa PageFactory para crearlos.
 *
 * @author Nelson
 * @since 16-11-2023
 * @version 1.0.0
 */
public class LoginPage {
    @FindBy(id = "user-name")
    private WebElement txt_user_name;
    @FindBy(id = "password")
    private WebElement txt_user_password;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btn_login;

    public LoginPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getTxt_user_name() {
        return txt_user_name;
    }

    public WebElement getTxt_user_password() {
        return txt_user_password;
    }

    public WebElement getBtn_login() {
        return btn_login;
    }
}
