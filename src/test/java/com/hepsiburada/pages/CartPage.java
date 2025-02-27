package com.hepsiburada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    // Örnek locator; sepetteki ürün fiyatını bulmak için kullanılır.
    private By cartProductPriceLocator = By.xpath("//span[@class='cart-price']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartProductPrice() {
        return driver.findElement(cartProductPriceLocator).getText();
    }

    public boolean verifyProductPrice(String expectedPrice) {
        String actualPrice = getCartProductPrice();
        return expectedPrice.equals(actualPrice);
    }
}

