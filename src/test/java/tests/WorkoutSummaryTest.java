package tests;

import io.appium.java_client.AppiumDriver;
import org.junit.*;
import utilities.AppInitializer;
import views.WorkoutSummaryView;
import views.WorkoutsView;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class WorkoutSummaryTest {

    static AppiumDriver driver;
    static WorkoutSummaryView workoutSummaryView;

    @BeforeClass
    public static void setup() throws MalformedURLException {

        AppInitializer appInitializer = new AppInitializer();
        driver = appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        workoutSummaryView = new WorkoutSummaryView(driver);

    }


    @Test
    public void testworkoutSummary()
    {

        workoutSummaryView.workoutSummary();
    }


    @After
    public void tearDown(){
        driver.quit();
    }

}

