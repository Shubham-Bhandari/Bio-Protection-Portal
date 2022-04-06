package child_classes;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class list_management extends Home_Page {

    @FindBy(linkText = "List Management")
    WebElement list_management;

    @FindBy(id="ListType")
    WebElement dropdown;

    @FindBy(id="ListType")
    WebElement dropdown_value;

    @FindBy(xpath="//input[@placeholder='Search Name']")
    WebElement searching_crop;

    @FindBy(xpath="//input[@placeholder='Search Name']")
    WebElement searching_crop_value;

    @FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr/td[1]/span")
    WebElement icon;

    @FindBy(xpath="//input[@placeholder='Search Name']")
    WebElement searching_crop_again;

    @FindBy(xpath="//input[@placeholder='Search Name']")
    WebElement searching_crop_value_again_2;

    @FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr/td[1]/span")
    WebElement icon_again;

    @FindBy(id = "mergeSelectionEN0")
    WebElement radio_button_en;

    @FindBy(id = "mergeSelectionAR1")
    WebElement radio_button_ar;

    @FindBy(id = "merge-records-button")
    WebElement merge_record;

    @FindBy(id = "merge-records-save-button")
    WebElement save_mergerecord;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement ok;

    @FindBy(xpath = "//a[text()='demo123']")
    WebElement after_merging_crop;

    @FindBy(id = "edit-item-save-button")
    WebElement save;

    //Pest Merging Functionality

    @FindBy(id = "ListType")
    WebElement pest_dropdown;

    @FindBy(id = "ListType")
    WebElement pest_dropdown_value;

    @FindBy(xpath = "//input[@placeholder = 'Search Name']")
    WebElement click_for_pest;

    @FindBy(xpath = "//input[@placeholder = 'Search Name']")
    WebElement search_for_pest_1;

    @FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td[1]/span")
    WebElement pest1_icon;

    @FindBy(xpath = "//input[@placeholder = 'Search Name']")
    WebElement search_for_pest_2;

    @FindBy(xpath = "//*[@id=\"myTable\"]/tbody/tr[1]/td[1]/span")
    WebElement pest2_icon;

    @FindBy(id = "mergeSelectionEN0")
    WebElement pest_radio_button_en;

    @FindBy(id = "mergeSelectionAR1")
    WebElement Pest_radio_button_ar;

    @FindBy(id = "merge-records-button")
    WebElement merge_record_pest;


    @FindBy(id = "merge-records-save-button")
    WebElement save_mergerecord_pest;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement ok_pest;

    @FindBy(xpath = "//a[text()='pest1234']")
    WebElement after_merging_pest;

    @FindBy(id = "edit-item-save-button")
    WebElement save_pest_button;











    public void view_list() throws InterruptedException {
        Thread.sleep(3000);
        list_management.click();
        logger4.log(Status.PASS, "List Management Tab got clicked successfully");

        Thread.sleep(3000);
        dropdown.click();
        logger4.log(Status.PASS, "Dropdown button  got clicked successfully");

        Thread.sleep(3000);
        Select value=new Select(dropdown_value);
        value.selectByValue("Crop");
        logger4.log(Status.PASS, "Dropdown values  got selected successfully");

        Thread.sleep(2000);
        searching_crop.click();

        Thread.sleep(2000);
        searching_crop_value.sendKeys("demo123");
        logger4.log(Status.PASS, "Value entered successfully");

        Thread.sleep(2000);
        icon.click();
        logger4.log(Status.PASS, "Merged button  got clicked successfully");

        Thread.sleep(2000);
        searching_crop_value.clear();
        logger4.log(Status.PASS, "Previously searched crop  got clear successfully");

        Thread.sleep(3000);
        searching_crop_again.click();
        logger4.log(Status.PASS, "Value entered successfully");

        Thread.sleep(3000);
        searching_crop_value_again_2.sendKeys("demo1234");
        logger4.log(Status.PASS, "Searching for second crop to be merged with");

        Thread.sleep(2000);
        icon_again.click();
        logger4.log(Status.PASS, "Merged button  got clicked successfully");

        Thread.sleep(2000);
        radio_button_en.click();
        logger4.log(Status.PASS, "Radio button for en got clicked successfully");

        Thread.sleep(2000);
        radio_button_ar.click();
        logger4.log(Status.PASS, "Radio button for ar  got clicked successfully");

        Thread.sleep(3000);
        merge_record.click();
        logger4.log(Status.PASS, "Merged button  got clicked successfully");


        Thread.sleep(3000);
        save_mergerecord.click();
        logger4.log(Status.PASS, "Save button got clicked Successfully");

        Thread.sleep(2000);
        ok.click();
        logger4.log(Status.PASS, "OK button  got clicked successfully");

        Thread.sleep(2000);
        searching_crop_value.clear();
        logger4.log(Status.PASS, "Previously searched crop  got clear successfully");

        Thread.sleep(2000);
        searching_crop_value.sendKeys("demo123");
        logger4.log(Status.PASS, "Value entered successfully");

        Thread.sleep(2000);
        after_merging_crop.click();
        logger4.log(Status.PASS, "demo1234 crop got merged successfully in crop demo123");

        Thread.sleep(3000);
        save.click();
        logger4.log(Status.PASS, "Save button  got clicked successfully");

        //Pest Merging Functionality

        Thread.sleep(3000);
        pest_dropdown.click();
        logger4.log(Status.PASS, "Dropdown button  got clicked successfully");

        Select pest= new Select(pest_dropdown_value);
        pest.selectByValue("Pest");
        logger4.log(Status.PASS, "Pest value got selected successfully");

        Thread.sleep(2000);
        click_for_pest.click();
        logger4.log(Status.PASS, "selected values got selected successfully");

        Thread.sleep(2000);
        searching_crop_value.clear();
        logger4.log(Status.PASS, "Previously searched value cleared successfully");

        Thread.sleep(3000);
        search_for_pest_1.sendKeys("pest1234");
        logger4.log(Status.PASS, "serach for pest1 got successfully");

        Thread.sleep(2000);
        pest1_icon.click();
        logger4.log(Status.PASS, "Merge icon button  got clicked successfully");

        Thread.sleep(2000);
        searching_crop_value.clear();
        logger4.log(Status.PASS, "Previously searched value cleared successfully");

        Thread.sleep(3000);
        search_for_pest_2.sendKeys("pest12345");
        logger4.log(Status.PASS, "serach for pest2 got successfully");

        Thread.sleep(2000);
        pest2_icon.click();
        logger4.log(Status.PASS, "Merge icon button  got clicked successfully");

        Thread.sleep(2000);
        pest_radio_button_en.click();
        logger4.log(Status.PASS, "Radio button for EN  got clicked successfully");

        Thread.sleep(2000);
        Pest_radio_button_ar.click();
        logger4.log(Status.PASS, "Radio button for AR  got clicked successfully");

        Thread.sleep(3000);
        merge_record_pest.click();
        logger4.log(Status.PASS, "Merged Record button for Pest got clicked successfully");

        Thread.sleep(3000);
        save_mergerecord_pest.click();
        logger4.log(Status.PASS, "Save button got clicked successfully");

        Thread.sleep(2000);
        ok_pest.click();
        logger4.log(Status.PASS, "OK button got clicked successfully");

        Thread.sleep(2000);
        searching_crop_value.clear();
        logger4.log(Status.PASS, "Previously searched value got clear successfully");

        Thread.sleep(3000);
        search_for_pest_1.sendKeys("pest1234");

        Thread.sleep(3000);
        after_merging_pest.click();
        logger4.log(Status.PASS, "pest12345 got merged successfully in pest1234");

        Thread.sleep(3000);
        save_pest_button.click();
        logger4.log(Status.PASS, "Save button got clicked successfully");




    }
}
