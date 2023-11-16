package clase_8.pagefactory;

import clase_7.drivermanager.DriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginPageFactory {

    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");

        DriverManager.getDriver().get("https://www.saucedemo.com/");
    }

    @Test
    public void inicioCorrecto(){
        LoginService loginService = new LoginService();

        //Pasos para ejecutar la prueba
        //1- Ingresar nombre de usuario
        loginService.ingresarUserName("standard_user");
        //2- Ingresar contraseña
        loginService.ingresarUserPassword("secret_sauce");
        //3- Click en Login
        loginService.clickLogin();
    }

    @Test
    public void inicioIncorrecto(){
        LoginService loginService = new LoginService();

        //Pasos para ejecutar la prueba
        //1- Ingresar nombre de usuario
        loginService.ingresarUserName("qwqwe");
        //2- Ingresar contraseña
        loginService.ingresarUserPassword("qweqwe");
        //3- Click en Login
        loginService.clickLogin();
    }

    @Test
    public void inicioCorrectoMejorado(){
        LoginService loginService = new LoginService();

        loginService.iniciarSesion("standard_user", "secret_sauce");
    }
}