package child_classes;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class manufacture_registrant_details extends Home_Page
{
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(linkText = "Product management")
    WebElement productmanagement;

    @FindBy(linkText = "Manufacturer and Registrant Details")
    WebElement manufacture_register_tab;

    @FindBy(xpath = "//button[@class='col-auto btn btn-primary add-new-item-button']")
    WebElement add_manufacure_registrant;

    @FindBy(id="Item_Translation_0__Name")
    WebElement comapny_name;

    @FindBy(id="Item_Translation_0__Name")
    WebElement input_comapny_name;

    @FindBy(id="languageCodeId")
    WebElement language_name;

    @FindBy(id="languageCodeId")
    WebElement select_language_name;

    @FindBy(id="alternateCompanyName")
    WebElement alternate_name_1;

    @FindBy(id="alternateCompanyName")
    WebElement alternate_name_spanish;

    @FindBy(id="add_button")
    WebElement add;

    @FindBy(name="Item.Translation[2].LanguageCode")
    WebElement second_language_name;

    @FindBy(name="Item.Translation[2].LanguageCode")
    WebElement select_language_name_2;

    @FindBy(name="Item.Translation[2].Name")
    WebElement alternate_name_2;

    @FindBy(name="Item.Translation[2].Name")
    WebElement alternate_name_spanish_2;


    @FindBy(id="add-new-item-save-button")
    WebElement save;

    @FindBy(xpath = "(//button[text()='Cancel'])[1]")
    WebElement cancel;




    public void view_registrant_details() throws InterruptedException {


        Thread.sleep(3000);
        productmanagement.click();
        logger7.log(Status.PASS, "Product Management Tab got clicked successfully");

        Thread.sleep(2000);
        manufacture_register_tab.click();
        logger7.log(Status.PASS, "Manufacture & Registrant Tab got clicked successfully");

        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,5000)");

        Thread.sleep(2000);
        add_manufacure_registrant.click();
        logger7.log(Status.PASS, "Add Manufacture / Registrant Button got clicked successfully");

        Thread.sleep(1000);
        comapny_name.click();
        logger7.log(Status.PASS, "Enter company name");

        input_comapny_name.sendKeys("Testing Company");
        logger7.log(Status.PASS, "Company name entered successfully");

        Thread.sleep(1000);
        language_name.click();


        Thread.sleep(3000);
        Select s=new Select(select_language_name);
        s.selectByValue("ES");
        logger7.log(Status.PASS, "Language dropdown option got clicked successfully");

        Thread.sleep(2000);
        alternate_name_1.click();
        logger7.log(Status.PASS, " Language selected successfully");

        alternate_name_spanish.sendKeys("spanish_es");
        logger7.log(Status.PASS, "Alternative translation entered successfully");

        Thread.sleep(2000);
        add.click();
        logger7.log(Status.PASS, "Add button got clicked successfully");

        Thread.sleep(1000);
        second_language_name.click();



        Thread.sleep(3000);
        Select ss=new Select(select_language_name_2);
        ss.selectByValue("FR");
        logger7.log(Status.PASS, "Language dropdown option got clicked successfully");

        Thread.sleep(2000);
        alternate_name_2.click();
        logger7.log(Status.PASS, " Language selected successfully");

        alternate_name_spanish_2.sendKeys("french_fr");
        logger7.log(Status.PASS, "Alternative translation entered successfully");


        Thread.sleep(3000);
        save.click();
        logger7.log(Status.PASS, "Save button got clicked successfully");

        Thread.sleep(3000);
        cancel.click();
        logger7.log(Status.PASS, "Restriction in duplicate Translation message seen successfully");




    }

}
