package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CHQAPage;

public class CHQAStepDefinitions {

    CHQAPage chqaPage = new CHQAPage();

    @Then("CH login linkine tiklar")
    public void chLoginLinkineTiklar() {
        chqaPage.loginLinki.click();
    }

    @And("CH username kutusuna {string} yazar")
    public void chUsernameKutusunaYazar(String kullaniciAdi) {
        chqaPage.usernameKutusu.sendKeys(kullaniciAdi);
    }

    @And("CH password kutusuna {string} yazar")
    public void chPasswordKutusunaYazar(String password) {
        chqaPage.passwordKutusu.sendKeys(password);
    }

    @And("CH login butonuna basar")
    public void chLoginButonunaBasar() {
        chqaPage.loginButonu.click();
    }

    @Then("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(chqaPage.basarisizYazisiELementi.isDisplayed());
    }

    @Given("kullanici {string} amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider(String arg0) {
    }


}
