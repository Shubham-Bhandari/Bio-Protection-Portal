package child_classes;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import library.Utility;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.base;

public class Home_Page extends base {

    public static ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./Report/home.html");
    public static ExtentReports extent = new ExtentReports();

    public static ExtentTest logger1,logger2,logger3,logger4,logger5,logger6,logger7,logger8,logger9;




    @Test(priority = 1)
    public void browser_opening() throws Throwable
    {

        Testcase_for_Home_report test= new Testcase_for_Home_report();
        test.testcase_creation();
        initializeDriver();

    }

    @Test(priority=2)
    void title_verification() throws InterruptedException
    {

        Title_verification.website_title_verification("Home Page - BioProtection Portal Admin");
    }

    @Test(priority = 3)
    void login_test() throws Throwable {
        Login log= PageFactory.initElements(driver, Login.class);
        log.login(getobject("email"),getobject("password"));
    }

    @Test(priority = 4)
    void product_test() throws InterruptedException {
        product_management product= PageFactory.initElements(driver,product_management.class);
        product.viewproduct();
    }

    @Test(priority = 5)
    void view_list_of_ingredients() throws InterruptedException {
        list_management list= PageFactory.initElements(driver,list_management.class);
        list.view_list();
    }

   // @Test(priority = 6)
    void countrymanagement() throws InterruptedException {
        country_management country= PageFactory.initElements(driver,country_management.class);
        country.view_countrymanagement();
    }

    //@Test(priority = 7)
    void country_launch() throws InterruptedException {
        launch_country l=PageFactory.initElements(driver,launch_country.class);
        l.view_country();
    }

   // @Test(priority = 8)
    void management_details() throws InterruptedException {
        manufacture_registrant_details m=PageFactory.initElements(driver,manufacture_registrant_details.class);
        m.view_registrant_details();
    }

    // @Test(priority = 9)
     void upload_data() throws InterruptedException {
        data_management migration=PageFactory.initElements(driver,data_management.class);
        migration.U_data();
     }




    @AfterMethod
    void fail_testcase(ITestResult result)
    {
        try {

            if(ITestResult.FAILURE==result.getStatus())
            {
                String temp= Utility.attachscreenshotreport(driver, result.getName());


                logger3.fail("Testcase name"+ result.getName());
                logger3.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }



    @AfterSuite
    void browser_closing()
    {
        //teardown();
        extent.flush();
    }


}
