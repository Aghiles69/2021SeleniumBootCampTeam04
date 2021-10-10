package testBase;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NFL extends BaseClass {
    public NFL() {PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[3]/a")
    public WebElement nflButtonAndDropDown;

    @FindBy(xpath = "//*[@id=\"cbs-site-nav\"]/div/div[1]/div/div[3]/a/span")
    public WebElement nflHomPageTitle;

    @FindBy(xpath = "//*[@id=\"GlobalNav-dropdown--games\"]/span[1]")
    public WebElement playGameDropDown;

    @FindBy(xpath = "//*[@id=\"GlobalNav-dropdown--games\"]/div/div[1]/div[1]/div/div[1]/div/a/figure/img")
    public WebElement footballGameButton;

    @FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[1]/div/div/h1")
    public WebElement footballPageTitle;

    @FindBy(xpath = "//*[@id=\"saag-content\"]/div/div/div[1]/div[1]/span[2]")
    public WebElement nflScoreDropDown;

    @FindBy(xpath = "//*[@id=\"saag-content\"]/div/div/div[1]/div[2]/ul/li[1]/a")
    public WebElement nflInDropDown;

    @FindBy(xpath = "//*[@id=\"saag-content\"]/div/div/div[1]/div[2]/ul/li[2]/a")
    public WebElement ncaafInDroDown;

    @FindBy(xpath = "//*[@id=\"saag-content\"]/div/div/div[1]/div[2]/ul/li[3]/a")
    public WebElement mlbInDropDown;

    @FindBy(xpath = "//*[@id=\"saag-content\"]/div/div/div[1]/div[2]/ul/li[4]/a")
    public WebElement nbaInDropDown;

    @FindBy(xpath = "//*[@id=\"saag-content\"]/div/div/div[1]/div[2]/ul/li[5]/a")
    public WebElement nhlInDropDown;

    @FindBy(xpath = "//*[@id=\"saag-content\"]/div/div/div[1]/div[2]/ul/li[6]/a")
    public WebElement golfInDropDown;

    @FindBy(xpath = "//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[3]/div/ul[1]/li[2]/a")
    public WebElement nflHomePageScore;

    @FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div/div[1]")
    public WebElement nflScorePageTitle;

    @FindBy(xpath = "/html/body/div[1]/div[2]")
    public WebElement nflScorePageIframVideo;

    @FindBy(xpath = "//*[@id=\"VideoPlayer-2d270904-2feb-4c31-825e-339f6c5226e2\"]/div[1]/div[7]/div/button[2]")
    public WebElement iframePlayButton;

    @FindBy(xpath = "//*[@id=\"VideoPlayer-2d270904-2feb-4c31-825e-339f6c5226e2\"]/div[1]/div[7]/div/button[2]")
    public WebElement iframePauseButton;

    @FindBy(xpath = "//*[@id=\"anchor-video-close\"]")
    public WebElement iframeQuitVideobutton;

    @FindBy(xpath = "//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[3]/a")
    public WebElement nflHomePageScheduleButton;

    @FindBy(xpath = "//*[@id=\"PageTitle-header\"]")
    public WebElement nflSchedulePageTitle;

    @FindBy(xpath = "//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[4]/a")
    public WebElement nflHomePageStandingsPage;

    @FindBy(xpath = "//*[@id=\"PageTitle-header\"]")
    public WebElement nflStandingPageTitle;

    @FindBy(xpath = "//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[5]/a")
    public WebElement nflHomePageTeamsPage;

    @FindBy(xpath = "//*[@id=\"PageTitle-header\"]")
    public WebElement nflTeamsPageTitle;

    @FindBy(xpath = "//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[6]/a")
    public WebElement nflHomeStatsPage;

    @FindBy(xpath = "//*[@id=\"PageTitle-header\"]")
    public WebElement nflStatsPageTitle;

    public void nflHomePage(){
        clicknflButtonAndDropDown();
    }
    public void nflGamePage(){
        clicknflButtonAndDropDown();
        mouseHover(playGameDropDown);
        scrollJS(10);
        waitForElementToBeVisible(footballGameButton);
        clickfootballGameButton();
    }
    public void nflscorePage(){
        clicknflScoreDropDown();
        scrollJS(10);
        waitForElementToBeVisible(nflInDropDown);
        clicknflInDropDown();
    }
    public void ncaafScorePage() {
        clicknflScoreDropDown();
        scrollJS(10);
        waitForElementToBeVisible(ncaafInDroDown);
        clickncaafInDroDown();
    }
    public void mlbScorePage() {
        clicknflScoreDropDown();
        scrollJS(10);
        waitForElementToBeVisible(mlbInDropDown);
        clickmlbInDropDown();
    }
    public void nbaScorePage() {
        clicknflScoreDropDown();
        scrollJS(10);
        waitForElementToBeVisible(nbaInDropDown);
        clicknbaInDropDown();
    }
    public void nhlScorePage() {
        clicknflScoreDropDown();
        scrollJS(10);
        waitForElementToBeVisible(nhlInDropDown);
        clicknhlInDropDown();
    }
    public void golfScorePage() {
        clicknflScoreDropDown();
        scrollJS(10);
        waitForElementToBeVisible(golfInDropDown);
        clickgolfInDropDown();
    }
    public void nflScoreHomePage() {
        mouseHover(playGameDropDown);
        scrollJS(10);
        waitForElementToBeVisible(nflHomePageScore);
        clicknflHomePageScore();
    }
    public void nflScorePageVideoPlay(){
        mouseHover(playGameDropDown);
        scrollJS(10);
        clicknflHomePageScore();
        mouseHover(nflScorePageIframVideo);
        clickiframePlayButton();
    }
    public void nflScorePageVideoPause(){
        mouseHover(playGameDropDown);
        scrollJS(10);
        clicknflHomePageScore();
        mouseHover(nflScorePageIframVideo);
        clickiframePauseButton();
    }
    public void nflScorePageVideoQuit(){
        mouseHover(playGameDropDown);
        scrollJS(10);
        clicknflHomePageScore();
        mouseHover(nflScorePageIframVideo);
        clickiframeQuitVideobutton();
    }
    public void nflSchedulePage(){
        mouseHover(playGameDropDown);
        waitForElementToBeVisible(nflHomePageScheduleButton);
        clicknflHomePageScheduleButton();
        scrollJS(1000);
        scrollJS(-500);
        scrollJS(1000);
    }
    public void nflStandingsPage(){
        clicknflButtonAndDropDown();
        try {
            explicitWait.wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clicknflHomePageStandingsPage();
    }
    public void nflTeamsPage() {
        clicknflButtonAndDropDown();
        waitForElementToBeVisible(nflHomePageTeamsPage);
        clicknflHomePageTeamsPage();
    }
    public void nflStatsPage() {
        clicknflButtonAndDropDown();
        waitForElementToBeVisible(nflHomeStatsPage);
        clicknflHomeStatsPage();
    }

    private void clicknflButtonAndDropDown(){clickJScript(nflButtonAndDropDown);}
    private void clickfootballGameButton(){clickJScript(footballGameButton);}
    private void scrollJS(int i) {
    }
    private void clicknflScoreDropDown(){clickJScript(nflScoreDropDown);}
    private void clicknflInDropDown(){clickJScript(nflInDropDown);}
    private void clickncaafInDroDown(){clickJScript(ncaafInDroDown);}
    private void clickmlbInDropDown(){clickJScript(mlbInDropDown);}
    private void clicknbaInDropDown(){clickJScript(nbaInDropDown);}
    private void clicknhlInDropDown(){clickJScript(nhlInDropDown);}
    private void clickgolfInDropDown(){clickJScript(golfInDropDown);}
    private void clicknflHomePageScore(){clickJScript(nflHomePageScore);}
    private void clickiframePlayButton(){clickJScript(iframePlayButton);}
    private void clickiframePauseButton(){clickJScript(iframePauseButton);}
    private void clickiframeQuitVideobutton(){clickJScript(iframeQuitVideobutton);}
    private void clicknflHomePageScheduleButton(){clickJScript(nflHomePageScheduleButton);}
    private void clicknflHomePageStandingsPage(){clickJScript(nflHomePageStandingsPage);}
    private void clicknflHomePageTeamsPage(){clickJScript(nflHomePageTeamsPage);}
    private void clicknflHomeStatsPage(){clickJScript(nflHomeStatsPage);}



}



