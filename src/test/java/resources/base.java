package resources;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class base {

    public static WebDriver driver;
    static Properties prop;


    public void  initializeDriver() throws Throwable {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("E:\\Bioprotection_Portal\\src\\test\\java\\resources\\data.properties");
        prop.load(fis);


        String browserName = prop.getProperty("browser");


        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\Bioprotection_Portal\\Drivers\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(getobject("url"));

            //retrieve the cookies to view the newly added cookie
            Set<Cookie> cookiesList =  driver.manage().getCookies(); //Capture all cookies from browser
            System.out.println("Total size of cookies:"+cookiesList.size()); // Print size of cookies

            //For creating a new cookie we should pass the name of the cookie and its value
            Cookie cname = new Cookie(".AspNetCore.Cookies", "CfDJ8GnefBU7svRAnLK_NUTEk_nxR6gMsQvQ3j9Im8L165xTig04CLoTYrKmpVM0wPkb4BX1otTsdvg3s0e0dLMK0UoA53CmbNJgx5LegFdWrQYXP0aakyVFYnXiGdYsfQRB6uAzajnVT9TkBjMudfkvPVpjexK_Yslr57uwN9Svl7FHeDT5dhDdkEAAoRTDiGwsSvoOKif5qOaHFb8vt2dK2i7eJoECyQ45dXfxnsU3EDwJKoqgC1z-NSzd83wtb6mbZA9P5mFrsg7kXtrNaICxzasVYUA34yHGtWIawoNGxHEr-rbYYGVEUtwycaHbfTdVA7kPsFAh3p9PeyQXuDAj_DCenaDOVjdgFiYFA4_FtetD7uXz3AxbR7Rx7cEBTVSqruzxfqlhl2UpRVqPY_c0ChMUQUNQdZHWmmwlK-VL9PBT-Ho4CuIQmbWLV-dlA2_5ZICW85qZSHl2jcuyztEH2s1kxyXd9PYsZNIOREREo8nsSTiWVKxj-IyzR2PbeWsWGg_upPiC0ZN6aeWii2BV9obgZyrDMvCiWql9e1jR6aXOa_z4_loCWK6hkwvvzd9RpSbl8Xpd21EMTmh38KwFSjFYm8dOsX2TIEAOqPreyiprOti2qosmQ_i6zcxM18HAlm7sALmCr_8erwEYHMVgKVYDQRTIzdI9KHu1xQJsdKExZ6cxlYLUSG8bAmhChDlsNhHow5xGEoKE4uu607zbOSSP_BcsapCtW1u0IXI11MuoyscUn7_Qqjy7ZYH1lRzVI8MadeURhcmPQn3mpCzEFuUcaQIRspqF2_Hr8xlGO62WaO3lglrTnBoQhFx5czTgBWpKxMf6RRuFY5rEFI0-ugdwwG7DA7FHM5xzcpJtV7yQddqq2zmAg-J3DGXtmn6oT31ZLtfD44IXESAwWngtLaCzcAJ3h12aJrlnAGqsdSTzZ9IcmgbW3rkzcy1SI9GWguKrQcO9-SwjB04y0YotBZZyIw_T60SG-_ne19IMGfWGtosqBer8pLKVxVF55Gebz5Fn8Vl_0ZmqxKvmcMbzAETh-6Rn06bFx5lrFT1yLyGpck7PPWz5EvQIVVjGE0e3QxUs-uhEF3m2vwsUWIuzNhzC2gtQdKJlNJ8sD4X9AUTIZ2ND0tEKZh-bE4Hh4AEAzpOWGdMLX9nyqaIiQchDbC2L9qOkNjUbpw9sX1r80BsEEDA-U2Bip9ANDU4NCC0_etxLDxj8778vk7IQfQ9Dd1F5ihzCnf5KLD6_xnM9b7uJuc3A-K-ThCnraaDb2BnZE0rLW7SWHpntjFuUN4Xy8Dw");
            driver.manage().addCookie(cname);

            cookiesList=driver.manage().getCookies();

            System.out.println("Cookies Found:" +cookiesList.size());


                for(Cookie getcookies :cookiesList)
                {
                System.out.println(getcookies.getName()+" : "+getcookies.getValue());
            }
        }


        else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\Bioprotection_Portal\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(getobject("url"));
        }
    }


    public String getobject(String Data) throws Throwable
    {

        String data = prop.getProperty(Data);
        return data;
    }


    public void teardown()
    {
        driver.close();
    }
}
