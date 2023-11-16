package clase_8.ejercicio.pom.services;

import clase_8.ejercicio.DriverActions;
import clase_8.ejercicio.pom.pages.HomePage;

public class HomeService {
    private HomePage homePage;

    public HomeService(){
        this.homePage = new HomePage();
    }

    public void login(String userName, String userPassword){
        DriverActions.insertText(this.homePage.getTxt_user_name(), userName);
        DriverActions.insertText(this.homePage.getTxt_user_password(), userPassword);
        DriverActions.click(this.homePage.getBtn_login());
    }
}
