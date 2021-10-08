package testPom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.SearchAnItemToSell;
import testBase.TestBase;

public class TestSearchAnItemToSell extends TestBase {

    SearchAnItemToSell searchBrandInInputBOx;

    @Test (description =  "TC001" , enabled = false)
    public void testsearchBrand() {
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("Gucci");
    }

    @Test (description = "TC002" , enabled = true)
    public void testSearchModel(){
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("2008");
    }

    @Test (description = "TC003", enabled = false)
    public void testSearchOtherDetails() {
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("100% leather jackets");
    }

    @Test(description = "TC004", enabled = false)
    public void testSearchMPN(){
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("GA8977FW");
    }

    @Test(description = "TC005", enabled = false)
    public void testSearchVIN() {
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("WBSVA93528E215014");
    }

    @Test(description = "TC006", enabled = false)
    public void testInvaliddata() {
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("123asj");
    }

    @Test(description = "TC007", enabled = false)
    public void testISBN(){
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("9780810917880");
//        String actualValue = testISBN.get
//        String expectedValue = "Brand : Gucci";
//        Assert.assertEquals(actualValue, expectedValue, "Failed testSearchBrand()");

//        String expTitle = "playstation 5 in Video Games and Consoles | eBay";

//        waitForElementToBeVisible(homepage.searchResultPageElement);
//        scrollJS(1000);
//        Thread.sleep(1000);
//        scrollJS(-500);
//        Thread.sleep(1000);
//        scrollJS(6000);
//        Thread.sleep(1000);

//        Assert.assertEquals(driver.getTitle(), expTitle);
    }
}
