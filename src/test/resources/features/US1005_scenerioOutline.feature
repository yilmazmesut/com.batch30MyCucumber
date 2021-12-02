Feature: US1005 amazonda liste ile arama

  Scenario Outline: TC09 amazonda verilen bir listeyi aratip, var olduklarini test edin

    Given kullanici "amazonUrl" sayfasina gider
    Then "<arananUrun>" icin arama yapar
    And sonucun "<arananUrun>" icerdigini test eder
    And sonuc sayisini yazdirir
    Then sayfayi kapatir



    Examples:
    |arananUrun |
    |nutella    |
    |java       |
    |ipod       |
    |Apple      |