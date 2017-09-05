package views;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordView {

    public AppiumDriver driver;
    WebDriverWait wait;

    public ForgotPasswordView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait = new WebDriverWait(driver, 60);
    }

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")
    public WebElement emailAddress;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement sendResetEmailButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]")
    public WebElement errorMessageAlertWindow;

    @iOSFindBy(xpath = " //UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")
    public WebElement errorMessageAlertOKButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]")
    public WebElement errorMessageAlertText;


    public String forgotPassword(String email){
        emailAddress.clear();
        emailAddress.sendKeys(email);

        sendResetEmailButton.click();
        wait.until(ExpectedConditions.visibilityOf(errorMessageAlertWindow));

        String message = errorMessageAlertText.getText();
        errorMessageAlertOKButton.click();
        return message;
    }



}
