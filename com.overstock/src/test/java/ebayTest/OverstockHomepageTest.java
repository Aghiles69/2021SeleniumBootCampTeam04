package overstockHomepageTest;

import overstockHomepage.OverstockHomepage;

public class OverstockHomepageTest extends BaseAPI {
    OverstockHomepage overstockHomepage;
    @Test
    public void testNavToStoresPage(){
        overstockHomepage = new OverstockHomepage();
        overstockHomepage.clickOnStoreButton();
    }
    @Test public void testNavToStorePageOutdoor(){
        overstockHomepage = new OverstockHomepage();
        overstockHomepage.clickOnStoreButtonOutdoor();

    }
    @Test public void testNavToOutdoorDecor(){
        overstockHomepage = new OverstockHomepage();
        overstockHomepage.clickOnOutdoorButton();
        overstockHomepage.clickOnOutdoorDecorButton();
        Thread.sleep(5000);
    }

}
