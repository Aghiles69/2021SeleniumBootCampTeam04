package loging;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static loging.WebElementLoging.*;


public class LogingPage extends WebAPI {

    @FindBy(how = How.XPATH, using = webLoginButton)
    public WebElement loginbutton;
    public void loginButtonFeature(){
        loginbutton.click();
    }

    @FindBy(how = How.XPATH, using = webenterEmail)
    public WebElement webemail;
    public void emailUserFeature(){
        webemail.sendKeys("kecili2020@gmail.com");
    }

    @FindBy(how = How.XPATH, using = webPassWord)
    public WebElement password;
    public void passWordFeature(){
        password.sendKeys("12345@PNT");
    }

    @FindBy(how = How.XPATH, using = webClickButton)
    public WebElement clickbutton;
    public void clickLoginButtonFeature(){
        clickbutton.click();
    }

    @FindBy(how = How.XPATH, using = webPolitics)
    public WebElement politics;
    public void politicsFeature(){
        politics.click();
    }

    @FindBy(how = How.XPATH, using = webLogo)
    public WebElement logo;
    public void logoFeature(){
        logo.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = webListen)
    public WebElement listen;
    public void listenFeature(){
        listen.click();
    }

//    @FindBy(how = How.XPATH, using = webPodcasts)
//    public WebElement podcasts;
//    public void prodcastsFeature() {
//
//        Instantiate Action Class
//        Actions action = new Actions(driver);
//        action.moveToElement(podcasts).perform();
//        System.out.println("Done Mouse hover on 'podcast' from Menu");

        //Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
        //  WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]"));
        //Mouse hover menuOption 'Rock'
        //	actions.moveToElement(subMenuOption).perform();
        //	System.out.println("Done Mouse hover on 'Rock' from Menu");

        //Now , finally, it displays the desired menu list from which required option needs to be selected
        //Now Select 'Alternative' from sub menu which has got displayed on mouse hover of 'Rock'
        //  WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
        //	selectMenuOption.click();
        //	System.out.println("Selected 'Alternative' from Menu");
  //    }

}
