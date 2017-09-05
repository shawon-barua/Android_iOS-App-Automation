package views;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CircItView {

    public AppiumDriver driver;
    WebDriverWait wait;

    public CircItView(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait = new WebDriverWait(driver, 60);

    }

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement circItTitleText;


    public String getCircItTileText(){
        return circItTitleText.getText();
    }

}
