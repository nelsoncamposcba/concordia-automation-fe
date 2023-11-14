package clase_7.drivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EsperasDriverManager {
    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");
    }
    @Test
    public void testEsperaImplicita(){
        DriverManager.getDriver().get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement landscape = DriverManager.getDriver().findElement(By.id("landscape"));
    }

    @Test
    public void testEsperaExplicitaDriverManager(){
        DriverManager.getDriver().get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

        WebElement landscape = DriverManager.getWait().until(
                ExpectedConditions.presenceOfElementLocated(By.id("landscape"))
        );
    }

    @Test
    public void testEsperaExplicita(){
        DriverManager.getDriver().get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement landscape = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("landscape"))
        );
    }

    @Test
    public void testEsperaFluida(){
        DriverManager.getDriver().get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

        Wait<WebDriver> wait = new FluentWait<>(DriverManager.getDriver())
                .withTimeout(Duration.ofSeconds(100))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement landscape = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("landscape"))
        );
    }

    @AfterMethod
    public void finish(){
        DriverManager.getDriver().quit();
    }
}
