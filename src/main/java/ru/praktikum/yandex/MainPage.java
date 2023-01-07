package ru.praktikum.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;

    private By orderStatusButton = By.className("Header_Link__1TAG7");
    private By orderNumberInput = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private By goButton = By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']");


    public void clickOrderStatusButton() {
        webDriver.findElement(orderStatusButton).click();
    }

    public void enterOrderNumberInput(String number) {
        webDriver.findElement(orderNumberInput).sendKeys(number);
    }

    public void clickGoButton() {
        webDriver.findElement(goButton).click();
    }

    public void open(){
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }
}
