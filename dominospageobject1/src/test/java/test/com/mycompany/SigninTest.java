/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.dominospageobject.FileUtil1;
import com.mycompany.dominospageobject.SigninPage1;
import com.mycompany.dominospageobject.SigninPage2;
import com.mycompany.dominospageobject.SigninPage3;
import com.mycompany.dominospageobject.SigninPage4;
import com.mycompany.dominospageobject.SigninPage5;
import com.mycompany.dominospageobject.SignoutPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */
// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}
public class SigninTest {

    private static WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;
    public SigninTest() {
    }

   
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        js = (JavascriptExecutor) driver;
         
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void executeSigninPageModule() throws Exception {
        SigninPage1 signinpage1 = PageFactory.initElements(driver, SigninPage1.class);
        signinpage1.signinToFlighApplication();

    }

    @Test
    public void executeSignoutPage() throws Exception {
        SignoutPage signout = PageFactory.initElements(driver, SignoutPage.class);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[2]/li[1]/div/button")));
        signout.signoutPage();
        Thread.sleep(2000);
        driver.close();
        
    }

    @Test
    public void executeSigninPage2Module() throws Exception {
        SigninPage2 signinpage2 = PageFactory.initElements(driver, SigninPage2.class);
        signinpage2.signinToFlighApplication();
    }

    @Test
    public void executeSigninPage3Module() throws Exception {
        SigninPage3 signinpage3 = PageFactory.initElements(driver, SigninPage3.class);
        signinpage3.signinToFlighApplication();
    }

    @Test
    public void executeSigninPage4Module() throws Exception {
        SigninPage4 signinpage4 = PageFactory.initElements(driver, SigninPage4.class);
        signinpage4.signinToFlighApplication();
    }

    @Test
    public void executeSigninPage5Module() throws Exception {
        SigninPage5 signinpage5 = PageFactory.initElements(driver, SigninPage5.class);
        signinpage5.signinToFlighApplication();
    }
    
  
  @Test
    public void executekeepmesignedInModule() throws Exception {
        SigninPage1 signinpage1 = PageFactory.initElements(driver, SigninPage1.class);
        signinpage1.signinToFlighApplication();
    }
     

}
    
    
    

