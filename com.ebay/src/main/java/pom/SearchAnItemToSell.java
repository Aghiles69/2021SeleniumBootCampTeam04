    package pom;

    import base.BaseClass;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;
    import org.openqa.selenium.support.ui.ExpectedConditions;

    public class SearchAnItemToSell extends BaseClass
    {

        public SearchAnItemToSell() {
            PageFactory.initElements(driver, this);
        }

        @FindBy (css = "#gh-p-2 > a")
        public WebElement sellButton;

//        @FindBy (css = "select#gh-cat")
//        public WebElement categoryDropdown;

        @FindBy (css = "#image_banner_1 > div > div > a")
        public WebElement listAnItemButton;

        @FindBy (css = "#s0-0-0-30-9-keyword-box-input-textbox")
        public WebElement listItemInputBox;

        public void search(String searchTerm) {
            clicksellButton();
            clicklistAnItemButton();
            sendKeysTolistItemInputBox(searchTerm);
//            selectSearchCategory(category);
        }

        private void clicksellButton() {clickJScript(sellButton);
        }

        private void clicklistAnItemButton() {
            clickJScript(listAnItemButton);
        }

//        private void selectSearchCategory(String category) {
//            dropdownSelectByVisibleText(categoryDropdown, category);
//        }

        private void sendKeysTolistItemInputBox(String keys) {
            sendKeysToInput(listItemInputBox, keys);
        }
        public String getText(WebElement element) {
            WebElement Text = explicitWait.until(ExpectedConditions.visibilityOf(element));
            return Text.getText();
        }

        public void bypassCaptcha() {
            driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
        }
    }
