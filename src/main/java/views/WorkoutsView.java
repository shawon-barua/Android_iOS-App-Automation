package views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WorkoutsView {
    public AppiumDriver driver;
    WebDriverWait wait;
    SignInView signInView;
    String var;
    double calorie;

    public WorkoutsView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

        wait = new WebDriverWait(driver, 100);

        this.driver=driver;
        signInView=new SignInView(driver);


    }


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[2]")
    public WebElement trackingTab;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[1]")
    public WebElement workoutsTab;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[3]")
    public WebElement settingsTab;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    public WebElement bodyWeight;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement page;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")
    public WebElement drill52;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")
    public WebElement circIt;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
    @AndroidFindBy(id = "toolbar_title")
    public WebElement workoutsViewTitle;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]")
    public WebElement weightAlertWindow;

    @FindBy(name = "OK")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")
    public WebElement weightAlertOKButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]")
    public WebElement downTabbar;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    public WebElement routineButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    public WebElement selectUiPicker;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIASwitch[i]")
    public WebElement tableCell;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")
    public WebElement backButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]")
    public WebElement nextButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement videoButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement previewButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement beginWorkout;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[6]")
    public WebElement buttonEnd;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement textRoutine;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")
    public WebElement textExerciseRemain;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[3]")
    public WebElement textTime;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]")
    public WebElement textElapsed;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[5]")
    public WebElement textElapsedTime;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]")
    public WebElement imageGif;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]")
    public WebElement sideGif;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[6]")
    public WebElement textComeNext;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[7]")
    public WebElement nextRoutineName;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")

    public WebElement buttonInfo;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement buttonMusic;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    public WebElement buttonSound;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")
    public WebElement buttonCamera;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")
    public WebElement buttonPause;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[7]")
    public WebElement buttonCross;
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]")
    public WebElement buttonCross1;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement textSummary;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")
    public WebElement textSummaryRoutine;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[5]")
    public WebElement textTotalTime;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[9]")
    public WebElement textCalorie;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")
    public WebElement listProfile;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]")
    public WebElement pageProfile;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]")
    public WebElement editsaveButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]")
    public WebElement imageAddButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]")
    public WebElement galleryButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    public WebElement momentButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]")
    public WebElement selectPhoto;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")
    public WebElement doneButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement checkMale;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement checkFMale;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[3]")
    public WebElement dob;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[2]")
    public WebElement dobPicker;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]")
    public WebElement wgtPicker;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[5]")
    public WebElement weight;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[6]")
    public WebElement labelText;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")
    public WebElement labelPicker;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]")
    public WebElement weightAlertMessage;



    String routines [] = {" ","Jumping jacks","Band X","Bridges","Modified prone plank", "Jump rope","Seated rows","Resisted leg raise","Modified plank slider circles","Jumping jacks", "Standing punches", "Resisted side leg raise",
            "Wheel oscillations","Jump rope","Seated rows","Resisted hip ext","Modified plank slider circles","Jumping jacks","Standing punches","Squats","Band X"};


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
        assertTrue(circIt.isDisplayed());

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
        circIt.click();
        page.getText();
        assertEquals(page.getText(),"CIRC-IT");

    }


    //Routine select and enter a workout page
    public void selectRoutine()
    {
        Workout();
        circIt.click();
        wait.until(ExpectedConditions.visibilityOf(routineButton));
        routineButton.click();
        selectUiPicker.click();
        wait.until(ExpectedConditions.visibilityOf(workoutsViewTitle));
        assertEquals(workoutsViewTitle.getText(),"BEGINNER 1 PREVIEW");

    }

    //Go to workout preview ,check-uncheck , go ro preview ,than video
    public void fullRoutine()
    {
        selectRoutine();
        wait.until(ExpectedConditions.visibilityOf(workoutsViewTitle));
        for(int i=1;i<=10;i++)
        {

            //WebElement tablCell= driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[i]/UIASwitch[1]"));

            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).click();
            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).click();
            String a=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).getAttribute("value");

            String b=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIAStaticText[1]")).getAttribute("value");
            //assertEquals("1",a);
            assertEquals(routines[i],b);
            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIAStaticText[1]")).click();
            wait.until(ExpectedConditions.visibilityOf(videoButton));
            videoButton.click();

            wait.until(ExpectedConditions.visibilityOf(previewButton));
            previewButton.click();
            nextButton.click();
            backButton.click();
            Dimension size = driver.manage().window().getSize();
            int startX = size.width / 2;
            int startY = (int) (size.height * 0.80);
            int endY = (int) (size.height * 0.40);
            if(i==10)
            {
                driver.swipe(startX, startY, startX, endY,1000);
            }


        }
    }

    //when workout starts
    public void previewRoutine()
    {

        fullRoutine();
        wait.until(ExpectedConditions.visibilityOf(beginWorkout));
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

    public void navigateToBodyWeight(){
        bodyWeight.click();
    }

    public void navigateToDrill52(){
        drill52.click();
    }

    public void navigateToCircIt(){
        circIt.click();
    }


    public String getWeightAlertMessage(){
        return weightAlertMessage.getText();

    }
}
