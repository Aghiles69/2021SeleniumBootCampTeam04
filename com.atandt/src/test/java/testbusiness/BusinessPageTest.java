package testcoverage;

import common.WebAPI;
import coverage.CoveragePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CoveragePageTest extends WebAPI {
   static CoveragePage covtest ;

   public void initElement(){
     covtest = PageFactory.initElements(driver,CoveragePage.class);
   }


   @Test(priority = 1)
   public void testCoverage(){
       initElement();
       covtest.validateCov(); }

   @Test(priority = 2)
   public void testCheckBusiness(){
       initElement();
       covtest.checkBusinessPanel(); }

   @Test(priority = 3)
    public void testCheckWireless(){
       initElement();
       covtest.checkWirelessPanel(); }

    @Test(priority = 4)
    public void testCheckTv(){
       initElement();
       covtest.checkTvPanel(); }

    @Test(priority = 5)
    public void testCheckBank(){
       initElement();
       covtest.checkBankPanel(); }

    @Test(priority = 6)
    public void testCheckprPaid(){
       initElement();
       covtest.checkprPaidPanel(); }

    @Test(priority = 7)
    public void testCheckCart(){
       initElement();
       covtest.checkCart(); }

    @Test(priority = 8)
    public void testCheckSearchIcon(){
       initElement();
       covtest.checkSearchIcon(); }

    @Test(priority = 9)
   public void testTmobileLogo(){
       initElement();
       covtest.checkTmobileLogo(); }

   @Test(priority = 10)
   public void testFindStoreLink(){
       initElement();
       covtest.checkFindStore(); }

   @Test(priority = 11)
   public void testPhoneDevice(){
       initElement();
       covtest.checkPhoneDevice(); }

   @Test(priority = 12)
   public void testPhones(){
       initElement();
       covtest.checkPhones(); }

   @Test(priority = 13)
   public void testTablets(){
       initElement();
       covtest.checkTablets(); }

   @Test(priority = 14)
    public void testDataPass(){
       initElement();
       covtest.checkDataPass(); }

    @Test(priority = 15)
    public void testPayMyBill(){
       initElement();
       covtest.checkPayMyBill();}

    @Test(priority = 16)
    public void testOurStory(){
       initElement();
       covtest.checkOurStory(); }

    @Test(priority = 17)
    public void testContactUs(){
       initElement();
       covtest.checkContactUs(); }



}
