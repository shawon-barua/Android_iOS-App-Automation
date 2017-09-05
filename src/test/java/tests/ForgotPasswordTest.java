package tests;


import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.AppInitializer;
import views.*;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ForgotPasswordTest {

    AppiumDriver driver;
    SignInView signInView;
    ForgotPasswordView forgotPasswordView;
    WebDriverWait wait;

    @Before
    public void setup() throws MalformedURLException {

        AppInitializer appInitializer=new AppInitializer();
        this.driver=appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 60);

        signInView=new SignInView(driver);
        forgotPasswordView = new ForgotPasswordView(driver);
    }

    //TC/ForgotPassword/001	Verify that user can reset password by sending reset email
    @Test
    public void verifyResetPassword(){
        signInView.navigateToForgotPasswordView();
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordView.emailAddress));
        Assert.assertEquals("Problem for Forgot Password","Please check your account for reset email.", forgotPasswordView.forgotPassword("nadimsaker@gmail.com"));
    }

    // TC/ForgotPassword/002	Verify that error message is displayed if email address is blank
    @Test
    public void verifyResetPasswordBlankEmailErrorMessage(){
        signInView.navigateToForgotPasswordView();
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordView.emailAddress));
        Assert.assertEquals("Problem for Forgot Password","Email is required.", forgotPasswordView.forgotPassword(""));
    }

    //TC/ForgotPassword/003	Verify that error message is displayed for unregistered email address
    @Test
    public void verifyResetPasswordUnRegisteredEmailErrorMessage(){
        signInView.navigateToForgotPasswordView();
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordView.emailAddress));
        Assert.assertEquals("Problem for Forgot Password","Sorry! There is no account with this email.", forgotPasswordView.forgotPassword("nadim@gmail.com"));
    }

    //TC/ForgotPassword/004	Verify that error message is displayed if email address is invalid
    @Test
    public void verifyResetPasswordInvalidEmailErrorMessage(){
        signInView.navigateToForgotPasswordView();
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordView.emailAddress));
        Assert.assertEquals("Problem for Forgot Password","Email is not valid.", forgotPasswordView.forgotPassword("nadimgmail.com"));
    }

    @After
    public void  tearDown(){

        driver.quit();
    }










}
