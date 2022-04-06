package child_classes;

import com.aventstack.extentreports.Status;
import com.google.api.services.gmail.Gmail;
import oracle.jrockit.jfr.jdkevents.ThrowableTracer;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class product_management extends Home_Page {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(linkText = "Product management")
    WebElement productmanagement;

    @FindBy(linkText = "Search Global Products")
    WebElement globalproduct;

    @FindBy(id = "ProductName")
    WebElement enter_productname;

    @FindBy(xpath = "//button[@id='btnSearchProducts']")
    WebElement search_product;

    @FindBy(linkText = "Create new product")
    WebElement create_new_product;

    @FindBy(name = "ProductLanguage")
    WebElement language_new;

    @FindBy(id="ProductLanguage")
    WebElement select_language_arabic;

     @FindBy(id="ProductName")
     WebElement product_name;

     @FindBy(xpath = "(//input[@type='text'])[2]")
     WebElement search;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    WebElement search_active_ingredient_name;

    @FindBy(xpath = "(//span[text()='Water'])[1]")
    WebElement active_ingredient;



     @FindBy(id="btnSaveProduct")
     WebElement save_basic_info_record;

    @FindBy(id = "enhanced-details-tab")
    WebElement Enhanced_Information;

    @FindBy(xpath = "(//input[@class='form-control search-input'])[8]")  //click
    WebElement storage_requirement_pro;

    @FindBy(xpath = "(//input[@class='form-control search-input'])[8]")    //search
    WebElement storage_requirement_search;


    @FindBy(xpath = "(//span[text()='Cool and dry'])[1]")  //click
    WebElement storageproduct;


    @FindBy(id = "btnSaveEnhancedData")
    WebElement save_enhanced_product_Information;


    @FindBy(id = "country-use-record-tab")
    WebElement CountryUseRecord;

    @FindBy(id="btnAddCountryListPopup")
    WebElement add_country_use_record;

    @FindBy(id="CountryCodeModalId")
    WebElement country_record;

    @FindBy(id="CountryCodeModalId")
    WebElement select_country_record;

    @FindBy(id = "CountryLanguageModalId")
    WebElement language;

    @FindBy(id = "CountryLanguageModalId")
    WebElement language_select;

    @FindBy(id ="btnAddCountryList")
    WebElement Next;

    @FindBy(id="ProductCategory")
    WebElement product_category;

    @FindBy(id="ProductCategory")
    WebElement select_product_category;

    @FindBy(id="Manufacturer")
    WebElement manufacture;

    @FindBy(id="Manufacturer")
    WebElement select_manufacture;

    @FindBy(id = "Registrant")
    WebElement registrant;

    @FindBy(id = "Registrant")
    WebElement select_registrant;

    @FindBy(id ="btnSaveAuthorizedUse")
    WebElement save_country_use_info_button;

    @FindBy(id= "btnAddCropPestData")
    WebElement addcrop_pest_button;

    @FindBy(id= "btnAddNewPairing")
    WebElement crop_pest_pairing;

    @FindBy(xpath ="//*[@id='CropListCommaSeparated']")
    WebElement cropdata;

    @FindBy(name = "CropListCommaSeparated")
    WebElement cropname1;

    @FindBy(name = "CropListCommaSeparated")
    WebElement cropname2;

    @FindBy(xpath = "(//button[@class='btn btn-success btn-sm check-entries'])[1]")
    WebElement crop_check_entries;



    //pest functionality

    @FindBy(xpath ="//*[@id='PestListCommaSeparated']")
    WebElement pestdata;

    @FindBy(name = "PestListCommaSeparated")
    WebElement pestname1;

    @FindBy(name = "PestListCommaSeparated")
    WebElement pestname2;

    @FindBy(xpath = "//button[@class='btn btn-success btn-sm check-entries']")
    WebElement pest_chech_entries;

    @FindBy(id = "btnSaveCropPestData")
    WebElement save_crop_pest_data;

    @FindBy(xpath = "//button[text()='Close']")
    WebElement close;

    @FindBy(id = "btnApprove")
    WebElement Approve;

    @FindBy(id = "publish")
    WebElement checkbox_publishnow;

    @FindBy(id = "qa-approve-button-confirm")
    WebElement save_checkbox;

    @FindBy(id = "enhanced-details-tab")
    WebElement again_enhanced_information;

    @FindBy(xpath = "(//input[@class='form-control search-input'])[5]")
    WebElement PPE_Requirement;

    @FindBy(xpath = "(//input[@class='form-control search-input'])[5]")
    WebElement PPE_Requirement_search;

    @FindBy(xpath = "(//span[text()='boots'])[1]")
    WebElement PPE_Requirement_search_value;

    @FindBy(id = "add-new-item-save-button-enhanced")
    WebElement save_newitem;

    @FindBy(id = "btnSaveEnhanced")
    WebElement save_enhanced_button;

    @FindBy(id = "country-use-record-tab")
    WebElement again_country_use_tab;

    @FindBy(linkText = "Product management")
    WebElement product_management;









    public void viewproduct() throws InterruptedException {

        Random random = new Random();
        int randomNumber= random.nextInt(1000);
       // System.out.println(randomNumber);

        Thread.sleep(3000);
        productmanagement.click();
        logger3.log(Status.PASS, "Product management button got clicked successfully ");

        Thread.sleep(3000);
        globalproduct.click();
        logger3.log(Status.PASS, "search global product button got clicked successfully ");

        Thread.sleep(2000);
        enter_productname.sendKeys("Regression Test"+randomNumber);
        logger3.log(Status.PASS, "Product name entered successfully ");

        Thread.sleep(3000);
        search_product.click();
        logger3.log(Status.PASS, "Searched button got click successfully ");

        Thread.sleep(3000);
        create_new_product.click();

        Thread.sleep(2000);
        language_new.click();

        Thread.sleep(3000);
        Select s=new Select(select_language_arabic);
        s.selectByValue("AR");

        Thread.sleep(3000);
        product_name.sendKeys("Regression Testing"+randomNumber);


        Thread.sleep(2000);
        search.click();

        Thread.sleep(2000);
        search_active_ingredient_name.sendKeys("Water");

        Thread.sleep(2000);
        active_ingredient.click();

         Thread.sleep(4000);
         save_basic_info_record.click();


        Thread.sleep(3000);
        Enhanced_Information.click();
        logger3.log(Status.PASS, "Enhanced Information tab got clicked successfully");

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,3000)");

        Thread.sleep(3000);
        storage_requirement_pro.click();
        logger3.log(Status.PASS, "Product toggle to left box successfully ");

        Thread.sleep(2000);
        storage_requirement_search.sendKeys("Cool and dry");

        Thread.sleep(3000);
        storageproduct.click();
        logger3.log(Status.PASS, "Toggled product got clicked successfully and toggled to right box ");

        Thread.sleep(4000);
        save_enhanced_product_Information.click();
        logger3.log(Status.PASS, "Save Enhanced product Information button got clicked successfully");

        Thread.sleep(3000);
        CountryUseRecord.click();
        logger3.log(Status.PASS, "Country use record tab got clicked successfully");

        Thread.sleep(3000);
       add_country_use_record.click();

        Thread.sleep(3000);
        country_record.click();

        Thread.sleep(3000);
        Select country=new Select(select_country_record);
        country.selectByValue("IM");

        Thread.sleep(2000);
        language.click();

        Thread.sleep(3000);
        Select language= new Select(language_select);
        language.selectByValue("AR");

        Thread.sleep(3000);
        Next.click();

        Thread.sleep(3000);
        product_category.click();

        Thread.sleep(3000);
        Select product=new Select(select_product_category);
        product.selectByValue("56627345");

        Thread.sleep(2000);
        manufacture.click();

        Thread.sleep(3000);
        Select manufacturer=new Select(select_manufacture);
        manufacturer.selectByValue("90437766");

        Thread.sleep(3000);
        registrant.click();

        Select registrant= new Select(select_registrant);
        registrant.selectByValue("85203121");

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,800)");

        Thread.sleep(3000);
        save_country_use_info_button.click();

        Thread.sleep(3000);
        addcrop_pest_button.click();

        //Changes for crop/pest merge functionality

        Thread.sleep(3000);
        crop_pest_pairing.click();
        logger3.log(Status.PASS, "Crop / Pest Pairing button got clicked successfully");

        Thread.sleep(2000);
        cropdata.click();

        cropname1.sendKeys("demo123" + '\n' + "demo1234");

        logger3.log(Status.PASS, "Crop name entered successfully");



        Thread.sleep(2000);
        crop_check_entries.click();
        logger3.log(Status.PASS, "Crop check entries button got clicked successfully");


        //pest merge functionality

        Thread.sleep(2000);
        pestdata.click();

        pestname1.sendKeys("Pest1234" + '\n' + "pest12345");
        logger3.log(Status.PASS, "Pest name entered successfully");


        Thread.sleep(2000);
        pest_chech_entries.click();
        logger3.log(Status.PASS, "Pest check entries button got clicked successfully");

        Thread.sleep(3000);
        save_crop_pest_data.click();
        logger3.log(Status.PASS, "Save crop/pest button got clicked successfully");


        Thread.sleep(3000);
        close.click();
        logger3.log(Status.PASS, "After saving close button got clicked successfully");


        Thread.sleep(4000);
        Approve.click();
        logger3.log(Status.PASS, "Approve button got clicked successfully");


        Thread.sleep(2000);
        checkbox_publishnow.click();
        logger3.log(Status.PASS, "Publish now checkbox got clicked successfully");


        Thread.sleep(3000);
        save_checkbox.click();
        logger3.log(Status.PASS, "After selecting checkbox save button got clicked successfully");

       // Thread.sleep(3000);
       // again_enhanced_information.click();

        //Comment code from pperequirementclick till save enhancedbutton click

      /*  js.executeScript("window.scrollBy(0,3000)");  //PPE Requirements
        Thread.sleep(2000);
        PPE_Requirement.click();

        Thread.sleep(3000);
        PPE_Requirement_search.sendKeys("boots");

        Thread.sleep(3000);
        PPE_Requirement_search_value.click();

        Thread.sleep(3000);
        save_newitem.click();

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        save_enhanced_button.click();
*/
        Thread.sleep(3000);
        again_country_use_tab.click();

        Thread.sleep(3000);
        product_management.click();





    }





}
