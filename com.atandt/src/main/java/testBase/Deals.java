package testBase;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Deals extends BaseClass {

    public Deals(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//*[@id=\"z1-tier1Nav\"]/a[1]")
    public WebElement dealsButton;

    @FindBy (xpath = "//*[@id=\"carouselRow-col-0\"]/div[2]/div/div/span/a")
    public WebElement wirelessButton;

    @FindBy (xpath = "//*[@id=\"HEADBAND00\"]/span/a/span")
    public WebElement exploreWirelessButton;

    @FindBy (xpath = "////*[@id=\"HERO_PANEL22\"]/div/div[2]/div/div/span/a")
    public WebElement shopNowOnWirelessPage;

    @FindBy (xpath = " //*[@id=\"__next\"]/div/div[3]/div/div/div/div/div/div/span")
    public WebElement textDecorationOnWirelessShopNowPage;

    @FindBy (xpath = "//*[@id=\"carouselRow-col-1\"]/div[2]/div/div/span/a")
    public WebElement internetAndTv;

    @FindBy(xpath = "//*[@id=\"RIVER_CARD1story\"]/div/div/h2")
    public WebElement headingInternetAndTvPage;

    @FindBy(xpath = "//*[@id=\"MOSAIC-GROUP-3-CTAS-container\"]/div/a")
    public WebElement shopInternet;

    @FindBy(xpath = "//*[@id=\"HERO_PANEL22\"]/div/div[2]/div/div/span/a")
    public WebElement checkAvailabiityOnInternt;

    @FindBy (xpath = "//*[@id=\"carouselRow-col-2\"]/div[2]/div/div/span/a")
    public WebElement accessoriesButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[1]/div/span")
    public WebElement accessoriesPageHeader;

    @FindBy(xpath = "//*[@id=\"searchInputdesktop\"]")
    public WebElement accessoriesPageSearchBox;

    @FindBy(xpath = "//*[@id=__next]/div[2]/div[2]/div[1]/div[4]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div/span")
    public WebElement filterAndSort;

    @FindBy(xpath = "//*[@id=701ba6af-c877-12cf-db15-7edde247e07c]")
    public WebElement priceLowToHighFilter;

    @FindBy (css = "//*[@id=HERO_PANEL22]/div/div[2]/div/div/span/a")
    public WebElement shopNowButton;

    @FindBy(xpath = "//*[@id=pageContainer]/div[1]/div[1]/div[4]/div/div/div/div/div[3]/i/svg/path")
    public WebElement maximizeImageOption;

    @FindBy(xpath = "/html/body/div[12]/div/div/div/div/div[1]/button/i")
    public WebElement closeMaximizeImage;

    @FindBy (css = "#DC-1-container > div.text-center > div")
    public WebElement pageContainer;

    @FindBy (xpath = "//*[@id=\"HERO_PANEL22\"]/div/div[1]/div/div/span/a")
    public WebElement checkAvailabilityButton;

    @FindBy (css = "#PRODUCT_CARDS5Cta > span > a")
    public WebElement shopAllDealsButton;

    @FindBy(xpath = "//*[@id=Find nearest store]")
    public WebElement findNearestStore;

    public void dealsPage(){
        clickdealsButton();
    }
    public void exploreWirelessPage(){
        clickdealsButton();
        clickwirelessButton();
        clickexploreWirelessButton();
        clickshopNowOnWirelessPage();
    }
    public void exploreInternetAndTv(){
        clickdealsButton();
        clickinternetAndTv();
        clickshopInternet();
        clickcheckAvailabiityOnInternt();
    }
    public void exploreAccessoriePage(String searchTerm){
        clickdealsButton();
        clickaccessoriesButton();
        sendKeysToaccessoriesPageSearchBox(searchTerm);
    }
    public void searchAccessoriesWithFilterON(){
        clickdealsButton();
        clickaccessoriesButton();
        clickfilterAndSort();
        clickpriceLowToHighFilter();
    }
    public void exploreShopNowOnDealPage(){
        clickdealsButton();
        clickshopNowButton();
        clickmaximizeImageOption();
        clickcloseMaximizeImage();
    }
    public void exploreCheckAvailabilityPage(){
        clickdealsButton();
        clickcheckAvailabilityButton();
    }
    public void exploreShopAllDealPage(){
        clickdealsButton();;
        clickshopAllDealsButton();
        clickfindNearestStore();
    }
    private void clickdealsButton(){clickJScript(dealsButton);}
    private void clickwirelessButton(){clickJScript(wirelessButton);}
    private void clickexploreWirelessButton(){clickJScript(exploreWirelessButton);}
    private void clickshopNowOnWirelessPage(){clickJScript(shopNowOnWirelessPage);}
    private void clickinternetAndTv(){clickJScript(internetAndTv);}
    private void clickshopInternet(){clickJScript(shopInternet);}
    private void clickcheckAvailabiityOnInternt(){clickJScript(checkAvailabiityOnInternt);}
    private void clickaccessoriesButton(){clickJScript(accessoriesButton);}
    private void sendKeysToaccessoriesPageSearchBox(String keys) {
        sendKeysToElement(accessoriesPageSearchBox, keys);}
    private void clickfilterAndSort(){clickJScript(filterAndSort);}
    private void clickpriceLowToHighFilter(){clickJScript(priceLowToHighFilter);}
    private void clickshopNowButton(){clickJScript(shopNowButton);}
    private void clickmaximizeImageOption(){clickJScript(maximizeImageOption);}
    private void clickcloseMaximizeImage(){clickJScript(closeMaximizeImage);}
    private void clickcheckAvailabilityButton(){clickJScript(checkAvailabilityButton);}
    private void clickshopAllDealsButton(){clickJScript(shopAllDealsButton);}
    private void clickfindNearestStore(){clickJScript(findNearestStore);}
}
