package TestBase;

public class HomePage extends BasePage {
    /**
     * Constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }
    /**
     * Variables
     */
    String baseURL = "https://www.redfin.com//";
    /**
     * Web Elements
     */

    By signInButtonClass = By.className("btnSignIn");
    /**
     * Page Methods
     */
    //Go to Homepage
    public HomePage goToN11() {
        Log.info("Opening redfin Website.");
        driver.get(baseURL);
        return this;
    }
    //Go to LoginPage
    public LoginPage goToLoginPage() {
        Log.info("Going to Login Page..");
        click(signInButtonClass);
        return new LoginPage(driver);
    }
}