package clase_8.srp;

import org.openqa.selenium.WebDriver;

public class LoginService {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginService(WebDriver driver){
        this.driver = driver;
        this.loginPage = new LoginPage();
    }

    public void ingresarUserName(String userName){
        this.driver.findElement(loginPage.getTxt_user_name()).sendKeys(userName);
    }

    public void ingresarUserPassword(String userPassword){
        this.driver.findElement(loginPage.getTxt_user_password()).sendKeys(userPassword);
    }
    public void clickLogin(){
        this.driver.findElement(loginPage.getBtn_login()).click();
    }


    public void iniciarSesion(String userName, String userPassword){
        ingresarUserName(userName);
        ingresarUserPassword(userPassword);
        clickLogin();
    }
}
