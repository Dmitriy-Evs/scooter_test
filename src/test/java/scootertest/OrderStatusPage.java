package scootertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage {
    public OrderStatusPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;
    private By notFoundImage = By.className("Track_NotFound__6oaoY");

    public boolean isNotFoundImage(){
        return webDriver.findElement(notFoundImage).isDisplayed();
    }
}
