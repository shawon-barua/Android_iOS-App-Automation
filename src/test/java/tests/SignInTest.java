package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
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

public class SignInTest {

    AppiumDriver driver;
    SignInView signInView;
    WorkoutsView workoutsView;
    TabBarView tabBarView;
    SettingsView settingsView;
    WebDriverWait wait;
    SignUpView signUpView;
    AppiumDriverLocalService service1;
    @Before
    public void setup() throws MalformedURLException {

        AppInitializer appInitializer=new AppInitializer();
       // appInitializer.launchEmulator();
        service1=appInitializer.service1();

        this.driver=appInitializer.getDriver();



        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 100);

        signInView=new SignInView(driver);
        workoutsView=new WorkoutsView(driver);
        tabBarView = new TabBarView(driver);
        settingsView = new SettingsView(driver);
        signUpView = new SignUpView(driver);
    }

    //TC/Signin/001 Verify that user can Sign in with valid username and password
    @Test
    public void vedrifySignInUsernameAndPassword() {
        signInCustomUser("shawon.barua@infolytx.com","Pa1234567");
    }

    //TC/SignIn/002	Verify that user can sign in with Facebook(Signed in)
    @Test
    public void verifySignInFacebook() {
        signInFBUser();
    }

    //TC/SignIn/003	Verify that user can sign in with twitter(Signed in)
    @Test
    public void verifySignInTwitter() {
        signInTwitterUser();
    }

    //TC/SignIn/004	Verify that error message is displayed for blank username and password
    @Test
    public void verifyBlankUsernamePassword() {
        signInView.signInEmailAndPassword("","");
        Assert.assertTrue(signInView.errorMessageAlertWindow.isDisplayed());
        Assert.assertEquals("Enter email and password.", signInView.getAlertErrorMessage());
        signInView.errorMessageAlertOKButton.click();
    }

    //TC/SignIn/005	Verify that error message is displayed for invalid username and password
    @Test
    public void verifyInvalidUsernamePassword() {
        //Invalid Email and Valid password
        signInView.signInEmailAndPassword("abc","456");
        Assert.assertTrue(signInView.errorMessageAlertWindow.isDisplayed());
        Assert.assertEquals("Email is not valid.", signInView.getAlertErrorMessage());
        signInView.errorMessageAlertOKButton.click();


        //Valid Email and invalid password
        signInView.signInEmailAndPassword("abc@pqr.com","456");
        Assert.assertTrue(signInView.errorMessageAlertWindow.isDisplayed());
        Assert.assertEquals("Password is incorrect.", signInView.getAlertErrorMessage());
        signInView.errorMessageAlertOKButton.click();

    }

    //Valid email with invalid password(proper syntax)

    //TC/SignIn/006	Verify that user can signed in as Guest user
    @Test
    public void verifySignInAsGuestUser() {
        signInGuestUser();
    }

    //TC/SignIn/007	Verify that user can switched from Guest user to Custom user
    @Test
    public void verifyGuestUserToCustomUser(){
        //Guest User
        signInGuestUser();
        //Custom user
        signInCustomUser("nadimsaker+7@gmail.com","Pa123456");
    }

    //TC/SignIn/008	Verify that user can switched from Guest user to FB user
    @Test
    public void verifyGuestUserToFBUser(){
        //Guest user
        signInGuestUser();
        //FB User
        signInFBUser();
    }

    //TC/SignIn/009	Verify that user can switched from Guest user to Twitter user
    @Test
    public void verifyGuestUserToTwitterUser(){
        //Guest user
        signInGuestUser();

        //Twitter User
        signInTwitterUser();
    }

    //TC/SignIn/010	Verify that user can signed in/out from FB three times
    @Test
    public void verifySignInOutFBThreeTimes(){
        for(int i = 1; i<=3; i++) {
            signInFBUser();
        }
    }

    // TC/SignIn/011	Verify that user can signed in/out from twitter three times
    @Test
    public void verifySignInOutTwitterThreeTimes(){
        for(int i = 1; i<=3; i++) {
        signInTwitterUser();
        }
    }

    //TC/SignIn/012	Verify that user can signed in/out from custom three times
    @Test
    public void verifySignInOutCustomAccountThreeTimes(){
        for(int i = 1; i<=3; i++) {
            signInCustomUser("nadimsaker+7@gmail.com","Pa123456");
        }
    }

    //Create account link check
    //TC/SignIn/014	Verify that tapping on Create an Account link will go to Sign up page
    @Test
    public void verifyCreateAnAccountLink(){
        signInView.navigateToSignUpView();
        Assert.assertTrue(signUpView.signupButton.isDisplayed());
    }

    //TC/SignIn/013	Verify that guest session expired message is displayed after after 24 hours guest session
    @Test
    public void verifyGuestUserSessionExpiration() {
        Assert.assertEquals("Warning is not displayed.","You have expired session as a Guest. Please login/Signup.",signInView.guestUserSessionExpiration());
    }
    @Test
    public void test() {

        signInView.signInEmailAndPassword("shawon.barua@infolytx.com","Pa123456");
    }


    private void signOut(){
        tabBarView.navigateToSettingsTab();
        settingsView.signOut();
    }

    private void signInFBUser(){
        signInView.signInWithFacebook();
        Assert.assertEquals("Mismatched Title","WORKOUTS",workoutsView.getWorkoutsViewTitle());
        signOut();
        wait.until(ExpectedConditions.visibilityOf(signInView.emailAddress));
    }

    private void signInTwitterUser(){
        signInView.signInWithTwitter();
        Assert.assertEquals("Mismatched Title","WORKOUTS",workoutsView.getWorkoutsViewTitle());
        signOut();
        wait.until(ExpectedConditions.visibilityOf(signInView.emailAddress));

    }

    private void signInCustomUser(String email, String password){
        signInView.signInEmailAndPassword(email,password);
        wait.until(ExpectedConditions.visibilityOf(workoutsView.workoutsViewTitle));
        Assert.assertEquals("Mismatched Title","WORKOUTS",workoutsView.getWorkoutsViewTitle());
        signOut();
        wait.until(ExpectedConditions.visibilityOf(signInView.emailAddress));
    }

    private void signInGuestUser() {
        signInView.signInAsGuestUser();
        wait.until(ExpectedConditions.visibilityOf(workoutsView.workoutsViewTitle));
        Assert.assertEquals("Mismatched Title","WORKOUTS",workoutsView.getWorkoutsViewTitle());
        signOut();
        wait.until(ExpectedConditions.visibilityOf(signInView.emailAddress));
    }



    @After
    public void  tearDown(){

        driver.quit();
        //service1.stop();
    }
}
