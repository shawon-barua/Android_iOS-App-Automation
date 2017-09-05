package views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.junit.Assert;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class SignUpView {

    public AppiumDriver driver;
    WebDriverWait wait;
    SignInView signInView;
    WorkoutsView workoutsView;
    MyProfileView myProfileView;
    SettingsView settingsView;

    public SignUpView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait = new WebDriverWait(driver, 50);
        signInView=new SignInView(driver);
        workoutsView = new WorkoutsView(driver);
        myProfileView=new MyProfileView(driver);
        settingsView =new SettingsView(driver);
    }

    //all
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]")
    public WebElement workOut;

    //FB user
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    public WebElement signUpWithFacebookButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")
    public WebElement fbEmailAddress;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIASecureTextField[1]")
    public WebElement fbPassword;

    @FindBy(name = "Log In")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]")
    public WebElement fbLoginButton;

    @FindBy(name = "OK")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[2]")
    public WebElement fbOKButton;


    //twitter user
    //UIAApplication[1]/UIAWindow[1]/UIAButton[4]
    //UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[4]
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")
    public WebElement signUpWithTwitterButton;

    @FindBy(name = "Username or email")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")
    public WebElement twEmailAddress;

    @FindBy(name = "Password")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIASecureTextField[1]")
    public WebElement twPassword;

    @FindBy(name = "Sign In")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]")
    public WebElement twLoginButton;


    //Custom User
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[5]")
    public WebElement cButton;
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")
    public WebElement firstName;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[2]")
    public WebElement lastName;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[3]")
    public WebElement email;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")
    public WebElement password;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[2]")
    public WebElement confirmPassword;

    @FindBy(name = "signup")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")
    public WebElement signupButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public  WebElement maleText;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public  WebElement male;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    public  WebElement female;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[4]")
    public WebElement birthDate;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[2]/UIAPickerWheel[1]")
    public WebElement birthDateMonth;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[2]/UIAPickerWheel[2]")
    public WebElement birthDateDay;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[2]/UIAPickerWheel[3]")
    public WebElement birthDateYear;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[5]")
    public WebElement height;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")
    public WebElement heightFeet;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[2]")
    public WebElement heightInch;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[6]")
    public WebElement weight;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")
    public WebElement weightValue;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[2]")
    public WebElement weightUnit;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[7]")
    public WebElement fitness;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")
    public WebElement fitnessLevel;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]")
    public WebElement messageAlert;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]")
    public WebElement messageAlertText;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")
    public WebElement messageAlertOKButton;

    @FindBy(name = "TERMS OF USE")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")
    public WebElement termsOfUse;

    @FindBy(name = "TERMS OF SERVICE AGREEMENT")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[4]")
    public WebElement termsOfUsePageText;

    @FindBy(name = "Back")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")
    public WebElement signUpPageBackButton;


    //Common
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement selectButton;



    public String signUpCustomUser(String fName, String lName, String userEmail, String passWord, String gender,String dateOfBirth, String customHeight, String customWeight, String customFitnessLevel) {

        firstName.clear();
        firstName.sendKeys(fName);

        lastName.clear();
        lastName.sendKeys(lName);

        email.clear();
        email.sendKeys(userEmail);

        password.clear();
        password.sendKeys(passWord);

        confirmPassword.clear();
        confirmPassword.sendKeys(passWord);

        //To disappear the keyboard
        maleText.click();

        if (gender!=""){
            if(gender.toLowerCase()=="male"){
                male.clear();
                male.click();
            }
            else {
                female.clear();
                female.click();
            }
        }


        if(dateOfBirth!=""){
            //Date of Birth
            birthDate.click();
            birthDateYear.sendKeys("1977");
            selectButton.click();

            birthDate.click();
            birthDateDay.sendKeys("8");
            selectButton.click();

            birthDate.click();
            birthDateMonth.sendKeys("December");
            selectButton.click();

        }

        if(customHeight!=""){
            //Height
            height.click();
            heightFeet.sendKeys("6'");
            selectButton.click();

            height.click();
            heightInch.sendKeys("0"+'"');
            selectButton.click();

        }

        if(customWeight!=""){
            //Weight
            weight.click();
            weightValue.sendKeys("50");
            selectButton.click();

            weight.click();
            weightUnit.sendKeys("lbs");
            selectButton.click();
        }

        if(customFitnessLevel!=""){
            //Fitness
            fitness.click();
            fitnessLevel.sendKeys("Intermediate");
            selectButton.click();
        }

        signupButton.click();

        wait.until(ExpectedConditions.visibilityOf(messageAlert));

        String alertMeassge  =  getAlertMessageText();
        messageAlertOKButton.click();
        return alertMeassge;
    }

    public String getAlertMessageText(){
        return messageAlertText.getText();
    }

    public int getFirstNameLength(String name){
        firstName.clear();
        firstName.sendKeys(name);
        lastName.click();
        return firstName.getText().length();
    }


    public int getLastNameLength(String name){
        lastName.clear();
        lastName.sendKeys(name);
        firstName.click();
        return lastName.getText().length();
    }


    public String errorMessageForPasswordMismatch(String fName, String lName, String userEmail, String passWord, String gender,String dateOfBirth, String customHeight, String customWeight, String customFitnessLevel) {

        firstName.clear();
        firstName.sendKeys(fName);

        lastName.clear();
        lastName.sendKeys(lName);

        email.clear();
        email.sendKeys(userEmail);

        password.clear();
        password.sendKeys(passWord);

        confirmPassword.clear();
        confirmPassword.sendKeys(passWord+"XXX");

        //To disappear the keyboard
        maleText.click();

        signupButton.click();

        wait.until(ExpectedConditions.visibilityOf(messageAlert));

        String alertMeassge  =  getAlertMessageText();
        messageAlertOKButton.click();
        return alertMeassge;
    }

    public String getTermsOfUsePageText(){
        termsOfUse.click();
        return termsOfUsePageText.getText();
    }



    public String signUpFacebookUser(String email,String password) {

        //Back to Sign in page.
        signUpPageBackButton.click();
        wait.until(ExpectedConditions.visibilityOf(signUpWithFacebookButton));

        signUpWithFacebookButton.click();
        wait.until(ExpectedConditions.visibilityOf(fbEmailAddress));

        fbEmailAddress.click();
        fbEmailAddress.clear();
        fbEmailAddress.sendKeys(email);

        fbPassword.click();
        fbPassword.clear();
        fbPassword.sendKeys(password);

        fbLoginButton.click();

        wait.until(ExpectedConditions.visibilityOf(fbOKButton));
        fbOKButton.click();

        WorkoutsView workoutsView = new WorkoutsView(driver);
        return workoutsView.getWorkoutsViewTitle();
    }


    public String signUpTwitterUser(String email,String password)
    {
        //Back to Sign in page.
        signUpPageBackButton.click();
        wait.until(ExpectedConditions.visibilityOf(signUpWithTwitterButton));

        signUpWithTwitterButton.click();
        wait.until(ExpectedConditions.visibilityOf(twEmailAddress));

        twEmailAddress.clear();
        twEmailAddress.sendKeys(email);

        twPassword.clear();
        twPassword.sendKeys(password);

        twLoginButton.click();

        wait.until(ExpectedConditions.visibilityOf(workoutsView.weightAlertOKButton));
        String msg = workoutsView.getWeightAlertMessage();
        workoutsView.weightAlertOKButton.click();
        return msg;
    }

}
