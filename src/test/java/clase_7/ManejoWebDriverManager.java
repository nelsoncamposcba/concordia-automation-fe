package clase_7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ManejoWebDriverManager {

    @Test
    public void navegadorChrome(){
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.quit();
    }

    @Test
    public void navegadorEdge(){
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.quit();
    }

}
