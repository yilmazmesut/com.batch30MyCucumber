package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonu;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstnameTextbox;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastnameTextbox;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionTextbox;

    @FindBy(id = "DTE_Field_office")
    public WebElement officeTextbox;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extensionTextbox;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startdateTextbox;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryTextbox;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButtton;





}
