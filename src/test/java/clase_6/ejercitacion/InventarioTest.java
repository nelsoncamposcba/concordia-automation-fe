package clase_6.ejercitacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InventarioTest extends Hooks {
    @Test
    public void listadoProductoInicial() {
        //Pasos para ejecutar la prueba
        //1- Ingresar nombre de usuario
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        //2- Ingresar contraseña
        //driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //3- Click en Login
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


        //Validaciones
        //Se visualizan 6 productos
        List<WebElement> productos = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        Assert.assertEquals(productos.size(), 6, "No hay 6 productos visibles");
        //Productos ordenamos de A a Z
        List<String> nombresProductos = new ArrayList<>();
        for (WebElement producto : productos) {
            nombresProductos.add(producto.getText());
        }
        Assert.assertTrue(estaOrdenadaAaZ(nombresProductos), "Los productos no estan ordenados de A a Z");
        //El quinto producto es Sauce Labs Onesie
        Assert.assertEquals(productos.get(4).getText(), "Sauce Labs Onesie", "El quinto producto no es Sauce Labs Onesie");

        driver.quit();
    }

    public boolean estaOrdenadaAaZ(List<String> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            String elementoActual = lista.get(i);
            String elementoSiguiente = lista.get(i + 1);

            // Compara los elementos actual y siguiente
            if (elementoActual.compareTo(elementoSiguiente) > 0) {
                return false; // Si el elemento actual es mayor que el siguiente, la lista no está ordenada
            }
        }
        return true; // Si el bucle termina sin encontrar desorden, la lista está ordenada
    }


}
