package testPom;

import org.testng.annotations.Test;
import testBase.SearchAnItemToSell;
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
    }
    @Test(description = "TC008", enabled = false)
    public void testNegativeData(){
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("-97808109178880");

    }
    @Test(description = "TC009", enabled = false)
    public void testNoData(){
        searchBrandInInputBOx = getSearchAnItemToSell();
        searchBrandInInputBOx.search("");

    }
}
