package testloging;

import common.WebAPI;
import loging.LogingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest extends WebAPI {
    static LogingPage loginpage;
    public void initializeElement(){ loginpage = PageFactory.initElements(driver, LogingPage.class);}

    @Test(priority = 1)
    public void testLoginButonFeature(){
        initializeElement();
        loginpage.loginButtonFeature(); }

    @Test(priority = 2)
    public void testEmailUserFeature(){
        initializeElement();
        loginpage.loginButtonFeature();
        loginpage.emailUserFeature();
    }

    @Test(priority = 3)
    public void testPassWordfeature(){
        initializeElement();
        loginpage.loginButtonFeature();
        loginpage.emailUserFeature();
        loginpage.passWordFeature();
    }

    @Test(priority = 4)
    public void testClickLoginButoonFeature(){
        initializeElement();
        loginpage.loginButtonFeature();
        loginpage.emailUserFeature();
        loginpage.passWordFeature();
        loginpage.clickLoginButtonFeature();

    }

    @Test(priority = 5)
    public void testPoliticsFeature(){
        initializeElement();
        loginpage.loginButtonFeature();
        loginpage.emailUserFeature();
        loginpage.passWordFeature();
        loginpage.clickLoginButtonFeature();
        loginpage.politicsFeature();

    }

    @Test(priority = 6)
    public void testLogoFeature(){
        initializeElement();
        loginpage.loginButtonFeature();
        loginpage.emailUserFeature();
        loginpage.passWordFeature();
        loginpage.clickLoginButtonFeature();
        loginpage.logoFeature();
    }

    @Test(priority = 7)
    public void testListenFeature(){
        initializeElement();
        loginpage.loginButtonFeature();
        loginpage.emailUserFeature();
        loginpage.passWordFeature();
        loginpage.clickLoginButtonFeature();
        loginpage.listenFeature();

    }

//    @Test(priority = 8)
//    public void testPodcastsFeature(){
//
//        initializeElement();
//        loginpage.loginButtonFeature();
//        loginpage.emailUserFeature();
//        loginpage.passWordFeature();
//        loginpage.clickLoginButtonFeature();
//        loginpage.prodcastsFeature();
//    }




}
