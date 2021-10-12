package citibankhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static citibankhome.CitiWebElements.*;

public class CitiHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = CreditCard)
    public WebElement credit;
    public void checkCreditCardFeature(){
     credit.click();
    }

    @FindBy(how = How.XPATH,using = Banking)
    public WebElement bank;
    public void checkBankingFeature(){
        bank.click();
    }

    @FindBy(how = How.XPATH, using = Lending)
    public WebElement lend;
    public void checkLendingFeature(){
        lend.click();
    }

    @FindBy(how = How.XPATH, using = Investing)
    public WebElement invest;
    public void checkInvestingFeature(){
        invest.click();
    }

    @FindBy(how = How.XPATH, using = CitiGold)
    public WebElement citigold;
    public void checkCitiGoldFeature(){
        citigold.click();
    }

    @FindBy(how= How.XPATH, using = Hepl)
    public WebElement help;
    public void checkHelpFeature(){
        help.click();
    }

    @FindBy(how = How.XPATH, using = ReadMore)
    public WebElement readmore;
    public void checkReadMoreFeature(){
        readmore.click();
    }

    @FindBy(how = How.XPATH, using = Logo)
    public WebElement logo;
    public void checkLogo(){
        logo.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = UserId)
    public WebElement user;
    public void CheckUserId(){
        user.sendKeys("jhdggf");
    }

    @FindBy(how = How.XPATH, using = Password)
    public WebElement PASSWORD;
    public void checkPassword(){
        PASSWORD.sendKeys("1234");
    }
}
