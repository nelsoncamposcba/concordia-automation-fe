package clase_6.ejercitacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CarritoTest extends Hooks {

    @BeforeMethod
    public void inicioSesion() {
        //Pasos para ejecutar la prueba
        //1- Ingresar nombre de usuario
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        //2- Ingresar contraseña
        //driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //3- Click en Login
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Test
    public void agregarProductoCarrito() {
        //Agregar al btnCarrito el producto deseado
        List<WebElement> productos = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        for (WebElement producto : productos) {
            if (producto.getText().equals("Sauce Labs Fleece Jacket")) {
                //Ingresa al producto
                producto.click();

                //Agrega el producto al btnCarrito
                driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
                break;
            }
        }

        WebElement btnCarrito = driver.findElement(By.className("shopping_cart_link"));

        //Validaciones
        Assert.assertNotEquals(btnCarrito.getText(), "", "El btnCarrito no esta vacio");
        Assert.assertEquals(btnCarrito.getText(), "1", "El btnCarrito no contiene productos");

        driver.quit();
    }

    @Test
    public void eliminarProductoCarrito() {
        //Agregar al btnCarrito el producto deseado
        List<WebElement> productos = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        for (WebElement producto : productos) {
            if (producto.getText().equals("Sauce Labs Backpack")) {
                //Ingresa al producto
                producto.click();

                //Agrega el producto al btnCarrito
                driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
                break;
            }
        }

        //Ingresa al btnCarrito
        WebElement btnCarrito = driver.findElement(By.className("shopping_cart_link"));
        btnCarrito.click();

        //Hay que volverlo a localizar ya que la pagina cambia el estado del elemento
        btnCarrito = driver.findElement(By.className("shopping_cart_link"));

        //Elimina el producto agregado
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        //Validaciones
        Assert.assertEquals(btnCarrito.getText(), "", "El btnCarrito no esta vacio");
        Assert.assertEquals(btnCarrito.getText(), "", "El btnCarrito contiene productos");
    }
}
