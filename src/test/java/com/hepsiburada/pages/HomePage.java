package com.hepsiburada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By categoryMenu = By.xpath("//span[text()='Tüm Kategoriler']");
    private By electronicsCategory = By.xpath("//a[text()='Elektronik']");
    private By tabletCategory = By.xpath("//a[text()='Tablet']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToTablets() {
        driver.findElement(categoryMenu).click();
        driver.findElement(electronicsCategory).click();
        driver.findElement(tabletCategory).click();
    }
}
