package com.hepsiburada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {


    private By cartProductPriceLocator = By.xpath("///*[@id=\"365ec857-923a-4e8b-903a-6ed5ea22f74a\"]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]");

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

