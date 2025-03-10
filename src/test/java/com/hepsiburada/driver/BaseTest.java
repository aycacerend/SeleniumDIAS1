package com.hepsiburada.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        // WebDriverManager ile chromedriver'ı yönetin
        WebDriverManager.chromedriver().setup();

        // ChromeDriver'ı başlatın
        driver = new ChromeDriver();

        // Tarayıcıyı maximize et
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // Testi bitir, tarayıcıyı kapat
        if (driver != null) {
            driver.quit();
        }
    }
}
