package tests;


import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.AppInitializer;

import views.*;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TabBarTest {

    AppiumDriver driver;
    TabBarView tabBarView;
    WorkoutsView workoutsView;

    SettingsView settingsView;
    TrackingView trackingView;
    WebDriverWait wait;

    @Before
    public void setup() throws MalformedURLException {
        AppInitializer appInitializer=new AppInitializer();
        this.driver=appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 60);

        tabBarView=new TabBarView(driver);

        settingsView=new SettingsView(driver);
        trackingView = new TrackingView(driver);
        workoutsView =new WorkoutsView(driver);


    }


    //TC/Tab Bar/001 :: Verify that taping on Workout tab will display the Workout view
    @Test
    public void WorkoutTabTest() {

        //Sign in
        //signInView.signInEmailAndPassword("nadimsaker+7@gmail.com","Pa123456");

        // Naviagte to Workout tab
        tabBarView.navigateToWorkoutsTab();

        //Verify Workout tile text
        Assert.assertEquals("No Workout View","WORKOUTS",workoutsView.getWorkoutsViewTitle());

        //Sign out
        tabBarView.navigateToSettingsTab();
        settingsView.signOut();
    }

    //TC/Tab Bar/002 :: Verify that taping on Tracking tab will display the Tracking view
    @Test
    public void TrackingTabTest() {




        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[2]")).click();
        // Naviagte to trcking tab
        tabBarView.navigateToTrackingTab();

        //Verify Workout tile text
        //Assert.assertEquals("No tracking View","TRACKING",trackingView.getTrackingViewTitleText());

        // Sign out
        //tabBarView.navigateToSettingsTab();
        //settingsView.signOut();
    }





//    TC/Tab Bar/003	Verify that taping on Setting tab will display Settings view
@Test
    public void SettingsTabTest() {

        //Sign in
        //signInView.signInEmailAndPassword("nadimsaker+7@gmail.com","Pa123456");
        //wait.until(ExpectedConditions.visibilityOf(workoutsView.workoutsViewTitle));

        // Naviagte to trcking tab
        tabBarView.navigateToSettingsTab();

        //Verify Workout tile text
        Assert.assertEquals("No settings View","SETTINGS",trackingView.getTrackingViewTitleText());

        // Sign out
        settingsView.signOut();
    }

//    @After
//    public void tearDown(){
//        driver.quit();
//    }
}
