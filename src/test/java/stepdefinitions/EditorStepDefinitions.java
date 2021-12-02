package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.EditorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditorStepDefinitions {

    EditorPage editorPage = new EditorPage();

    @Given("kullanici editor {string} sayfasina gider")
    public void kullaniciEditorSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        editorPage.newButonu.click();
    }

    @And("editor firstname kutusuna {string} bilgisi girer")
    public void editorFirstnameKutusunaBilgisiGirer(String firstName) {
        editorPage.firstnameTextbox.sendKeys(firstName);
    }

    @And("editor lastname kutusuna {string} bilgisi girer")
    public void editorLastnameKutusunaBilgisiGirer(String lastName) {
        editorPage.lastnameTextbox.sendKeys(lastName);
    }

    @And("editor position kutusuna {string} bilgisi girer")
    public void editorPositionKutusunaBilgisiGirer(String position) {
        editorPage.positionTextbox.sendKeys(position);
    }

    @And("editor office kutusuna {string} bilgisi girer")
    public void editorOfficeKutusunaBilgisiGirer(String office) {
        editorPage.officeTextbox.sendKeys(office);
    }

    @And("editor extension kutusuna {string} bilgisi girer")
    public void editorExtensionKutusunaBilgisiGirer(String extension) {
        editorPage.extensionTextbox.sendKeys(extension);
    }

    @And("editor startdate kutusuna {string} bilgisi girer")
    public void editorStartdateKutusunaBilgisiGirer(String startdate) {
        editorPage.startdateTextbox.sendKeys(startdate);
    }

    @And("editor salary kutusuna {string} bilgisi girer")
    public void editorSalaryKutusunaBilgisiGirer(String salary) {
        editorPage.salaryTextbox.sendKeys(salary);
    }

    @Then("Create butonuna tiklar")
    public void createButonunaTiklar() {
        editorPage.createButtton.click();
    }
}
