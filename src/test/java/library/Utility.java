package library;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Utility {

    public static String  attachscreenshotreport(WebDriver driver, String screenshotname)
    {
        TakesScreenshot ts=(TakesScreenshot)driver;

        File source=ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"/screenshot_for_failed_testcase/"+screenshotname+".png";
        File destination= new File(path);


        try
        {
            FileUtils.copyFile(source, destination);
        }
        catch (Exception e)
        {

        }
        return path;


    }
}
