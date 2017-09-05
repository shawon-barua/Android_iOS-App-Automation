package tests;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.AppInitializer;
import views.SignInView;
import views.SignUpView;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Random;



public class SignUpTest {

    AppiumDriver driver;
    SignUpView signUpView;
    WebDriverWait wait;

    @Before
    public void setup() throws MalformedURLException {

        AppInitializer appInitializer=new AppInitializer();
        this.driver = appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        signUpView=new SignUpView(driver);

        SignInView signInView =new SignInView(driver);
        signInView.navigateToSignUpView();
    }



    //TC/SignUp/001	Verify that user can signup using all the available fields
    //TC/SignUp/003	Verify that user can add Fitness level/Intensity selection
    //TC/SignUp/013	Verify that height will be displayed as Feet and inchs as spinner
    //TC/SignUp/014	Verify that weight will be displayed as lbs as spinner
    //TC/SignUp/015	Verify that date of birth will be displayed as Month/day/year format
    //TC/SignUp/016	Verify that height/weight/birthdate selector will be displayed at the center screen
    @Test
    public void verifyCustomUserSignUp ()
    {
//        SignInView signInView =new SignInView(driver);
//        signInView.navigateToSignUpView();
        String rand = Long.toString(System.currentTimeMillis());
        String confirmMsg = signUpView.signUpCustomUser("FirstName"+rand, "LastName"+rand,"nadimsaker+"+rand+"@gmail.com","Pa123456","male","12/8/1977","54","50","Beginner");
        Assert.assertEquals("A verification link has been sent to your email. Please confirm.",confirmMsg);
    }


    //TC/SignUp/002	Verify that error message is displayed for mandetory field absent
    @Test
    public void verifyErrorMessageForMandetoryField ()
    {
//        SignInView signInView =new SignInView(driver);
//        signInView.navigateToSignUpView();

        String rand = Long.toString(System.currentTimeMillis());

        String errorMsg = signUpView.signUpCustomUser("", "","","","","","","","");
        Assert.assertEquals("First Name is required.",errorMsg);

        errorMsg = signUpView.signUpCustomUser("FirstName", "","","","","","","","");
        Assert.assertEquals("Last Name is required.",errorMsg);

        errorMsg = signUpView.signUpCustomUser("FirstName", "Last Name","","","","","","","");
        Assert.assertEquals("Email is required.",errorMsg);

        errorMsg = signUpView.signUpCustomUser("FirstName", "Last Name","fea"+rand+"@gmail.com","","","","","","");
        Assert.assertEquals("Password is required.",errorMsg);

        errorMsg = signUpView.signUpCustomUser("FirstName", "Last Name","fea"+rand+"@gmail.com","Pa123456","","","","","");
        Assert.assertEquals("Weight is required.",errorMsg);

        errorMsg = signUpView.signUpCustomUser("FirstName", "Last Name","fea"+rand+"@gmail.com","Pa123456","","","","50","");
        Assert.assertEquals("A verification link has been sent to your email. Please confirm.",errorMsg);
    }


    //TC/SignUp/004	Verify that user can add First name and last name upto a certain length(30 chars)
    //write more than 30 chars and get the actual length
    @Test
    public void verifyNameMaxLength(){
        Assert.assertEquals("Length missmatched",30,signUpView.getFirstNameLength("Lorem ipsum dolor sit volutpat."));
        Assert.assertEquals("Length missmatched",30,signUpView.getLastNameLength("Lorem ipsum dolor sit volutpat."));
    }


    //TC/SignUp/005	Verify that error message is displayed for invalid email address
    @Test
    public void verifyErrorMessageForInvalidEmailAddress(){

        String errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid","","","","","","");
        Assert.assertEquals("Email is not valid.",errorMsg);

        errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid@","","","","","","");
        Assert.assertEquals("Email is not valid.",errorMsg);

        errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid@valid.","","","","","","");
        Assert.assertEquals("Email is not valid.",errorMsg);

        errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid@valid.com","","","","","","");
        Assert.assertEquals("Password is required.",errorMsg);
    }


    //TC/SignUp/006	Verify that error message is displayed for password Format(8 Char, 1 upper case, 1 number)
    @Test
    public void verifyErrorMessageForInvalidPasswordFormat(){

        //8 char check and lower case
        String errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid@valid.com","abc","","","","","");
        Assert.assertEquals("Password should be 8 characters long with at least 1 uppercase letter, 1 lower case letter and 1 digit or symbol.",errorMsg);

        //upper case
        errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid@valid.com","AA","","","","","");
        Assert.assertEquals("Password should be 8 characters long with at least 1 uppercase letter, 1 lower case letter and 1 digit or symbol.",errorMsg);

        //Lower case
        errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid@valid.com","aa","","","","","");
        Assert.assertEquals("Password should be 8 characters long with at least 1 uppercase letter, 1 lower case letter and 1 digit or symbol.",errorMsg);

        //digit
        errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid@valid.com","11","","","","","");
        Assert.assertEquals("Password should be 8 characters long with at least 1 uppercase letter, 1 lower case letter and 1 digit or symbol.",errorMsg);

        //upper case, Lower case, digit
        errorMsg = signUpView.signUpCustomUser("First Name", "Last Name","invalid@valid.com","Pa123","","","","","");
        Assert.assertEquals("Password should be 8 characters long with at least 1 uppercase letter, 1 lower case letter and 1 digit or symbol.",errorMsg);

        //upper case, Lower case, digit and 8 char
        errorMsg = signUpView.signUpCustomUser("FirstName", "Last Name","fea@gmail.com","Pa123456","","","","","");
        Assert.assertEquals("Weight is required.",errorMsg);
    }


    //TC/SignUp/007	Verify that error message is displayed if password and confirmed password does not match
    @Test
    public void verifyErrorMessageForMismatchedPassword(){
        String errorMsg = signUpView.errorMessageForPasswordMismatch("FirstName", "Last Name","fea@gmail.com","Pa123456","","","","","");
        Assert.assertEquals("Password does not match.",errorMsg);
    }


    //TC/SignUp/012	Verify thta tapping on "Terms of Use" link goes to health disclaimer view
    @Test
    public void verifyTermsOfUse(){
        Assert.assertEquals("TERMS OF SERVICE AGREEMENT", signUpView.getTermsOfUsePageText());
    }


    //TC/SignUp/019	Verify that user can signup using facebook
    @Test
    public void verifySignUpAsFacebookUser ()
    {
        Assert.assertEquals("Title missmatched", "WORKOUTS", signUpView.signUpFacebookUser("featest2016@gmail.com","Pa1234567"));
    }

    //TC/SignUp/020	Verify that user can signup using twitter
    @Test
    public void verifySignUpAsTwitterUser ()
    {
        Assert.assertEquals("Title missmatched", "Weight is required to calculate calorie burn.", signUpView.signUpTwitterUser("featest2016@gmail.com","goal@2015."));
    }


    /* Not automated (To Do : later)
    TC/SignUp/008	Verify that user can upload his profile photo
    TC/SignUp/009	Verify that error message is displayed for invalid image format
    TC/SignUp/010	Verify that error message is displayed for large size image
    TC/SignUp/011	Verify that uploaded image can be viewed in the profile
    TC/SignUp/017	Verify that user can add Photo from Gallery and taking current snap using device camera
    TC/SignUp/018	Verify that Front camera will be displayed by default when use Camera option
    */


    @After
    public void testDown(){

       driver.quit();
    }
}
