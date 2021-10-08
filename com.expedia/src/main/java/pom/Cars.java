package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cars extends BaseClass
    {

        public Cars(){
        PageFactory.initElements(driver,this);
    }

        @FindBy(xpath="//*[@id=wizardMainRegionV2]/div/div/div[2]/div/div/ul/li[3]/a")
        public WebElement cars;

        @FindBy (css="#location-field-locn")
        public WebElement searchPickUpLocation;

        @FindBy (xpath = "//*[@id=location-field-loc2-menu]/div[1]/button")
        public WebElement searchDropOffLocation;

        @FindBy(css="#d1-btn")
        public WebElement pickUpDate;

        @FindBy(css="#d2-btn")
        public WebElement dropOffDate;

        @FindBy (xpath = "//*[@id=Rental-cars-transportation]/div[2]/div[2]/div/select")
        public WebElement pickupTime;

        @FindBy (xpath ="//*[@id=Rental-cars-transportation]/div[2]/div[3]/div/select")
        public WebElement dropOffTime;

        @FindBy (css="#aarp-checkbox-toggle")
        public WebElement AARPButton;

        @FindBy (xpath = "//*[@id=Rental-cars-transportation]/details/div/div/div/div/select")
        public WebElement preferredCompanyDropDown;

        @FindBy(xpath = "//*[@id=Rental-cars-transportation]/div[3]/div[2]/button")
        public WebElement searchButton;

        public void searchCarsWithoutPickingDateAndTime() {
            clickcars();
            sendKeysTosearchPickUpLocation("New York");
            sendKeysTosearchDropOffLocation("New Jersey");
            clicksearchButton();
        }
        public void searchcarswithDate(){
            clickcars();
            sendKeysTosearchPickUpLocation("New York");
            sendKeysTosearchDropOffLocation("New Jersey");
            clickpickupDate();
            clickDropOffDate();
            clicksearchButton();

        }
        public void searchcarsWithTime(){
            clickcars();
            sendKeysTosearchPickUpLocation("New York");
            sendKeysTosearchPickUpLocation("New Jersey");
            clickpickupTime();
            clickdropOffTime();
            clicksearchButton();
        }
        public void searchcarsForAARPMembers(){
            clickcars();
            sendKeysTosearchPickUpLocation("New York");
            sendKeysTosearchPickUpLocation("New Jersey");
            clickpickupTime();
            clickdropOffTime();
            clickAARPButton();
            clicksearchButton();
        }
        public void searchcarsWithInvalidData(){
            clickcars();
            sendKeysTosearchPickUpLocation("New York");
            sendKeysTosearchPickUpLocation("New Jersey");
            clickpickupTime();
            clickdropOffTime();
            clickAARPButton();
            clicksearchButton();
        }
        public void pickPrefferedBrand(){
            clickcars();
            sendKeysTosearchPickUpLocation("New York");
            sendKeysTosearchPickUpLocation("New Jersey");
            clickpickupTime();
            clickdropOffTime();
            clickpreferredCompanyDropDown();
            clicksearchButton();
        }
        private void clickcars(){clickJScript(cars);}

        private void sendKeysTosearchPickUpLocation(String keys) {
            sendKeysToInput(searchPickUpLocation, keys);}
        private void sendKeysTosearchDropOffLocation(String keys) {
            sendKeysToInput(searchPickUpLocation, keys);}
        private void clickpickupDate(){clickJScript(pickUpDate);}
        private void clickDropOffDate(){clickJScript(dropOffDate);}
        private void clickpickupTime(){clickJScript(pickupTime);}
        private void clickdropOffTime(){clickJScript(dropOffTime);}
        private void clickAARPButton(){clickJScript(AARPButton);}
        private void clickpreferredCompanyDropDown(){clickJScript(preferredCompanyDropDown);}
        private void clicksearchButton(){clickJScript(searchButton);}
        public String getText(WebElement element) {

            WebElement Text = explicitWait.until(ExpectedConditions.visibilityOf(element));
            return Text.getText();
        }


    }

