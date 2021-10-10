package testBase;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmallBusiness extends BaseClass {

    public SmallBusiness(){
        PageFactory.initElements(driver,this);}

    @FindBy (xpath = "//*[@id=\"NAV_BUSINESS_ADVANTAGE\"]")
    public WebElement smallBussinessButton;

    @FindBy (xpath = "//*[@id=\"onlineId1\"]")
    public WebElement onlineIdInputBox;

    @FindBy (xpath = "//*[@id=\"passcode1\"]")
    public WebElement passcodeInputBox;

    @FindBy (xpath = "//*[@id=\"saveOnlineId\"]")
    public WebElement saveOnlineIdCheckBox;

    @FindBy (xpath = "//*[@id=\"signIn\"]")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@id=\"forgot-oid-pwd\"]")
    public WebElement forgotIdAndPassword;

    @FindBy(xpath = "//*[@id=\"title-section\"]/div[1]/div")
    public WebElement forgotIdAndPasswordPageTitle;

    @FindBy (xpath = "//*[@id=\"security\"]")
    public WebElement securityAndHelp;

    @FindBy(xpath = "//*[@id=\"closeSecurityModal\"]")
    public WebElement securityAndHelpCloseButton;

    @FindBy(xpath = "//*[@id=\"acctNumber\"]")
    public WebElement cardOrAccountNumToResetAccount;

    @FindBy(xpath = "//*[@id=\"ssNumber\"]")
    public WebElement ssnOrTaxIdToResetAccount;

    @FindBy(xpath = "//*[@id=\"verifyCustomerAccount\"]")
    public WebElement continueButtonOnAccountResetPage;

    @FindBy(xpath = "//*[@id=\"reset-no-ssn-link\"]")
    public WebElement dontHaveSsnOrTIN;

    @FindBy(xpath = "//*[@id=\"ah-forgot-no-ssn-form\"]/div/div/div[1]/div[1]/h1")
    public WebElement noSsnOrTinPageTitle;

    @FindBy(xpath = "//*[@id=\"finCenterLocator\"]")
    public WebElement findStoreNearBy;

    @FindBy(xpath = "//*[@id=\"list-expand\"]/div[1]/div[2]/a")
    public WebElement findStoreNearByFilter;

    @FindBy(xpath = "//*[@id=\"q\"]")
    public WebElement findStoreNearBySearchInputBox;

    @FindBy(xpath = "//*[@id=\"search-button\"]")
    public WebElement findStoreNearBySearchButton;

    @FindBy(xpath = "//*[@id=\"filter-expand\"]/div[1]")
    public WebElement findStoreNearbyFilterPageTitle;

    @FindBy(xpath = "//*[@id=\"spid4515\"]")
    public  WebElement driveThruFilterCheckBox;

    @FindBy(xpath = "//*[@id=\"filter-expand\"]/div[2]/button")
    public WebElement filterApplyButton;

    public void smallBussinessPage(){
        clicksmallBussinessButton();
    }
    public void loginAsASmallBusinessUser(String id, String pass) {
        clicksmallBussinessButton();
        SendKeysToonlineIdInputBox(id);
        SendKeysTopasscodeInputBox(pass);
        clicksignInButton();
    }
    public void loginAsASmallBusinessWithNoData(String id, String pass) {
        clicksmallBussinessButton();
        SendKeysToonlineIdInputBox(id);
        SendKeysTopasscodeInputBox(pass);
        clicksignInButton();
    }
    public void loginAsASmallBusinessWithInavlidData(String id, String pass) {
        clicksmallBussinessButton();
        SendKeysToonlineIdInputBox(id);
        SendKeysTopasscodeInputBox(pass);
        clicksignInButton();
    }
    public void loginAsASmallBusinessAndSaveUserInfo(String id, String pass) {
        clicksmallBussinessButton();
        SendKeysToonlineIdInputBox(id);
        SendKeysTopasscodeInputBox(pass);
        clicksignInButton();
        clicksaveOnlineIdCheckBox();
    }
    public void forgotUserIdAndPassword(String cardOrAccountNumber, String ssnOrTaxId) {
        clicksmallBussinessButton();
        clickforgotIdAndPassword();
        SendKeysTocardOrAccountNumToResetAccount(cardOrAccountNumber);
        SendKeysTossnOrTaxIdToResetAccount(ssnOrTaxId);
//        clickcontinueButtonOnAccountResetPage();
    }
    public void resetUserAccountWithNoSsnOrTin() {
        clicksmallBussinessButton();
        clickforgotIdAndPassword();
        clickdontHaveSsnOrTIN();
    }
    public void securityAndHelp(){
        clicksmallBussinessButton();
        clicksecurityAndHelp();
        clicksecurityAndHelpCloseButton();
    }
    public void findStoreNearByNoFilter(String zipcode){
        clicksmallBussinessButton();
        clickfindStoreNearBy();
        SendKeysTofindStoreNearBySearchInputBox(zipcode);
        clickfindStoreNearBySearchButton();
    }
    public void findStoreNearByFilterPage(){
        clicksmallBussinessButton();
        clickfindStoreNearBy();
        clickfindStoreNearByFilter();
    }
    public void findStoreNearByUsingFilters(String zipcode){
        clicksmallBussinessButton();
        clickfindStoreNearBy();
        clickfindStoreNearByFilter();
        clickdriveThruFilterCheckBox();
        clickfilterApplyButton();
        SendKeysTofindStoreNearBySearchInputBox(zipcode);
        clickfindStoreNearBySearchButton();
    }

    private void clicksmallBussinessButton(){clickJScript(smallBussinessButton);}
    private void SendKeysToonlineIdInputBox(String id) {
        sendKeysToElement(onlineIdInputBox, id);}
    private void SendKeysTopasscodeInputBox(String pass) {
        sendKeysToElement(passcodeInputBox, pass);}
    private void clicksignInButton(){clickJScript(signInButton);}
    private void clicksaveOnlineIdCheckBox(){clickJScript(saveOnlineIdCheckBox);}
    private void clickforgotIdAndPassword(){clickJScript(forgotIdAndPassword);}
    private void SendKeysTocardOrAccountNumToResetAccount(String cardorAccountNumber) {
        sendKeysToElement(cardOrAccountNumToResetAccount, cardorAccountNumber);}
    private void SendKeysTossnOrTaxIdToResetAccount(String ssnOrTaxId) {
        sendKeysToElement(ssnOrTaxIdToResetAccount, ssnOrTaxId);}
    private void clickcontinueButtonOnAccountResetPage(){clickJScript(continueButtonOnAccountResetPage);}
    private void clickdontHaveSsnOrTIN(){clickJScript(dontHaveSsnOrTIN);}
    private void clicksecurityAndHelp(){clickJScript(securityAndHelp);}
    private void clicksecurityAndHelpCloseButton(){clickJScript(securityAndHelpCloseButton);}
    private void clickfindStoreNearBy(){clickJScript(findStoreNearBy);}
    private void clickfindStoreNearByFilter(){clickJScript(findStoreNearByFilter);}
    private void SendKeysTofindStoreNearBySearchInputBox(String zipcode) {
        sendKeysToElement(findStoreNearBySearchInputBox, zipcode);}
    private void clickfindStoreNearBySearchButton(){clickJScript(findStoreNearBySearchButton);}
    private void clickdriveThruFilterCheckBox(){clickJScript(driveThruFilterCheckBox);}
    private void clickfilterApplyButton(){clickJScript(filterApplyButton);}



}
