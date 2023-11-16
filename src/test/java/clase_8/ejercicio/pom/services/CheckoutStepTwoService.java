package clase_8.ejercicio.pom.services;

import clase_8.ejercicio.DriverActions;
import clase_8.ejercicio.pom.pages.CheckoutStepTwoPage;

public class CheckoutStepTwoService {
    private CheckoutStepTwoPage checkoutStepTwoPage;

    public CheckoutStepTwoService(){
        this.checkoutStepTwoPage = new CheckoutStepTwoPage();
    }

    public void goFinish(){
        DriverActions.click(this.checkoutStepTwoPage.getBtn_finish());
    }
}
