package clase_6.ejercitacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CompraTest extends Hooks {

    @Test
    public void compraCorrecta() {
        //Pasos para ejecutar la prueba
        //1- Ingresar nombre de usuario
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        //2- Ingresar contraseña
        //driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //3- Click en Login
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        //Agregar al carrito el producto deseado
        List<WebElement> productos = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        for (WebElement producto : productos) {
            if (producto.getText().equals("Sauce Labs Backpack")) {
                //Ingresa al producto
                producto.click();

                //Agrega el producto al carrito
                driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
                break;
            }
        }

        //Ingresa al carrito
        WebElement btnCarrito = driver.findElement(By.className("shopping_cart_link"));
        btnCarrito.click();

        //Continuar con la compra
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Nelson");
        driver.findElement(By.id("last-name")).sendKeys("Campos");
        driver.findElement(By.id("postal-code")).sendKeys("5000");
        driver.findElement(By.id("continue")).click();

        //Finalizar compra
        driver.findElement(By.id("finish")).click();

        //Validaciones
        //Contiene el texto
        WebElement texto = driver.findElement(By.className("complete-text"));
        Assert.assertTrue(texto.getText().contains("order has been dispatched"), "EL texto no contiene la frase order has been dispatched");
        //El titulo esta visible
        WebElement titulo = driver.findElement(By.xpath("//*[contains(text(), 'Checkout: Complete!')]"));
        Assert.assertTrue(titulo.isDisplayed(), "El titulo Checkout: Complete! no esta visible");
        //El back home esta habilitado
        WebElement btnBackHome = driver.findElement(By.id("back-to-products"));
        Assert.assertTrue(btnBackHome.isEnabled(), "El boton Back Home no esta habilitado");
        //El carrito no tiene elementos
        btnCarrito = driver.findElement(By.className("shopping_cart_link"));
        Assert.assertEquals(btnCarrito.getText(), "", "El carrito contiene productos");
    }
}
