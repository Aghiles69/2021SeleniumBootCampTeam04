package citihometest;

import citibankhome.CitiHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CitiHomePageTest extends WebAPI {
    static CitiHomePage citipage ;

    public void initElem(){ citipage = PageFactory.initElements(driver,CitiHomePage.class); }

    @Test(priority = 1)
    public void testCreditCardFeature(){
        initElem();
        citipage.checkCreditCardFeature();
    }

    @Test(priority = 2)
    public void testBankingFeature(){
        initElem();
        citipage.checkBankingFeature();
    }

    @Test(priority = 3)
    public void testLendingFeature(){
        initElem();
        citipage.checkLendingFeature();
    }

    @Test(priority = 4)
    public void testInvestingFeature(){
        initElem();
        citipage.checkInvestingFeature();
    }

    @Test(priority = 5)
    public void testCitiGoldFeature(){
        initElem();
        citipage.checkCitiGoldFeature();
    }

    @Test(priority = 6)
    public void testHelpFeature(){
        initElem();
        citipage.checkHelpFeature();
    }

    @Test(priority = 7)
    public void testReadMoreFeature(){
        initElem();
        citipage.checkReadMoreFeature();
    }

    @Test(priority = 8)
    public void testLogo(){
        initElem();
        citipage.checkLogo();
    }

    @Test(priority = 9)
    public void testUserId(){
        initElem();
        citipage.CheckUserId();
    }

    @Test(priority = 10)
    public void testPassword(){
        initElem();
        citipage.checkPassword();
    }







}
