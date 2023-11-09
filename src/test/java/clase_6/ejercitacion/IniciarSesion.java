package clase_6.ejercitacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IniciarSesion {
    @Test
    public void inicioCorrecto(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        //Pasos para ejecutar la prueba
        //1- Ingresar nombre de usuario
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        //2- Ingresar contraseña
        //driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //3- Click en Login
        driver.findElement(By.xpath("//input[@id='login-button']")).click();



        //Validaciones
        //El usuario se encuentra en el inventario
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "El usuario no se encuentra en el Inventario");
        //El menu hamburguesa se encuentra visible y habilitado
        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
        Assert.assertTrue(menu.isDisplayed(), "El menú hamburguesa no se encuentra visible");
        Assert.assertTrue(menu.isEnabled(), "El menú hamburguesa no se encuentra habilitado");

        driver.quit();
    }
}
