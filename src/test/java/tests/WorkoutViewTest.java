package tests;

import io.appium.java_client.AppiumDriver;
import org.junit.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.AppInitializer;
import views.*;
import org.junit.Before;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class WorkoutViewTest {

    AppiumDriver driver;
    WorkoutsView workoutsView ;
    BodyWeightView bodyWeightView;
    Drill52View drill52View;
    CircItView circItView;

    WebDriverWait wait;

    @Before
    public void setup() throws MalformedURLException {

        AppInitializer appInitializer = new AppInitializer();
        this.driver = appInitializer.getDriver();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 60);

        workoutsView = new WorkoutsView(driver);
        bodyWeightView= new BodyWeightView(driver);
        drill52View=new Drill52View(driver);

    }

    @Test
    public void test1Workout()
    {
        workoutsView.Workout();
    }

    @Test
    public void test2CheckWorkout()
    {
        workoutsView.checkWorkout();
    }

    @Test
    public void test3TapWorkout()
    {
        workoutsView.tapWorkout();
    }

    @Test
    public void test4SelectRoutine()
    {
        workoutsView.selectRoutine();
    }

    @Test
    public void test5fullRoutine()
    {
        workoutsView.fullRoutine();
    }

    @Test
    public void test6PreviewRoutine()
    {
        bodyWeightView.workoutSummary();
        workoutsView.workoutSummary();
        drill52View.workoutSummary();
    }

    @Test
    public void test7workoutSummary()
    {

        workoutsView.workoutSummary();
    }


//    TC/Dashboard/001	Verify that tapping on Workouts tab will go to Dashboard page
//    TC/Dashboard/002	Verify that workout list are displayed at Dashboard page
//    TC/Dashboard/003	Verify that tapping on a workout name will go to specific workout page
    @Test
    public void verifyWorkoutList(){
        Assert.assertTrue(workoutsView.bodyWeight.isDisplayed());
        Assert.assertTrue(workoutsView.drill52.isDisplayed());
        Assert.assertTrue(workoutsView.circIt.isDisplayed());
    }

    @Test
    public void verifyBodyWeightView() {
        SignInView signInView =new SignInView(driver);
        signInView.signInEmailAndPassword("nadimsaker+7@gmail.com","Pa123456");
        wait.until(ExpectedConditions.visibilityOf(workoutsView.workoutsViewTitle));

        workoutsView.bodyWeight.click();
        bodyWeightView =new BodyWeightView(driver);
        wait.until(ExpectedConditions.visibilityOf(bodyWeightView.bodyWeightViewTitleText));

        Assert.assertEquals("Body weight view is not showing",bodyWeightView.getBodyWeightViewTitleText(),"BODY WEIGHT");
    }


    @Test
    public void verifyDrill52View() {
        SignInView signInView =new SignInView(driver);
        signInView.signInEmailAndPassword("nadimsaker+7@gmail.com","Pa123456");
        wait.until(ExpectedConditions.visibilityOf(workoutsView.workoutsViewTitle));

        workoutsView.drill52.click();
        drill52View =new Drill52View(driver);
        wait.until(ExpectedConditions.visibilityOf(drill52View.drill52));

        Assert.assertEquals("Drill 52 view is not showing",drill52View.getDrill52TitleText(),"DRILL 52");
    }

    @Test
    public void verifyCircITView() {
        SignInView signInView =new SignInView(driver);
        signInView.signInEmailAndPassword("nadimsaker+7@gmail.com","Pa123456");
        wait.until(ExpectedConditions.visibilityOf(workoutsView.workoutsViewTitle));

        workoutsView.circIt.click();
        circItView = new CircItView(driver);

        wait.until(ExpectedConditions.visibilityOf(circItView.circItTitleText));
        Assert.assertEquals("Circ it view is not showing",circItView.getCircItTileText());
    }

  //  @After
  //  public void tearDown(){
  //      driver.quit();
  //  }

}

