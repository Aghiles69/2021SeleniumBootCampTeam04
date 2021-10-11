package testBase;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AffordablityCalculator extends BaseClass {
    public AffordablityCalculator(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"header-content\"]/header[2]/div[2]/div[2]/a")
    public WebElement buyButtonAndDropDown;

    @FindBy(xpath = "//*[@id=\"header-content\"]/header[2]/div[2]/div[2]/div/div/div/div[2]/ul/li[1]/a")
    public WebElement affordabilityCalculatorButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[1]/div/h1")
    public WebElement affordabilityCalculatorPageTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[2]/div[1]/div/div[1]/div/form/div[1]/span/span/div/input")
    public WebElement annualHouseholdIncomeInutBox;

    @FindBy(xpath = "//*[@id=\"estimate\"]/div/div[1]/div[1]/div/span")
    public WebElement estimatePriceValueText;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[2]/div[1]/div/div[1]/div/form/div[1]/span/span[2]")
    public WebElement incomeInputBoxErrorMessage;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[2]/div[1]/div/div[1]/div/form/div[2]/span/span/div/input")
    public WebElement downPaymentInputBox;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[2]/div[1]/div/div[1]/div/form/div[2]/span/span[2]")
    public WebElement downPaymentErrorMessage;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[2]/div[1]/div/div[1]/div/form/div[3]/span/span")
    public WebElement monthlyDebtsinputBox;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[2]/div[1]/div/div[1]/div/form/div[3]/span/span[2]")
    public WebElement monthlyDebtsErrorMessage;

    @FindBy(xpath = "//*[@id=\"search-box-input\"]")
    public WebElement whereAreYouBuyingInputBox;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[2]/div[1]/div/div[1]/div/form/div[4]/div[1]/div/form/div[3]/div/div/div[2]/a")
    public WebElement whereAreYouBuyingDropDownBox;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/section/div[2]/div[1]/div/div[1]/div/form/div[4]/div[1]/div/form/div[3]/div/div/div[2]/a")
    public WebElement pick1stOptionFromDropDown;

    @FindBy(xpath = "//*[@id=\"estimate\"]/div")
    public WebElement afforabilityEstimation;

    @FindBy(xpath = "//*[@id=\"estimate\"]/div/div[1]/div[3]/div/div/div[1]")
    public WebElement slider;

    public void affordabilityCalculatorPage(){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
    }
    public void annualIncomeInputBoxValidInt(String income){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysToannualHouseholdIncomeInutBox(income);
    }
    public void annualIncomeInputBoxInvalidInt(String income){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysToannualHouseholdIncomeInutBox(income);
    }
    public void annualIncomeInputBoxNegativeInt(String income){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysToannualHouseholdIncomeInutBox(income);
    }
    public void annualIncomeInputBoxNoData(String income){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysToannualHouseholdIncomeInutBox(income);
    }
    public void downPaymentInputBoxValidData(String downPayment){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTodownPaymentInputBox(downPayment);
    }
    public void downPaymentInputBoxInvalidData(String downPayment){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTodownPaymentInputBox(downPayment);
    }
    public void downPaymentInputBoxNegativeData(String downPayment){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTodownPaymentInputBox(downPayment);
    }
    public void downPaymentInputBoxNoData(String downPayment){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTodownPaymentInputBox(downPayment);
    }
    public void monthlyDebtsInputBoxWithValidData(String debts){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTomonthlyDebtsinputBox(debts);
    }
    public void monthlyDebtsInputBoxWithInvalidData(String debts){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTomonthlyDebtsinputBox(debts);
    }
    public void monthlyDebtsInputBoxWithNegativeData(String debts){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTomonthlyDebtsinputBox(debts);
    }
    public void monthlyDebtsInputBoxWithNoData(String debts){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTomonthlyDebtsinputBox(debts);
    }
    public void whereAreYouBuyingInputBoxCity(String cityName){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTowhereAreYouBuyingInputBox(cityName);
        waitForElementToBeVisible(whereAreYouBuyingDropDownBox);
        clickwhereAreYouBuyingDropDownBox();
    }
    public void whereAreYouBuyingInputBoxInvalidCity(String cityName){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTowhereAreYouBuyingInputBox(cityName);
    }
    public void whereAreYouBuyingInputBoxNoData(String data){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTowhereAreYouBuyingInputBox(data);
    }
    public void whereAreYouBuyingInputBoxNeighborhood(String neighborhoodName){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTowhereAreYouBuyingInputBox(neighborhoodName);
        waitForElementToBeVisible(pick1stOptionFromDropDown);
        clickpick1stOptionFromDropDown();
    }
    public void whereAreYouBuyingInputBoxInvalidNeighborhood(String neighborhoodName){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTowhereAreYouBuyingInputBox(neighborhoodName);
    }
    public void whereAreYouBuyingInputBoxZip(String zipcode){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTowhereAreYouBuyingInputBox(zipcode);
    }
    public void whereAreYouBuyingInputBoxInvalidZip(String zipcode){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTowhereAreYouBuyingInputBox(zipcode);
    }
    public void whereAreYouBuyingInputBoxInvalidData(String data){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        sendKeysTowhereAreYouBuyingInputBox(data);
    }
    public void moveSlider(){
        mouseHover(buyButtonAndDropDown);
        waitForElementToBeVisible(affordabilityCalculatorButton);
        clickaffordabilityCalculatorButton();
        clickafforabilityEstimation();
//        driver.switchTo().frame("right");
//        driver.switchTo().frame("right");
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
        action.perform();
    }



    private void clickaffordabilityCalculatorButton(){clickJScript(affordabilityCalculatorButton);}
    private void sendKeysToannualHouseholdIncomeInutBox(String income) {
        sendKeysToElement(annualHouseholdIncomeInutBox, income);
    }
    private void sendKeysTodownPaymentInputBox(String downPayment) {
        sendKeysToElement(downPaymentInputBox, downPayment);
    }
    private void sendKeysTomonthlyDebtsinputBox(String debts) {
        sendKeysToElement(monthlyDebtsinputBox, debts);
    }
    private void sendKeysTowhereAreYouBuyingInputBox(String cityName) {
        sendKeysToElement(whereAreYouBuyingInputBox, cityName);
    }
    private void clickwhereAreYouBuyingDropDownBox(){clickJScript(whereAreYouBuyingDropDownBox);}
    private void clickpick1stOptionFromDropDown(){clickJScript(pick1stOptionFromDropDown);}
    private void clickafforabilityEstimation(){clickJScript(afforabilityEstimation);}

}
