package clase_8.ejercicio.pom.services;

import clase_8.ejercicio.DriverActions;
import clase_8.ejercicio.pom.pages.InventoryPage;

public class InventoryService {

    private InventoryPage inventoryPage;

    public InventoryService(){
        this.inventoryPage = new InventoryPage();
    }
    public void clickAddToCardSauceLabsBackPack(){
        DriverActions.click(this.inventoryPage.getBtn_add_to_cart_sauce_labs_backpack());
    }

    public void goCart(){
        DriverActions.click(this.inventoryPage.getBtn_cart());
    }
}
