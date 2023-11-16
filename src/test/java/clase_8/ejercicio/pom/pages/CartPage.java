package clase_8.ejercicio.pom.pages;

import org.openqa.selenium.By;

public class CartPage {

    private By btn_checkout = By.id("checkout");

    public By getBtn_checkout() {
        return btn_checkout;
    }
}
