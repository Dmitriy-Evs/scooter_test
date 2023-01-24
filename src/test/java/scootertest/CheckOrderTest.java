package scootertest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum.yandex.MainPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class CheckOrderTest {
    WebDriver driver;

    @Before
    public void setIp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkUnexcitingOrder(){

        MainPage mainPage = new MainPage(driver);


        mainPage.clickOrderStatusButton();
        mainPage.enterOrderNumberInput("12");
        mainPage.clickGoButton();

        OrderStatusPage orderStatusPage = new OrderStatusPage(driver);

        boolean isDisplayed = orderStatusPage.isNotFoundImage();
        assertTrue(isDisplayed);


    }
    //@After
    //public void tearDown(){
       // driver.quit();
   // }
}
