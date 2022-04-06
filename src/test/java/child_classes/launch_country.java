package child_classes;

import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.TableHeaderUI;
import java.util.Set;

public class launch_country extends Home_Page {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(linkText = "Product management")
    WebElement productmanagement;

    @FindBy(linkText = "Launch a Country")
    WebElement Launch_Country;

    @FindBy(name = "CountryCode")
    WebElement country_list;

    @FindBy(name = "CountryCode")
    WebElement country_list_view;


    @FindBy(xpath = "/html/body/div/main/div/div[1]/div[1]/div/div[2]/table/tfoot/tr/th[1]/input")
    WebElement search_product;

    @FindBy(xpath = "/html/body/div/main/div/div[1]/div[1]/div/div[2]/table/tfoot/tr/th[1]/input")
    WebElement search_product_view;

    @FindBy(linkText = "Regression Test")
    WebElement select_product;

    @FindBy(id = "btnApprove")
    WebElement approve;

    @FindBy(id = "publish")
    WebElement publish_now;

    @FindBy(id = "qa-approve-button-confirm")
    WebElement save_button;


    public void view_country() throws InterruptedException {
        Thread.sleep(3000);
        productmanagement.click();

        Thread.sleep(3000);
        Launch_Country.click();
        logger6.log(Status.PASS, "Launch Country tab got clicked successfully");

        Thread.sleep(2000);
        country_list.click();
        logger6.log(Status.PASS, "Dropdown list got clicked successfully");


        Thread.sleep(3000);
        Select s = new Select(country_list_view);
        s.selectByValue("IM");
        logger6.log(Status.PASS, "Country selected successfully");

        Thread.sleep(3000);
        search_product.click();
        logger6.log(Status.PASS, "User search for created product");

        Thread.sleep(2000);
        search_product_view.sendKeys("Regression Test");
        logger6.log(Status.PASS, "Searched product found successfully");


        Thread.sleep(3000);
        select_product.click();
        logger6.log(Status.PASS, "Product got clicked successfully");

        //Window Handel
        String parent = driver.getWindowHandle();
        System.out.println("parent window id is:"+parent);
        Set<String> Allwindow = driver.getWindowHandles();
        for (String child : Allwindow)
        {
            if (!parent.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
                System.out.println("child window title is:"+driver.getTitle());

                Thread.sleep(5000);
                js.executeScript("window.scrollBy(0,8000)");


                approve.click();
                logger6.log(Status.PASS, "Approve button got clicked successfully");

                Thread.sleep(3000);
                publish_now.click();
                logger6.log(Status.PASS, "Publish now check box selected successfully");

                Thread.sleep(3000);
                save_button.click();
                logger6.log(Status.PASS, "Save button got clicked successfully");
                driver.close();
            }
        }
        driver.switchTo().window(parent);

    }
}










