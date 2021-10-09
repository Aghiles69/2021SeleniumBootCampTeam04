package testBase;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cars extends BaseClass
    {

        public Cars(){
        PageFactory.initElements(driver,this);
    }


        @FindBy(xpath="//*[@id=\"wizardMainRegionV2\"]/div/div/div[2]/div/div/ul/li[3]/a/span")
        public WebElement cars;

        @FindBy (xpath="//*[@id=\"location-field-locn-menu\"]/div[1]/button")
        public WebElement pickUpLocation;

        @FindBy (xpath = "//*[@id=\"location-field-loc2-menu\"]/div[1]/button")
        public WebElement searchPickUpLocation;

        @FindBy (xpath = "//*[@id=\"location-field-loc2-menu\"]/div[1]/button")
        public WebElement dropOffLocation;

        @FindBy(xpath = "//*[@id=\"location-field-loc2\"]")
        public WebElement searchDropOffLocation;

        @FindBy(xpath="//*[@id=\"d1-btn\"]")
        public WebElement pickUpDate;

        @FindBy(xpath="//*[@id=\"d2-btn\"]")
        public WebElement dropOffDate;

        @FindBy (xpath = "//*[@id=\"Rental-cars-transportation\"]/div[2]/div[2]/div/select")
        public WebElement pickupTime;

        @FindBy (xpath ="//*[@id=\"Rental-cars-transportation\"]/div[2]/div[3]/div/select")
        public WebElement dropOffTime;

        @FindBy (xpath="//*[@id=\"aarp-checkbox-toggle\"]")
        public WebElement AARPButton;

        @FindBy (xpath = "//*[@id=\"aarp-checkbox-toggle\"]")
        public WebElement discountOption;

        @FindBy(xpath = "//*[@id=\"Rental-cars-transportation\"]/div[3]/div[2]/button")
        public WebElement searchButton;

        public void searchCarsWithoutPickingDateAndTime() {
            clickcars();
            clickpickUpLocation();

            sendKeysTosearchPickUpLocation("New York");
            clickdropOffLocation();
            sendKeysTosearchDropOffLocation("New Jersey");
            clicksearchButton();
        }
        public void searchcarswithDate(){
            clickcars();
            clickpickUpLocation();
            sendKeysTosearchPickUpLocation("New York");
            clickdropOffLocation();
            sendKeysTosearchDropOffLocation("New Jersey");
            clickpickupDate();
            clickDropOffDate();
            clicksearchButton();

        }
        public void searchcarsWithTime(){
            clickcars();
            clickpickUpLocation();
            sendKeysTosearchPickUpLocation("New York");
            clickdropOffLocation();
            sendKeysTosearchPickUpLocation("New Jersey");
            clickpickupTime();
            clickdropOffTime();
            clicksearchButton();
        }
        public void searchcarsForAARPMembers(){
            clickcars();
            clickpickUpLocation();
            sendKeysTosearchPickUpLocation("New York");
            clickdropOffLocation();
            sendKeysTosearchPickUpLocation("New Jersey");
            clickpickupTime();
            clickdropOffTime();
            clickAARPButton();
            clicksearchButton();
        }
        public void searchcarsWithInvalidData(){
            clickcars();
            clickpickUpLocation();
            sendKeysTosearchPickUpLocation("New York");
            clickdropOffLocation();
            sendKeysTosearchPickUpLocation("New Jersey");
            clickpickupTime();
            clickdropOffTime();
            clickAARPButton();
            clicksearchButton();
        }
        public void pickPrefferedBrand(){
            clickcars();
            clickpickUpLocation();
            sendKeysTosearchPickUpLocation("New York");
            clickdropOffLocation();
            sendKeysTosearchPickUpLocation("New Jersey");
            clickpickupTime();
            clickdropOffTime();
            clickpreferredCompanyDropDown();
            clicksearchButton();
        }
        private void clickcars(){clickJScript(cars);}

        private void sendKeysTosearchPickUpLocation(String keys) {
            sendKeysToElement(searchPickUpLocation, keys);}
        private void sendKeysTosearchDropOffLocation(String keys) {
            sendKeysToElement(searchPickUpLocation, keys);}
        private void clickpickupDate(){clickJScript(pickUpDate);}
        private void clickDropOffDate(){clickJScript(dropOffDate);}
        private void clickpickupTime(){clickJScript(pickupTime);}
        private void clickdropOffTime(){clickJScript(dropOffTime);}
        private void clickAARPButton(){clickJScript(AARPButton);}
        private void clickpreferredCompanyDropDown(){clickJScript(discountOption);}
        private void clicksearchButton(){clickJScript(searchButton);}
        private void clickdropOffLocation(){clickJScript(dropOffLocation);}
        private void clickpickUpLocation(){clickJScript(pickUpLocation);}






    }

