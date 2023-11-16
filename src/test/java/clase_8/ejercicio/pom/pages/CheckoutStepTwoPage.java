package clase_8.ejercicio.pom.pages;

import org.openqa.selenium.By;

public class CheckoutStepTwoPage {

    private By btn_finish = By.xpath("//button[@id='finish']");

    public By getBtn_finish() {
        return btn_finish;
    }
}
