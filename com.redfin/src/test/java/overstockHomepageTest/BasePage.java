package TestBase;

public class BasePage {


    public WebDriver     driver;
    public WebDriverWait wait;
    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    //Click Method
    public void click(By by) {
        waitVisibility(by).click();
    }
    //Write Text
    public void writeText(By by, String text) {
        waitVisibility(by).sendKeys(text);
    }
    //Read Text
    public String readText(By by) {
        return waitVisibility(by).getText();
    }
    //Wait
    public WebElement waitVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}