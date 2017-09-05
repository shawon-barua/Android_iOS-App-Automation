
package views;

        import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.pagefactory.AppiumFieldDecorator;
        import io.appium.java_client.pagefactory.iOSFindBy;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Dimension;
        import org.openqa.selenium.ScreenOrientation;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.interactions.internal.TouchAction;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertTrue;

public class WorkoutHistoryView {
    public AppiumDriver driver;
    WebDriverWait wait;
    SignInView signIn;

    String var;


    public WorkoutHistoryView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        this.driver=driver;
        signIn=new SignInView(driver);
        wait = new WebDriverWait(driver, 140);


    }



    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")
    public WebElement totalTime;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]")
    public WebElement heartRate;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[6]")
    public WebElement calorie;


    @iOSFindBy(xpath = " //UIAApplication[1]/UIAWindow[1]/UIAStaticText[10]")
    public WebElement workoutCompleted;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[2]")
    public WebElement trackingTab;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[1]")
    public WebElement workoutsTab;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[3]")
    public WebElement settingsTab;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
    public WebElement workoutsViewTitle;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]")
    public WebElement downTabbar;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement drill52TitleText;



    //tab bar click
    public void Workout()
    {
        wait.until(ExpectedConditions.visibilityOf(downTabbar));
        if(downTabbar.isDisplayed())
        {
            trackingTab.click();
            workoutsTab.click();
            settingsTab.click();

        }

        wait.until(ExpectedConditions.visibilityOf(workoutsViewTitle));
        assertTrue(workoutsViewTitle.isDisplayed());
    }


    //workout history details check
    public void workoutHistory()
    {
        wait.until(ExpectedConditions.visibilityOf(trackingTab));
        trackingTab.click();

        driver.tap(1,201,252,5);
        String elapsedTime=totalTime.getText();
        assertEquals("02:48",elapsedTime);
        String hearRate=heartRate.getText();
        assertEquals("---",hearRate);
        String calories=calorie.getText();
        assertEquals("4 cal",calories);
        String completed=workoutCompleted.getText();
        assertEquals("0",completed);


    }





    public String getWorkoutsViewTitle(){
        return workoutsViewTitle.getText();
    }

    public String getDrill52TitleText(){
        return drill52TitleText.getText();
    }

}
