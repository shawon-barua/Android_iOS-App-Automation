
package tests;

        import io.appium.java_client.AppiumDriver;
        import org.junit.*;
        import utilities.AppInitializer;
        import views.SignInView;
        import views.WorkoutsView;
        import org.junit.Before;

        import java.net.MalformedURLException;
        import java.util.concurrent.TimeUnit;


public class MyProfileTest {

    static AppiumDriver driver;
    static WorkoutsView workOut ;

    @BeforeClass
    public static void setup() throws MalformedURLException {

        AppInitializer appInitializer = new AppInitializer();
        driver = appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        workOut = new WorkoutsView(driver);

    }


    @Test
    public void test1profileTest()
    {

        workOut.editProfile();
    }


    @After
    public void tearDown(){
        driver.quit();
    }

}

