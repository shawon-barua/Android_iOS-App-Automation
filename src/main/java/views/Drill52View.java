package views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Drill52View {
    public AppiumDriver driver;
    WebDriverWait wait;
    SignInView signIn;

    String var;
    double calorie;

    public Drill52View(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        this.driver=driver;
        signIn=new SignInView(driver);
        wait = new WebDriverWait(driver, 140);


    }


    @FindBy(name = "achievements/shuffler-enable.png")
    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAImage[1]")
    public WebElement shuffler;

    @FindBy(name = "achievements/shuffler-enable.png")
    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAImage[1]")
    public WebElement finisher;

    @FindBy(name = "achievements/sociable-enable.png")
    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[3]/UIAImage[1]")
    public WebElement sociable;

    @FindBy(name = "achievements/sociable-enable")
    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[3]")
    public WebElement sociableAchievement;


    @FindBy(name = "achievements/finisher-enable")
    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[1]")
    public WebElement finisherAchievement;

    @FindBy(name = "achievements/shuffler-enable")
    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[4]")
    public WebElement shufflerAchievement;

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

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement drill52previewButton;

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

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement shuffleDrill52Button;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement previewButton;


    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement dealCard;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")
    public WebElement history;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]")
    public WebElement galleryButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    public WebElement momentButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]")
    public WebElement selectPhoto;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    public WebElement doneButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    public WebElement shareButton;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[1]")
    public WebElement shareFB;

    @AndroidFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]")
    public WebElement postButton;

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
    public WebElement drill52TitleText;



    String routines [] = {" ","Jumping jacks","Band X","Bridges","Modified prone plank", "Jump Rope","Seated rows","Resisted leg raise","Modified plank slider circles","Jumping jacks", "Standing punches", "Resisted side leg raise",
            "Wheel oscillations","Jump Rope","Seated rows","Resisted hip ext","Modified plank slider circles","Jumping jacks","Standing punches","Squats","Band X"};


    //tab bar click
    public void Workout()
    {
        wait.until(ExpectedConditions.visibilityOf(downTabbar));
        if(downTabbar.isDisplayed())
        {
            trackingTab.click();
            workoutsTab.click();
            settingsTab.click();

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
        tapDrill52();
        wait.until(ExpectedConditions.visibilityOf(routineButton));
        routineButton.click();

        shuffleDrill52Button.click();
        shuffleDrill52Button.click();
        drill52previewButton.click();
        wait.until(ExpectedConditions.visibilityOf(workoutsViewTitle));
        assertEquals(workoutsViewTitle.getText(),"THE DAILY SHUFFLE PREVIEW");

    }

    //Go to workout preview ,check-uncheck , go ro preview ,than video
    public void fullRoutine()
    {

        selectRoutine();

        for(int i=1;i<=4;i++)
        {

            //WebElement tablCell= driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[i]/UIASwitch[1]"));

            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).click();
            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).click();
            String a=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIASwitch[1]")).getAttribute("value");
          //  String b=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIAStaticText[1]")).getAttribute("value");
            assertEquals("1",a);
          // assertEquals(routines[i],b);
           // driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+ i +"]/UIAStaticText[1]")).click();
           // videoButton.click();
            //wait.until(ExpectedConditions.visibilityOf(videoButton));
            //wait.until(ExpectedConditions.visibilityOf(previewButton));
           // previewButton.click();
            //if(i!=4)
            //{
            //    nextButton.click();
           // }

           // backButton.click();

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



        driver.rotate(ScreenOrientation.LANDSCAPE);
        wait.until(ExpectedConditions.visibilityOf(buttonSound));
        buttonSound.click();
        wait.until(ExpectedConditions.visibilityOf(buttonCross));
        buttonCross.click();
        buttonMusic.click();
        wait.until(ExpectedConditions.visibilityOf(buttonCross1));
        buttonCross1.click();
        driver.rotate(ScreenOrientation.PORTRAIT);



        wait.until(ExpectedConditions.visibilityOf(buttonPause));
        buttonPause.click();
        wait.until(ExpectedConditions.visibilityOf(buttonCross));
        buttonCross.click();
        wait.until(ExpectedConditions.visibilityOf(dealCard));
        for(int i=1;i<=50;i++)
        {
            dealCard.click();
        }
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

   //    assertTrue(shuffler.isDisplayed());
    //   assertTrue(finisher.isDisplayed());

        //shareButton.click();
        //wait.until(ExpectedConditions.visibilityOf(shareFB));
        //shareFB.click();
       // wait.until(ExpectedConditions.visibilityOf(postButton));
       // postButton.click();
        wait.until(ExpectedConditions.visibilityOf(doneButton));
       // wait.until(ExpectedConditions.visibilityOf(sociable));
       // assertTrue(sociable.isDisplayed());
        doneButton.click();
        achievement();

    }

    public void achievement ()
    {

        trackingTab.click();

        driver.tap(1,178,534,5);
        wait.until(ExpectedConditions.visibilityOf(workoutsViewTitle));
        assertEquals(workoutsViewTitle.getText(),"ACHIEVEMENTS");
        assertTrue(shufflerAchievement.isEnabled());
        assertTrue(finisherAchievement.isEnabled());
        assertTrue(sociableAchievement.isEnabled());

    }



    public String getWorkoutsViewTitle(){
        return workoutsViewTitle.getText();
    }

    public String getDrill52TitleText(){
        return drill52TitleText.getText();
    }

}
