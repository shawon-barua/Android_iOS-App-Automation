
/**
 * Created by infolytxmacmini01 on 6/28/16.
 */

package views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
//import org.apache.tools.ant.util.StringTokenizer;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WorkoutSummaryView {
    public AppiumDriver driver;
    WebDriverWait wait;
    String var;
    double calorie;
    WorkoutsView workoutView;

    public WorkoutSummaryView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        this.driver=driver;
        workoutView=new WorkoutsView(driver);
        wait = new WebDriverWait(driver, 50);
    }



    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
    public WebElement workoutsViewTitle;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[5]")
    public WebElement textTotalTime;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[9]")
    public WebElement textCalorie;



    public void workoutSummary()
    {

        workoutView.previewRoutine();
        String elapsedTime=textTotalTime.getText();
        String elapsedTimeDouble= elapsedTime.replace(':','.');
        Double elapsedTimeValue=Double.valueOf(elapsedTimeDouble);
        String calorieVal = textCalorie.getText();
        String calorieConvert = calorieVal.replace("Cal","");
        Double calorieDouble = Double.valueOf(calorieConvert);


        calorie=Math.round((.0175*5*339*elapsedTimeValue)/2);



        assertTrue((calorieDouble-calorie)<=2);


    }

    public String getWorkoutsViewTitle(){
        return workoutsViewTitle.getText();
    }


}
