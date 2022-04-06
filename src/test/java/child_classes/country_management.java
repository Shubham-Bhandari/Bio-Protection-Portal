package child_classes;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class country_management extends Home_Page {

    @FindBy(linkText = "Product management")
    WebElement productmanagementtab;

    @FindBy(linkText = "Country Management")
    WebElement countrymanagement;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Search Country']")
    WebElement searchbox;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Search Country']")
    WebElement searchbox_button;












    public void view_countrymanagement() throws InterruptedException {

        Thread.sleep(3000);
        productmanagementtab.click();
        logger5.log(Status.PASS, "Productmanagement button got clicked successfully ");

        Thread.sleep(3000);
        countrymanagement.click();
        logger5.log(Status.PASS, "country management tab got clicked successfully");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Thread.sleep(3000);
//        searchbox.click();
        logger5.log(Status.PASS, "User Search by country name");

        searchbox_button.sendKeys("Isle of Man");
        logger5.log(Status.PASS, "Country name serched successfully ");



    }
}
