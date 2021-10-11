package TestBase;

import org.testng.annotations.Test;


import static org.testng.Assert .*;

    public class LoginTests extends Base.BaseTests {

        @Test
        public void testSuccessfulLogin() {
            LoginPage loginPage = homePage.clickFormAuthentication();
            loginPage.setUsername("bilal");
            loginPage.setPassword("SuperSecretPassword!");
            SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
            assertTrue(secureAreaPage.getAlertText()
                            .contains("You logged into a secure area!"),
                    "Alert text is incorrect");
        }
    }

