package com.hepsiburada.steps;

import com.hepsiburada.pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {

    WebDriver driver;
    HomePage homePage;
    CategoryPage categoryPage;
    ProductPage productPage;
    CartPage cartPage;
    String productPrice;

    @Given("Kullanıcı {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        // ChromeDriver örneği; farklı tarayıcı desteği istenirse konfigüre edilebilir.
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        homePage = new HomePage(driver);
    }

    @When("Kullanıcı {string} kategorisine gider")
    public void kullanici_kategorisine_gider(String kategori) {
        // Örneğin "Tüm Kategoriler -> Elektronik -> Tablet" adımını temsil eder.
        homePage.navigateToTablets();
        categoryPage = new CategoryPage(driver);
    }

    @When("Kullanıcı filtrelerden marka {string} ve ekran boyutu {string} seçer")
    public void kullanici_filtrelerden_marka_ve_ekran_boyutu_secer(String marka, String ekranBoyutu) {
        // Gerçek uygulamada parametrelere göre dinamik seçim yapılabilir;
        // burada sabit locator'lar kullanılarak filtreleme yapılıyor.
        categoryPage.applyFilters();
    }

    @When("Kullanıcı en yüksek fiyatlı ürüne tıklar")
    public void kullanici_en_yuksek_fiyatli_urune_tiklar() {
        categoryPage.selectHighestPriceProduct();
        productPage = new ProductPage(driver);
    }

    @When("Kullanıcı ürün detay sayfasında {string} butonuna tıklar")
    public void kullanici_urun_detay_sayfasinda_butonuna_tiklar(String buttonName) {
        // Buton ismi parametresi kontrol edilerek ilgili buton aksiyonu tetiklenir.
        if (buttonName.equalsIgnoreCase("Sepete Ekle")) {
            productPage.clickAddToCart();
        }
    }

    @When("Kullanıcı ürün detay sayfasındaki fiyat bilgisini kaydeder")
    public void kullanici_urun_detay_sayfasindaki_fiyat_bilgisi_kaydeder() {
        productPrice = productPage.getProductPrice();
    }

    @When("Kullanıcı sepete giderek sepetteki ürün fiyatını kontrol eder")
    public void kullanici_sepete_giderek_sepetteki_urun_fiyatini_kontrol_eder() {

        cartPage = new CartPage(driver);
    }

    @Then("Ürün detay sayfasındaki fiyat ile sepetteki ürün fiyatı aynı olmalıdır")
    public void urun_detay_ve_sepetteki_fiyat_karsilastirilir() {
        Assert.assertTrue(cartPage.verifyProductPrice(productPrice), "Ürün fiyatı eşleşmiyor!");
        driver.quit();
    }
}

