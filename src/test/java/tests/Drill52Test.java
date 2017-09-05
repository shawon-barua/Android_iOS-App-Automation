package tests;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import utilities.AppInitializer;
import views.Drill52View;
import views.SignInView;
import views.WorkoutsView;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class Drill52Test {

    static AppiumDriver driver;
    static Drill52View Drill52;


    @BeforeClass
    public static void setup() throws MalformedURLException {

        AppInitializer appInitializer = new AppInitializer();
        driver = appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        Drill52 = new Drill52View(driver);

        SignInView signInView = new SignInView(driver);
    }

    @Test
    public void test1Workout()
    {
        Drill52.achievement();
    }

    @Test
    public void test2CheckWorkout()
    {
        Drill52.checkWorkout();
    }

    @Test
    public void test3TapWorkout()
    {
        Drill52.tapWorkout();
    }

    @Test
    public void test4SelectRoutine()
    {
        Drill52.selectRoutine();
    }

    @Test
    public void test5fullRoutine()
    {
        Drill52.fullRoutine();
    }

    @Test
    public void test6PreviewRoutine()
    {

        Drill52.previewRoutine();
    }

    @Test
    public void test7workoutSummary()
    {
        Drill52.workoutSummary();
    }


  //  @After
   // public void tearDown(){
   //     driver.quit();
   // }

}

