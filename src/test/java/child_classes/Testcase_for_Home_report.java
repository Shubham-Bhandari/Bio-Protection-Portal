package child_classes;

public class Testcase_for_Home_report extends Home_Page{

    public void testcase_creation()
    {
        extent.attachReporter(htmlReporter);

        logger1= extent.createTest("Title Verification Test");
        logger2= extent.createTest("Login Test");
        logger3=extent.createTest("Global Product Management");
        logger4=extent.createTest("List Management");
        logger5=extent.createTest("Country Management");
        logger6=extent.createTest("Launch Country");
        logger7=extent.createTest("Manufacturer and Registrant Details");
        logger8=extent.createTest("Data Migration Tool");






        logger9= extent.createTest("Screenshot for failed testcase");
    }
}
