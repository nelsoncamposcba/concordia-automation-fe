package clase_7.esperas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Esperas {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testEsperaImplicita(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

    }

    @AfterMethod
    public void finish(){
        driver.quit();
    }
}
