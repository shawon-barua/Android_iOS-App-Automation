package tests;

import io.appium.java_client.AppiumDriver;
import org.junit.*;
import utilities.AppInitializer;
import views.SettingsView;
import views.SignInView;
import views.WorkoutsView;
import org.junit.Before;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class SettingsTest {

    static AppiumDriver driver;
    static SettingsView setting ;

    @BeforeClass
    public static void setup() throws MalformedURLException {

        AppInitializer appInitializer = new AppInitializer();
        driver = appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        setting = new SettingsView(driver);

    }



    @Test
    public void test1settingsList()
    {

        setting.settingsTab();
    }


    @After
    public void tearDown(){
        driver.quit();
    }

}

