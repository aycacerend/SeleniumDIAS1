package com.hepsiburada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage {

    // Örnek locatorlar; gerçek uygulamaya göre güncellenmelidir.
    private By appleBrandFilter = By.xpath("//span[text()='Apple']");
    private By screenSizeFilter = By.xpath("//span[text()='13,2 inç']");
    private By highestPriceProduct = By.xpath("(//div[@data-test-id='product-card']//a)[last()]");

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public void applyFilters() {
        driver.findElement(appleBrandFilter).click();
        driver.findElement(screenSizeFilter).click();
    }

    public void selectHighestPriceProduct() {
        driver.findElement(highestPriceProduct).click();
    }
}
