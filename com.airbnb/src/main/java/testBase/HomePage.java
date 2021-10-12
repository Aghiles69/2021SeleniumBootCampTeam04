package testBase;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"bigsearch-query-attached-location-input\"]")
    public WebElement locationInputBox;


    @FindBy(xpath = "//*[@id=\"search-tabpanel\"]/div/div[5]/div[2]/button/span[1]/span")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[1]/div/div/div/div/div/section/h1/span")
    public WebElement searchResultsPage;

    @FindBy(xpath = "//*[@id=\"search-tabpanel\"]/div/div[3]/div[1]/div/div/div[2]")
    public WebElement checkInDate;

    public void doSearchWithOnlyLocation(String keys) {
        waitForElementToBeVisible(locationInputBox);
        clicklocationInputBox();
        sendKeysTolocationInputBox(keys);
        clicksearchButton();
    }
    public void doSearchWithInvalidLocation(String keys) {
        waitForElementToBeVisible(locationInputBox);
        clicklocationInputBox();
        sendKeysTolocationInputBox(keys);
        clicksearchButton();
    }
    public void doSearchWithCheckInDate(String keys) {
        waitForElementToBeVisible(locationInputBox);
        clicklocationInputBox();
        sendKeysTolocationInputBox(keys);
        sendKeysTocheckInDate(keys);
        clicksearchButton();
    }



    private void sendKeysTolocationInputBox(String keys) {
        sendKeysToElement(locationInputBox, keys);}
    public void clicksearchButton(){clickJScript(searchButton);}
    public void clicklocationInputBox(){clickJScript(locationInputBox);}
    private void sendKeysTocheckInDate(String keys) {
        sendKeysToElement(checkInDate, keys);}
}
