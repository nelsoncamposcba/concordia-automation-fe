package clase_7.pageobjects;

import clase_7.drivermanager.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {

    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");

        DriverManager.getDriver().get("https://www.saucedemo.com/");
    }

    @Test
    public void inicioCorrecto(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        //Pasos para ejecutar la prueba
        //1- Ingresar nombre de usuario
        loginPage.ingresarUserName("standard_user");
        //2- Ingresar contraseña
        loginPage.ingresarUserPassword("secret_sauce");
        //3- Click en Login
        loginPage.clickLogin();
    }

    @Test
    public void inicioIncorrecto(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        //Pasos para ejecutar la prueba
        //1- Ingresar nombre de usuario
        loginPage.ingresarUserName("qwqwe");
        //2- Ingresar contraseña
        loginPage.ingresarUserPassword("qweqwe");
        //3- Click en Login
        loginPage.clickLogin();
    }

    @Test
    public void inicioCorrectoMejorado(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        loginPage.iniciarSesion("standard_user", "secret_sauce");
    }
}