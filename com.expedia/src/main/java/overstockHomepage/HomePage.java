package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BaseAPI{
    @FindBy (xpath = WEB_ELEMENT_SUPPORT_PAGE)
    WebElement supportPage;
    @FindBy(xpath = WEB_ELEMENT_CHAT_BUTTON)
    WebElement chatNowButton;
    @FindBy(xpath = WEB_ELEMENT_FLIGHTS_DROPDOWN)
    WebElement flightsDropdown;
    @FindBy(xpath = WEB_ELEMENT_FLIGHTS_DROPDOWN_SEATS)
    WebElement flightsDropdownSeats;
}
