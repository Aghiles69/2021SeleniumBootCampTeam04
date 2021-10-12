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

    @FindBy(xpath = "//*[@id=\"search-tabpanel\"]/div/div[3]/div[3]/div/div/div[2]")
    public WebElement checkOutDate;

    @FindBy(xpath = "//*[@id=\"search-tabpanel\"]/div/div[5]/div[1]/div/div[2]")
    public WebElement guestDropDown;

    @FindBy(xpath = "//*[@id=\"stepper-adults\"]/button[2]/span/svg/path")
    public WebElement add1Adult;

    @FindBy(xpath = "//*[@id=\"stepper-adults\"]/button[1]/span/svg")
    public WebElement remove1Adult;

    @FindBy(xpath = "//*[@id=\"stepper-children\"]/button[2]/span/svg")
    public WebElement add1Children;

    @FindBy(xpath = "//*[@id=\"stepper-children\"]/button[1]/span/svg/path")
    public WebElement remove1Children;

    @FindBy(xpath = "//*[@id=\"stepper-infants\"]/button[2]/span/svg")
    public WebElement add1Infants;

    @FindBy(xpath = "//*[@id=\"stepper-infants\"]/button[1]")
    public WebElement remove1Infants;


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
    public void doSearchWithCheckOutdate(String keys) {
        waitForElementToBeVisible(locationInputBox);
        clicklocationInputBox();
        sendKeysTolocationInputBox(keys);
        sendKeysTocheckOutDate(keys);
        clicksearchButton();
    }
    public void doSearchWithCheckinAndOut(String keys) {
        waitForElementToBeVisible(locationInputBox);
        clicklocationInputBox();
        sendKeysTolocationInputBox(keys);
        sendKeysTocheckInDate(keys);
        sendKeysTocheckOutDate(keys);
        clicksearchButton();
    }
    public void doSearchWithOnlyAddingAdults() {
        clickGuestDropDown();
        clickadd1Adult();
        clicksearchButton();
    }
    public void doSearchWithOnlyRemovingAdults() {
        clickGuestDropDown();
        clickremove1Adult();
        clicksearchButton();
    }
    public void doSearchWithOnlyAddingChildren() {
        clickGuestDropDown();
        clickadd1Children();
        clicksearchButton();
    }
    public void doSearchWithOnlyRemovingChildren() {
        clickGuestDropDown();
        clickremove1Children();
        clicksearchButton();
    }
    public void doSearchWithOnlyAddingInfants() {
        clickGuestDropDown();
        clickadd1Infants();
        clicksearchButton();
    }
    public void doSearchWithOnlyRemovingInfants() {
        clickGuestDropDown();
        clickremove1Infants();
        clicksearchButton();
    }

    private void sendKeysTolocationInputBox(String keys) {
        sendKeysToElement(locationInputBox, keys);}
    public void clicksearchButton(){clickJScript(searchButton);}
    public void clicklocationInputBox(){clickJScript(locationInputBox);}
    private void sendKeysTocheckInDate(String keys) {
        sendKeysToElement(checkInDate, keys);}
    private void sendKeysTocheckOutDate(String keys) {
        sendKeysToElement(checkOutDate, keys);}
    public void clickGuestDropDown(){clickJScript(guestDropDown);}
    public void clickadd1Adult(){clickJScript(add1Adult);}
    public void clickremove1Adult(){clickJScript(remove1Adult);}
    public void clickadd1Children(){clickJScript(add1Children);}
    public void clickremove1Children(){clickJScript(remove1Children);}
    public void clickadd1Infants(){clickJScript(add1Infants);}
    public void clickremove1Infants(){clickJScript(remove1Infants);}



}
