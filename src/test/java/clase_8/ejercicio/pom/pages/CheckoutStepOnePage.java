package clase_8.ejercicio.pom.pages;

import org.openqa.selenium.By;

public class CheckoutStepOnePage {

    private By txt_first_name = By.name("firstName");
    private By txt_last_name = By.name("lastName");
    private By txt_zip_code = By.id("postal-code");
    private By btn_continue = By.xpath("//input[@id='continue']");

    public By getTxt_first_name() {
        return txt_first_name;
    }

    public By getTxt_last_name() {
        return txt_last_name;
    }

    public By getTxt_zip_code() {
        return txt_zip_code;
    }

    public By getBtn_continue() {
        return btn_continue;
    }
}
