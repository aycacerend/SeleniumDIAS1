package com.hepsiburada.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseTest {
    public static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Test Başladı");

        // Selenium Manager'ı devre dışı bırakıyoruz.
        System.setProperty("selenium.manager", "false");

        // ChromeDriver'ın yolunu manuel olarak belirtiyoruz.
        // Bu yol, projenizin kök dizininden itibaren veya absolute path olabilir.
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        // ChromeOptions ile gerekli argümanları ekliyoruz.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-translate");
        options.addArguments("disable-popup-blocking");
        options.addArguments("--disable-notifications");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "chrome");
        //caps.setCapability("browserName","firefox");

        // Mac ortamı için platform adını "mac" veya "macOS" olarak belirtebilirsiniz
        caps.setCapability("platformName", "mac");


        // ChromeDriver'ı oluşturuyoruz.
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.hepsiburada.com");
    }

    @After
    public void tearDown(){
        System.out.println("Test Bitti");
        if(driver != null){
            driver.quit();
        }
    }
}
