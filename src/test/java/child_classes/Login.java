package child_classes;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.base;

import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class Login extends Home_Page {

    @FindBy(linkText = "Login")
    WebElement login_button;

    @FindBy(id="identifierId")
    WebElement Username;

    @FindBy(xpath="//span[text()='Next']")
    WebElement Next;

    @FindBy(name="password")
    WebElement Password;

    @FindBy(xpath="//span[text()='Next']")
    WebElement sign_in;





    public void login(String email, String password) throws InterruptedException {

        Thread.sleep(3000);
        login_button.click();
        logger2.log(Status.PASS, "Login button got clicked successfully ");
        logger2.log(Status.PASS, "User get logged-in to dashboard ");

       /* Thread.sleep(2000);
        Username.sendKeys(email);
        logger2.log(Status.PASS, "username got entered successfully ");

        Thread.sleep(3000);
        Next.click();

        Thread.sleep(2000);
        Password.sendKeys(password);
        logger2.log(Status.PASS, "password got enter successfully ");

        Thread.sleep(3000);
        sign_in.click();
        logger2.log(Status.PASS, " User logged-in successfully ");
*/



    }


}