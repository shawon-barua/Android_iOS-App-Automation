package tests;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import utilities.AppInitializer;
import views.BodyWeightView;
import views.WorkoutsView;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class BodyWeightViewTest {

    static AppiumDriver driver;
    static BodyWeightView bodyweightWorkout ;

    @BeforeClass
    public static void setup() throws MalformedURLException {

        AppInitializer appInitializer = new AppInitializer();
        driver = appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        bodyweightWorkout = new BodyWeightView(driver);

    }

    @Test
    public void test1Workout()
    {
        bodyweightWorkout.Workout();
    }

    @Test
    public void test2CheckWorkout()
    {
        bodyweightWorkout.checkWorkout();
    }

    @Test
    public void test3TapWorkout()
    {
        bodyweightWorkout.tapWorkout();
    }

    @Test
    public void test4SelectRoutine()
    {
        bodyweightWorkout.selectRoutine();
    }

    @Test
    public void test5fullRoutine()
    {
        bodyweightWorkout.fullRoutine();
    }

    @Test
    public void test6PreviewRoutine()
    {

        bodyweightWorkout.previewRoutine();
    }

    @Test
    public void test7workoutSummary()
    {

        bodyweightWorkout.workoutSummary();
    }


   // @After
   // public void tearDown(){
  //     driver.quit();
  //  }

}

