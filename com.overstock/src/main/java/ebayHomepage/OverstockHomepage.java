package overstockHomepage;
import static overstockHomepage.OverstockHomepageLocators.*;

public class OverstockHomepage  extends BaseAPI{
    @FindBy (xpath = webelementButtonStore)
    public WebElement buttonStore;

    public OverstockHomepage(){
        PageFactory.initElements(driver, this);
    }
    public void clickOnStoreButton(){
        clickElement(buttonStore);
    }
    public void clickOnStoreButtonOutdoor(){
        clickJScript(buttonStore);
    }
}
