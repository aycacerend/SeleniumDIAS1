package com.hepsiburada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    // Örnek locatorlar; uygulamanın gerçek HTML yapısına göre düzenlenmelidir.
    private By addToCartButton = By.id("addToCart");
    private By productPriceLocator = By.xpath("//span[@class='price']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductPrice() {
        return driver.findElement(productPriceLocator).getText();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }
}
