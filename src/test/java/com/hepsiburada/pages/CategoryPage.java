package com.hepsiburada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage {

    // Örnek locatorlar; gerçek uygulamaya göre güncellenmelidir.
    private By appleBrandFilter = By.xpath("//*[@id=\"HeroFilter_6d0fda08-a4b9-43ea-d0fe-074da0774e79\"]/div/div/div[2]/div/div[2]/div[2]/a/span");
    private By screenSizeFilter = By.xpath("//*[@id=\"HeroFilter_6d0fda08-a4b9-43ea-d0fe-074da0774e79\"]/div/div/div[2]/div/div[2]/div[1]/a/span");
    private By highestPriceProduct = By.xpath("//*[@id=\"i11\"]/div/a/div[2]/div[2]/h3");

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
