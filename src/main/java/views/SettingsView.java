package views;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertTrue;


public class SettingsView {


    WebDriverWait wait;

    public SettingsView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait = new WebDriverWait(driver, 60);
    }

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    public WebElement profileCell;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")
    public WebElement signOutCell;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")
    public WebElement pairWatchCell;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[1]")
    public WebElement contactCell;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[3]")
    public WebElement settingTab;

    @FindBy(name = "Logout")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]")
    public WebElement signOutButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]")
    public WebElement editsaveButton;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")
    public WebElement doneButton;



    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")
    public WebElement settingsTabTitle;


    public void settingsTab() {
        settingTab.click();
        profileCell.click();
        wait.until(ExpectedConditions.visibilityOf(editsaveButton));
        assertTrue(editsaveButton.isDisplayed());
        settingTab.click();
        pairWatchCell.click();
        wait.until(ExpectedConditions.visibilityOf(doneButton));
        assertTrue(doneButton.isDisplayed());
        settingTab.click();
        contactCell.click();
        wait.until(ExpectedConditions.visibilityOf(doneButton));
        assertTrue(doneButton.isDisplayed());
    }

    public void signOut(){
        signOutCell.click();
        signOutButton.click();
    }
}
