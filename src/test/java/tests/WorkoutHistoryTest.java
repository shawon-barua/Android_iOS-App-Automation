
package tests;

        import io.appium.java_client.AppiumDriver;
        import org.junit.After;
        import org.junit.BeforeClass;
        import org.junit.Test;
        import utilities.AppInitializer;
        import views.BodyWeightView;
        import views.WorkoutHistoryView;
        import views.WorkoutsView;

        import java.net.MalformedURLException;
        import java.util.concurrent.TimeUnit;


public class WorkoutHistoryTest {

    static AppiumDriver driver;
    static WorkoutHistoryView history;

    @BeforeClass
    public static void setup() throws MalformedURLException {

        AppInitializer appInitializer = new AppInitializer();
        driver = appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        history = new WorkoutHistoryView(driver);

    }



    @Test
    public void test7workoutSummary()
    {

        history.workoutHistory();
    }


     @After
     public void tearDown(){
         driver.quit();
     }

}

