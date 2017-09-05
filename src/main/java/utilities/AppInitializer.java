package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.ServerArgument;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.SystemUtils;

public class AppInitializer {

        PropertyHandler propertyHandler;
    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;
    private static String emulatorPath = "C:/Users/shawo/AppData/Local/Android/sdk/emulator/";

        public AppInitializer(){
            propertyHandler=new PropertyHandler();
        }


        private DesiredCapabilities getCapability(){

            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (SystemUtils.IS_OS_WINDOWS) {


                File app=initializeAPKFile();
                capabilities.setCapability(CapabilityType.BROWSER_NAME, propertyHandler.getPropertyValue("BROWSER_NAME"));
                capabilities.setCapability("deviceName", propertyHandler.getPropertyValue("deviceName"));
                capabilities.setCapability("platformName", propertyHandler.getPropertyValue("platformName"));
                capabilities.setCapability("platformVersion", propertyHandler.getPropertyValue("platformVersion"));
                capabilities.setCapability("app",app);
                //File appDir = new File("/Users/shawo/Downloads/");
                //File app = new File(appDir, "1.apk");
                capabilities.setCapability("app", app.getAbsolutePath());
               // capabilities.setCapability("appPackage", propertyHandler.getPropertyValue("appPackage"));
                capabilities.setCapability("appActivity", propertyHandler.getPropertyValue("appActivity"));

            }
            else
            {
                //File app=InitializeIPAFile();
                capabilities.setCapability(CapabilityType.BROWSER_NAME,  propertyHandler.getPropertyValue("BROWSER_NAME"));
                capabilities.setCapability("deviceName", propertyHandler.getPropertyValue("deviceName"));
                capabilities.setCapability("platformName", propertyHandler.getPropertyValue("platformName"));
                capabilities.setCapability("platformVersion", propertyHandler.getPropertyValue("platformVersion"));
               // capabilities.setCapability("app",app);
                capabilities.setCapability("appPackage",propertyHandler.getPropertyValue("appPackage"));
            }
            return capabilities;
        }

        public AppiumDriver getDriver(){
            AppiumDriver driver=null;
            if (SystemUtils.IS_OS_WINDOWS) {
                try {
                    appiumServiceUrl = appiumService.getUrl().toString();
                    driver = new AndroidDriver(new URL(appiumServiceUrl), getCapability());
                    //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getCapability());
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                try {
                    driver =  new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), getCapability());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            return driver;
        }

        public AppiumDriverLocalService service1 ()
        {
           // appiumService = AppiumDriverLocalService.buildDefaultService();
            appiumService= AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withArgument(new ServerArgument(){
                                public String getArgument() {
                                    return "--avd";
                                }
                            }, "Nexus_5_API_23"));
            appiumService.start();
            appiumServiceUrl = appiumService.getUrl().toString();
            return appiumService;
        }




        private File initializeAPKFile(){
            //File classpathRoot = new File(System.getProperty("user.dir"));
            //File appDir = new File(classpathRoot, new PropertyHandler().getPropertyValue("apkfilepath"));
            File appDir = new File(new PropertyHandler().getPropertyValue("apkfilepath"));
            File app = new File(appDir, new PropertyHandler().getPropertyValue("apkfilename"));
            return app;
        }



    private File InitializeIPAFile(){
        //File classpathRoot = new File(System.getProperty("user.dir"));
        //File appDir = new File(classpathRoot, propertyHandler.getPropertyValue("appfilepath"));
        File appDir = new File(propertyHandler.getPropertyValue("appfilepath"));
        File app = new File(appDir, propertyHandler.getPropertyValue("appfilename"));
        return app;
    }

    public static void launchEmulator( ) {
        System.out.println("Starting emulator for '" + "Nexus_5_API_23" + "' ...");
        String[] aCommand = new String[] { emulatorPath, "-avd", "Nexus_5_API_23"};
        try {
            Process process = new ProcessBuilder(aCommand).start();
           process.waitFor();
            System.out.println("Emulator launched successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
