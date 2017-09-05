package tests;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import utilities.AppInitializer;

public class TestCalc_MobileEmulator {

    WebDriver driver;
    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;

    @Before
    public void setUp() throws MalformedURLException {

        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        appiumServiceUrl = appiumService.getUrl().toString();
        System.out.println("Appium Service Address : - "+ appiumServiceUrl);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver(new URL(appiumServiceUrl), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void Sum() {
        System.out.println("Calculate sum of two numbers");
        // Locate elements to enter data and click +/= buttons
        driver.findElement(By.xpath("//*[@text='1']")).click();
        driver.findElement(By.xpath("//*[@text='+']")).click();
        driver.findElement(By.xpath("//*[@text='2']")).click();
        driver.findElement(By.xpath("//*[@content-desc='equals']")).click();

        // Get the result text
        // sumOfNumbersEle = driver.findElement(By.className("android.widget.EditText"));
       // String sumOfNumbers = sumOfNumbersEle.getText();


    }

    @After
    public void End() {
        System.out.println("Stop driver");
        driver.quit();
        System.out.println("Stop appium service");
        appiumService.stop();
    }

}
