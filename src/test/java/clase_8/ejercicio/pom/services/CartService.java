package clase_8.ejercicio.pom.services;

import clase_8.ejercicio.DriverActions;
import clase_8.ejercicio.pom.pages.CartPage;

public class CartService {
    private CartPage cartPage;

    public CartService() {
        this.cartPage = new CartPage();
    }

    public void goCheckout(){
        DriverActions.click(this.cartPage.getBtn_checkout());
    }
}
