package testBase;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Models extends BaseClass {
    public Models(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[3]/div/nav/ul/li[1]/button")
    public WebElement modelsButton;

    @FindBy (xpath = "//html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/div/div[1]/div[1]")
    public WebElement allDealPageTitle;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/nav/ul/li[2]/button")
    public WebElement savsButtonOnModelsPage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]")
    public WebElement savsPageHeadline;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/nav/ul/li[3]/button")
    public WebElement sedansButtonOnModelsPage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div/div[1]")
    public WebElement sedansPageHeadline;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/nav/ul/li[4]/button")
    public WebElement coupesButtonOnModelsPage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/div/div[4]/div/div[1]")
    public WebElement coupesPageHeadline;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/nav/ul/li[5]/button")
    public WebElement convertiblesButtonOnModelsPage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/div/div[5]/div/div[1]")
    public WebElement convertiblePageHeadline;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/nav/ul/li[7]/button")
    public WebElement electrifiedButtonOnModelsPage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/div/div[6]/div[1]/div/div[1]/div")
    public WebElement electrifiedPageHeadline;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/nav/ul/li[8]/button")
    public WebElement bmwMButtonOnModelsPage;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[5]/div[1]/div/div/div[2]/div/div/div[2]/div/div[7]/div[1]/div/div[1]/div")
    public WebElement bmwMPageHeadline;

    public void modelsPage(){
        clickmodelsButton();
    }
    public void savsPage(){
        clickmodelsButton();
        waitForElementToBeVisible(savsButtonOnModelsPage);
        clicksavsButtonOnModelsPage();
    }
    public void sedanPage(){
        clickmodelsButton();
        clicksedansButtonOnModelsPage();
    }
    public void coupesPage(){
        clickmodelsButton();
        clickcoupesButtonOnModelsPage();
    }
    public void convertiblesPage(){
        clickmodelsButton();
        clickconvertiblesButtonOnModelsPage();
    }
    public void electrifiedPage(){
        clickmodelsButton();
        clickelectrifiedButtonOnModelsPage();
    }
    public void bmwMPage(){
        clickmodelsButton();
        clickbmwMButtonOnModelsPage();
    }
    private void clickmodelsButton(){clickJScript(modelsButton);}
    private void clicksavsButtonOnModelsPage(){clickJScript(savsButtonOnModelsPage);}
    private void clicksedansButtonOnModelsPage(){clickJScript(sedansButtonOnModelsPage);}
    private void clickcoupesButtonOnModelsPage(){clickJScript(coupesButtonOnModelsPage);}
    private void clickconvertiblesButtonOnModelsPage(){clickJScript(convertiblesButtonOnModelsPage);}
    private void clickelectrifiedButtonOnModelsPage(){clickJScript(electrifiedButtonOnModelsPage);}
    private void clickbmwMButtonOnModelsPage(){clickJScript(bmwMButtonOnModelsPage);}



}
