package testPom;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.NFL;

public class TestNFL extends BaseClass {
    public NFL nfl = new NFL();

    @Test(description = "TC001", enabled = false)
    public void nflPage(){
        nfl = new NFL();
        mouseHover(nfl.nflButtonAndDropDown);
        nfl.nflHomePage();
        String actualText = nfl.nflHomPageTitle.getText();
        String expectedText = "logo-sport icon-moon-arena-text-nfl";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test (description = "TC002", enabled = false)
    public void nflGamePage(){
        nfl = new NFL();
        nfl.nflGamePage();
        String actualText = nfl.footballPageTitle.getText();
        String expectedText = "2021 FOOTBALL PICK'EM";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC003", enabled = false)
    public void nflscorePage(){
        nfl = new NFL();
        nfl.nflscorePage();

    }
    @Test(description = "TC004", enabled = false)
    public void ncaafScorePage(){
        nfl = new NFL();
        nfl.ncaafScorePage();
    }
    @Test(description = "TC005", enabled = false)
    public void mlbScorePage() {
        nfl = new NFL();
        nfl.mlbScorePage();
    }
    @Test(description = "TC006", enabled = false)
    public void nbaScorePage() {
        nfl = new NFL();
        nfl.nbaScorePage();
    }
    @Test(description = "TC007", enabled = false)
    public void nhlScorePage() {
        nfl = new NFL();
        nfl.nhlScorePage();
    }
    @Test(description = "TC008", enabled = false)
    public void golfScorePage() {
        nfl = new NFL();
        nfl.golfScorePage();
    }
    @Test(description = "TC009", enabled = false)
    public void nflScoreHomePage() {
        nfl = new NFL();
        nfl.nflScoreHomePage();
        String actualText = nfl.nflScorePageTitle.getText();
        String expectedText = "NFL Scores";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC010", enabled = false)
    public void nflScorePageVideoPlay() {
        nfl = new NFL();
        nfl.nflScorePageVideoPlay();
    }
    @Test(description = "TC011", enabled = false)
    public void nflScorePageVideoPause() {
        nfl = new NFL();
        nfl.nflScorePageVideoPause();
    }
    @Test(description = "TC012", enabled = false)
    public void nflScorePageVideoQuit() {
        nfl = new NFL();
        nfl.nflScorePageVideoQuit();
    }
    @Test(description = "TC013", enabled = false)
    public void nflSchedulePage() {
        nfl = new NFL();
        nfl.nflSchedulePage();
        String actualText = nfl.nflSchedulePageTitle.getText();
        String expectedText = "NFL Schedule - Week 5";
        Assert.assertEquals(actualText,expectedText);
    }

}
