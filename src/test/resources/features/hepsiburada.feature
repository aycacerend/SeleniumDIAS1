Feature: Hepsiburada Tablet Satın Alma Testi

  Scenario: Kullanıcı en pahalı Apple tablet ürününü sepete ekler ve fiyatı doğrular
    Given Kullanıcı "https://www.hepsiburada.com/" adresine gider
    When Kullanıcı "Tüm Kategoriler -> Elektronik -> Tablet" kategorisine gider
    And Kullanıcı filtrelerden marka "Apple" ve ekran boyutu "13,2 inç" seçer
    And Kullanıcı en yüksek fiyatlı ürüne tıklar
    And Kullanıcı ürün detay sayfasında "Sepete Ekle" butonuna tıklar
    And Kullanıcı ürün detay sayfasındaki fiyat bilgisini kaydeder
    And Kullanıcı sepete giderek sepetteki ürün fiyatını kontrol eder
    Then Ürün detay sayfasındaki fiyat ile sepetteki ürün fiyatı aynı olmalıdır
