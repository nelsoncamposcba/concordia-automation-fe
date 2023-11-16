package clase_8.ejercicio.pom.pages;

import org.openqa.selenium.By;

public class CheckoutCompletePage {

    private By btn_back_home = By.id("back-to-products");
    private By txt_complete_text = By.className("complete-text");
    private By txt_title = By.className("title");
    private By btn_cart = By.className("shopping_cart_link");

    public By getBtn_back_home() {
        return btn_back_home;
    }

    public By getTxt_complete_text() {
        return txt_complete_text;
    }

    public By getTxt_title() {
        return txt_title;
    }

    public By getBtn_cart() {
        return btn_cart;
    }
}
