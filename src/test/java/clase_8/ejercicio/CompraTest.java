package clase_8.ejercicio;

import clase_8.ejercicio.pom.services.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompraTest {
    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");
        DriverManager.goSite("https://www.saucedemo.com/");
    }
    @Test
    public void compraCorrecta() {
        HomeService homeService = new HomeService();
        homeService.login("standard_user", "secret_sauce");

        InventoryService inventoryService = new InventoryService();
        inventoryService.clickAddToCardSauceLabsBackPack();
        inventoryService.goCart();

        CartService cartService = new CartService();
        cartService.goCheckout();

        CheckoutStepOneService checkoutStepOneService = new CheckoutStepOneService();
        checkoutStepOneService.completedForm("Nelson", "Campos", "5000");
        checkoutStepOneService.stepOnecontinue();

        CheckoutStepTwoService checkoutStepTwoService = new CheckoutStepTwoService();
        checkoutStepTwoService.goFinish();

        CheckoutCompleteService checkoutCompleteService = new CheckoutCompleteService();
        //checkoutCompleteService.goBackHome();

        //El mensaje contiene la frase order has been dispatched
        Assert.assertTrue(
                checkoutCompleteService.getCompleteText().contains("order has been dispatched"),
                "El Complete Text no contiene el texto order has been dispatched"
        );
        //El titulo Checkout: Complete! esta visible.
        Assert.assertTrue(
                checkoutCompleteService.isVisibleTitle(),
                "El Title no es visible"
        );
        //El boton Back Home esta habilitado.
        Assert.assertTrue(
                checkoutCompleteService.isEnableBackHome(),
                "El Back Home no esta habilitado"
        );

/*
        Validaciones:
        - El carrito no contiene elementos.
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

 */
    }
}
