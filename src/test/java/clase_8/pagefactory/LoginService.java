package clase_8.pagefactory;

public class LoginService {
    private final LoginPage loginPage;

    public LoginService() {
        loginPage = new LoginPage();
    }

    public void ingresarUserName(String userName) {
        loginPage.getTxt_user_name().sendKeys(userName);
    }

    public void ingresarUserPassword(String userPassword) {
        loginPage.getTxt_user_password().sendKeys(userPassword);
    }

    public void clickLogin() {
        loginPage.getBtn_login().click();
    }


    public void iniciarSesion(String userName, String userPassword) {
        ingresarUserName(userName);
        ingresarUserPassword(userPassword);
        clickLogin();
    }
}
