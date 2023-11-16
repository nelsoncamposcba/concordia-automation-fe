package clase_8.ejercicio.pom.services;

import clase_8.ejercicio.DriverActions;
import clase_8.ejercicio.pom.pages.CheckoutCompletePage;

public class CheckoutCompleteService {

    private CheckoutCompletePage checkoutCompletePage;

    public CheckoutCompleteService(){
        this.checkoutCompletePage = new CheckoutCompletePage();
    }

    public void goBackHome(){
        DriverActions.click(this.checkoutCompletePage.getBtn_back_home());
    }

    public String getCompleteText(){
        return DriverActions.getText(this.checkoutCompletePage.getTxt_complete_text());
    }

    public Boolean isVisibleTitle(){
        return DriverActions.isVisible(this.checkoutCompletePage.getTxt_title());
    }

    public Boolean isEnableBackHome(){
        return DriverActions.isEnabled(this.checkoutCompletePage.getBtn_back_home());
    }
}