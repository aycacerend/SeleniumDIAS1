package com.hepsiburada.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By categoryMenu = By.xpath("//*[@id=\"NavigationDesktop_16e28d5e-a88e-45a4-949e-de97d3282dd8\"]/div/div/div/div/div[1]/div/ul/li[1]/span");
    private By electronicsCategory = By.xpath("///*[@id=\"NavigationDesktop_16e28d5e-a88e-45a4-949e-de97d3282dd8\"]/div/div/div/div/div[1]/div/ul/li[1]/div/div/div/div[1]/ul/li/a");
    private By tabletCategory = By.xpath("//*[@id=\"AllCategories.Child.CategoryId\"]/div/div/div/div/div/div/div/div[7]/div");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToTablets() {
        driver.findElement(categoryMenu).click();
        driver.findElement(electronicsCategory).click();
        driver.findElement(tabletCategory).click();
    }
}
