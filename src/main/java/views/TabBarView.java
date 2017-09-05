package views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TabBarView {

    public AppiumDriver driver;
    WebDriverWait wait;

    WorkoutsView workoutsView;
    TrackingView trackingView;
    SignInView signInView;

    public TabBarView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver, 50);

        workoutsView=new WorkoutsView(driver);
        trackingView = new TrackingView(driver);

    }

    //UIAApplication[1]/UIAWindow[1]/UIATabBar[1]
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]")
    public WebElement tabBar;


    @FindBy(name = "WORKOUTS")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[1]")
    public WebElement workOutsTab;

    @FindBy(name = "TRACKING")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[2]")
    public WebElement trackingTab;

    @FindBy(name = "SETTINGS")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[3]")
    public WebElement settingsTab;


    public void navigateToWorkoutsTab(){
        workOutsTab.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")));
    }


    public void navigateToTrackingTab(){
        //Sign in
        signInView=new SignInView(driver);
        signInView.signInEmailAndPassword("nadimsaker+7@gmail.com","Pa123456");
        wait.until(ExpectedConditions.visibilityOf(workoutsView.workoutsViewTitle));
        tabBar.click();
        wait.until(ExpectedConditions.visibilityOf(tabBar));
        trackingTab.click();
        wait.until(ExpectedConditions.visibilityOf(trackingView.trackingTitleText));
    }


    public void navigateToSettingsTab(){
        settingsTab.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")));

    }



}
