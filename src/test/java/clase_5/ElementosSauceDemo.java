package clase_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementosSauceDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(
                By.id("user-name")
        );
        userName.sendKeys("standard_user");

        //data-test="password"
        WebElement txtUserPassword = driver.findElement(
                By.xpath("//*[@data-test='password']")
        );
        //Thread.sleep(5000);
        txtUserPassword.sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(
                By.name("login-button")
        );
        //btnLogin.submit();
        btnLogin.click();


        List<WebElement> nombreProductos = driver.findElements(
                By.xpath("//div[@class='inventory_item_name ']")
        );

        for (WebElement producto: nombreProductos) {
            System.out.println(producto.getText());

            if(producto.getText().equals("Sauce Labs Fleece Jacket")){
                producto.click();
            }
        }

        //nombreProductos.get(0).click();


        //driver.quit();
    }
}
