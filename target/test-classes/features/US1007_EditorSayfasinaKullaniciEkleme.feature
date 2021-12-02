Feature: US1007 editor sayfasina farkli kullanicilar ekleme

  @editor
  Scenario Outline: TC11 Editor sayfasina farkli kisiler ekleyin

    Given kullanici editor "editorUrl" sayfasina gider
    Then new butonuna basar
    And editor firstname kutusuna "<firstname>" bilgisi girer
    And editor lastname kutusuna "<lastname>" bilgisi girer
    And editor position kutusuna "<position>" bilgisi girer
    And editor office kutusuna "<office>" bilgisi girer
    And editor extension kutusuna "<extension>" bilgisi girer
    And editor startdate kutusuna "<startdate>" bilgisi girer
    And editor salary kutusuna "<salary>" bilgisi girer
    Then Create butonuna tiklar




    Examples:
    |firstname  |lastname |position |office |extension  |startdate  |salary |
    |Mesut      |Mutlu    |TestLead |London |123        |2021-12-16 |50000  |
    |Ahmet      |Mutsuz   |QA       |Glasgow|123        |2022-12-16 |5000   |
    |Mehmet     |Neseli   |Cayci    |Cardiff|123        |2023-12-16 |500    |

