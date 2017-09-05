package views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BodyWeightView {
    public AppiumDriver driver;
    WebDriverWait wait;
    SignInView signInView;
    String var;
    double calorie;

    public BodyWeightView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

        wait = new WebDriverWait(driver, 100);

        this.driver=driver;
        signInView=new SignInView(driver);



    }


    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[2]")
    public WebElement trackingTab;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[1]")
    public WebElement workoutsTab;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[3]")
    public WebElement settingsTab;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    public WebElement bodyWeight;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement page;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")
    public WebElement drill52;


    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")
    public WebElement cricIt;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
    public WebElement workoutsViewTitle;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]")
    public WebElement weightAlertWindow;

    @FindBy(name = "OK")
    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")
    public WebElement weightAlertOKButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]")
    public WebElement downTabbar;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    public WebElement routineButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    public WebElement selectUiPicker;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIASwitch[i]")
    public WebElement tableCell;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")
    public WebElement backButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]")
    public WebElement nextButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement videoButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement previewButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement beginWorkout;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[6]")
    public WebElement buttonEnd;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement textRoutine;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")
    public WebElement textExerciseRemain;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[3]")
    public WebElement textTime;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]")
    public WebElement textElapsed;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[5]")
    public WebElement textElapsedTime;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]")
    public WebElement imageGif;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]")
    public WebElement sideGif;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[6]")
    public WebElement textComeNext;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[7]")
    public WebElement nextRoutineName;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")

    public WebElement buttonInfo;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement buttonMusic;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    public WebElement buttonSound;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")
    public WebElement buttonCamera;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")
    public WebElement buttonPause;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[7]")
    public WebElement buttonCross;
    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]")
    public WebElement buttonCross1;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement textSummary;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")
    public WebElement textSummaryRoutine;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[5]")
    public WebElement textTotalTime;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[9]")
    public WebElement textCalorie;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")
    public WebElement listProfile;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]")
    public WebElement pageProfile;


    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]")
    public WebElement editsaveButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]")
    public WebElement imageAddButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]")
    public WebElement galleryButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    public WebElement momentButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]")
    public WebElement selectPhoto;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")
    public WebElement doneButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement checkMale;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement checkFMale;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[3]")
    public WebElement dob;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[2]")
    public WebElement dobPicker;


    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]")
    public WebElement wgtPicker;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[5]")
    public WebElement weight;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[6]")
    public WebElement labelText;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")
    public WebElement labelPicker;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement bodyWeightViewTitleText;




    String routines [] = {" ","Jumping jacks","Wall press","Bridges","Modified plank", "Lateral hops","Crab","Squats","Crunches","Jumping jacks", "Modified shoulder taps", "Parachuter",
            "Lateral hops","Wall press","Bridges","Crunches","Jumping jacks","Crab","Squats","Parachuter","Lateral hops","Modified shoulder taps","Crunches","Jumping jacks","Wall press","Bridges","Parachuter","Lateral hops","Modified plank"};


    //tab bar click
    public void Workout()
    {
        wait.until(ExpectedConditions.visibilityOf(downTabbar));
        if(downTabbar.isDisplayed())
        {
            trackingTab.click();
            workoutsTab.click();
            settingsTab.click();
            workoutsTab.click();
        }

        wait.until(ExpectedConditions.visibilityOf(workoutsViewTitle));
        assertTrue(workoutsViewTitle.isDisplayed());
    }

    //list check in workout page
    public void checkWorkout()
    {
        Workout();

        assertTrue(bodyWeight.isDisplayed());
        assertTrue(drill52.isDisplayed());
        assertTrue(cricIt.isDisplayed());

    }

    //tap on workout
    public void tapWorkout()
    {
        tapBodyWeight();
        tapDrill52();
        tapCricIt();
    }


    public void tapBodyWeight()
    {
        workoutsTab.click();
        bodyWeight.click();
        page.getText();
        assertEquals(page.getText(),"BODY WEIGHT");
    }

    public void tapDrill52()
    {
        workoutsTab.click();
        drill52.click();
        page.getText();
        assertEquals(page.getText(),"DRILL 52");

    }

    public void tapCricIt()
    {
        workoutsTab.click();
        cricIt.click();
        page.getText();
        assertEquals(page.getText(),"CIRC-IT");

    }


    //Routine select and enter a workout page
    public void selectRoutine()
    {
        wait.until(ExpectedConditions.visibilityOf(workoutsTab));
        workoutsTab.click();
        tapBodyWeight();
        wait.until(ExpectedConditions.visibilityOf(routineButton));
        routineButton.click();
        selectUiPicker.click();
        wait.until(ExpectedConditions.visibilityOf(workoutsViewTitle));
        assertEquals(workoutsViewTitle.getText(),"BEGINNER PREVIEW");

    }

    //Go to workout preview ,check-uncheck , go ro preview ,than video
    public void fullRoutine()
    {
        selectRoutine();

        for(int i=10;i<=20;i++)
        {

            //WebElement tablCell= driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[i]/UIASwitch[1]"));

            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).click();
            //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).click();
            String a=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).getAttribute("value");
            String b=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIAStaticText[1]")).getAttribute("value");

        //    assertEquals("1",a);
            assertEquals(routines[i],b);
          //  driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIAStaticText[1]")).click();
          //  wait.until(ExpectedConditions.visibilityOf(videoButton));
          //  videoButton.click();
          //  wait.until(ExpectedConditions.visibilityOf(videoButton));
          //  wait.until(ExpectedConditions.visibilityOf(previewButton));
          //  previewButton.click();
          //  wait.until(ExpectedConditions.visibilityOf(nextButton));
          //  nextButton.click();
          //  wait.until(ExpectedConditions.visibilityOf(backButton));
          //  backButton.click();
            Dimension size = driver.manage().window().getSize();
            int startX = size.width /2;
            int startY = size.height/2;
            int endY = size.height/3;
            //int startY = (int) (size.height * 0.80);
          //  int endY = (int) (size.height * 0.40);
            if(i==10)
            {
                driver.swipe(startX, startY, startX, endY,800);

               wait.withTimeout(10, TimeUnit.SECONDS);
            }

            if(i==19)
            {
                driver.swipe(startX, startY, startX, endY,800);

                wait.withTimeout(30, TimeUnit.SECONDS);
            }


        }
    }

    //when workout starts
    public void previewRoutine()
    {

        fullRoutine();
        beginWorkout.click();
        wait.until(ExpectedConditions.visibilityOf(buttonEnd));
        assertEquals(buttonEnd.getText(),"END");
        assertTrue(textRoutine.isDisplayed());
        assertTrue(textExerciseRemain.isDisplayed());
        assertTrue(textTime.isDisplayed());
        assertTrue(textElapsed.isDisplayed());
        assertTrue(textElapsedTime.isDisplayed());
        assertTrue(imageGif.isDisplayed());
        assertTrue(sideGif.isDisplayed());

        assertTrue(textComeNext.isDisplayed());
        assertTrue(nextRoutineName.isDisplayed());

        buttonInfo.click();
        buttonCross.click();
        driver.rotate(ScreenOrientation.LANDSCAPE);
        buttonMusic.click();
        wait.until(ExpectedConditions.visibilityOf(buttonCross1));
        buttonCross1.click();
        buttonSound.click();
        wait.until(ExpectedConditions.visibilityOf(buttonCross1));
        buttonCross1.click();
        wait.until(ExpectedConditions.visibilityOf(buttonPause));
        buttonPause.click();
        wait.until(ExpectedConditions.visibilityOf(buttonCross));
        buttonCross.click();

        wait.until(ExpectedConditions.visibilityOf(buttonEnd));
        buttonEnd.click();
        wait.until(ExpectedConditions.visibilityOf(textSummary));
        assertEquals(textSummary.getText(),"WORKOUT SUMMARY");
    }


    //workout summary details check and calorie check
    public void workoutSummary()
    {

        previewRoutine();
        String elapsedTime=textTotalTime.getText();
        String elapsedTimeDouble= elapsedTime.replace(':','.');
        Double elapsedTimeValue=Double.valueOf(elapsedTimeDouble);
        String calorieVal = textCalorie.getText();
        String calorieConvert = calorieVal.replace("Cal","");
        Double calorieDouble = Double.valueOf(calorieConvert);

            calorie=Math.round((.0175*5*339*elapsedTimeValue)/2);

        assertTrue((calorieDouble-calorie)<=2);


    }

    public void editProfile()
    {
        wait.until(ExpectedConditions.visibilityOf(settingsTab));
        settingsTab.click();
        listProfile.click();
        wait.until(ExpectedConditions.visibilityOf(editsaveButton));
        assertTrue(editsaveButton.isDisplayed());
        editsaveButton.click();
        imageAddButton.click();
      //  assertTrue(signIn.alert.isDisplayed());
        galleryButton.click();
        wait.until(ExpectedConditions.visibilityOf(momentButton));
        momentButton.click();
        selectPhoto.click();
        wait.until(ExpectedConditions.visibilityOf(editsaveButton));
        checkMale.click();
        checkFMale.click();
        checkMale.click();
        dob.click();
        wait.until(ExpectedConditions.visibilityOf(dobPicker));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[2]/UIAPickerWheel[1]")).sendKeys("September");
        videoButton.click();
        weight.click();
        wait.until(ExpectedConditions.visibilityOf(wgtPicker));

        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")).sendKeys("131");
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[2]/UIAPickerWheel[1]")).sendKeys("September");

        videoButton.click();
        labelText.click();
        wait.until(ExpectedConditions.visibilityOf(labelPicker));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")).sendKeys("Advanced");
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")).sendKeys("Beginner");
        videoButton.click();
        editsaveButton.click();
        wait.until(ExpectedConditions.visibilityOf(doneButton));
        doneButton.click();
        assertTrue(listProfile.isDisplayed());

    }

    public String getWorkoutsViewTitle(){
        return workoutsViewTitle.getText();
    }

    public String getBodyWeightViewTitleText(){
        return bodyWeightViewTitleText.getText();
    }


}
