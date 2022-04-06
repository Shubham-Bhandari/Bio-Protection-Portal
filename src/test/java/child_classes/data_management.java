package child_classes;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class data_management extends Home_Page{
    @FindBy(linkText = "Product management")
    WebElement productmanagementtab;

    @FindBy(linkText = "Upload excel files")
    WebElement upload_file;

    @FindBy(id="dataFiles")
    WebElement choose_file;

    @FindBy(xpath="//button[text()='Upload File']")
     WebElement Upload_data_file;



    public void U_data() throws InterruptedException {
        Thread.sleep(3000);
        productmanagementtab.click();
        logger8.log(Status.PASS, "Productmanagement tab got clicked successfully ");

        Thread.sleep(3000);
        upload_file.click();
        logger8.log(Status.PASS, "upload_file button got clicked successfully ");


        Thread.sleep(3000);
        choose_file.sendKeys("E:\\Bioprotection_Portal\\Documents\\PartnerReports.xlsx");
        logger8.log(Status.PASS, "File get selected successfully ");

        Thread.sleep(3000);
        Upload_data_file.click();
        logger8.log(Status.PASS, "Selected file uploaded successfully ");




    }

}
