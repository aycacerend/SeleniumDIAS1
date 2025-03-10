package com.hepsiburada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    // Örnek locatorlar; uygulamanın gerçek HTML yapısına göre düzenlenmelidir.
    private By addToCartButton = By.xpath("//*[@id=\"container\"]/div/main/div/div/div[2]/section[1]/div[2]/div[6]/button/i");
    private By productPriceLocator = By.xpath("//*[@id=\"container\"]/div/main/div/div/div[2]/section[1]/div[2]/div[3]/div/div[1]/div[1]/span");
    private By goToCartButton = By.xpath("//*[@id=\"oldHeader_f2f0bb07-770e-41ad-0bcf-c2f7ec4f8a3c\"]/div/div[1]/div[2]/div[3]/a");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductPrice() {
        return driver.findElement(productPriceLocator).getText();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void clickGoToCartButton() {
        driver.findElement(goToCartButton).click();
    }

}