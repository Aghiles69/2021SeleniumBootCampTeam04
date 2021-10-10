package testPom;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.Models;

public class TestModels extends BaseClass {
    public Models models = new Models();

    @Test(description = "Tc001",enabled = true)
    public void modelsPage(){
        models = new Models();
        models.modelsPage();
        String actualText = models.allDealPageTitle.getText();
        String expectedText = "ALL MODELS";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "Tc002",enabled = true)
    public void savsPage(){
        models = new Models();
        models.savsPage();
        String actualText = models.savsPageHeadline.getText();
        String expectedText = "SPORTS ACTIVITY VEHICLES";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC003", enabled = false)
    public void sedanPage(){
        models = new Models();
        models.sedanPage();
        String actualText = models.sedansPageHeadline.getText();
        String expectedText = "SEDANS & GRAN COUPES";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test (description = "TC004", enabled = false)
    public void coupesPage(){
        models = new Models();
        models.coupesPage();
        String actualText = models.coupesPageHeadline.getText();
        String expectedText = "COUPES";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "Tc005",enabled = false)
    public void convertiblesPage(){
        models = new Models();
        models.convertiblesPage();
        String actualText = models.convertiblePageHeadline.getText();
        String expectedText = "CONVERTIBLES";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "Tc006",enabled = false)
    public void electrifiedPage() {
        models = new Models();
        models.electrifiedPage();
        String actualText = models.electrifiedPageHeadline.getText();
        String expectedText = "All-Electric";
        Assert.assertEquals(actualText, expectedText);
    }
    @Test(description = "Tc007",enabled = false)
    public void bmwMPage() {
        models = new Models();
        models.bmwMPage();
        String actualText = models.bmwMPageHeadline.getText();
        String expectedText = "THE MOST POWERFUL LETTER IN THE WORLD";
        Assert.assertEquals(actualText, expectedText);
    }
}
