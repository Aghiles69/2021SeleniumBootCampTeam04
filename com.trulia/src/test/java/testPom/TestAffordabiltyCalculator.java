package testPom;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.AffordablityCalculator;

public class TestAffordabiltyCalculator extends BaseClass {
    public AffordablityCalculator affordablityCalculator = new AffordablityCalculator();

    @Test(description = "TC001", enabled = false)
    public void affordabilityCalculatorPage(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.affordabilityCalculatorPage();
        String actualText = affordablityCalculator.affordabilityCalculatorPageTitle.getText();
        String expectedText = "How much house can I afford?";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC002", enabled = false)
    public void annualIncomeInputBoxValidInt(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.annualIncomeInputBoxValidInt("75000");
        String actualText = affordablityCalculator.estimatePriceValueText.getText();
        String expectedText = "$306,558";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC003", enabled = false)
    public void annualIncomeInputBoxInvalidInt(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.annualIncomeInputBoxInvalidInt("abc");
        String actualText = affordablityCalculator.incomeInputBoxErrorMessage.getText();
        String expectedText = "Annual household income is a required field";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC004", enabled = false)
    public void annualIncomeInputBoxNegativeInt(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.annualIncomeInputBoxNegativeInt("-50000");
        String actualText = affordablityCalculator.incomeInputBoxErrorMessage.getText();
        String expectedText = "Value must be greater than or equal to 0";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC005", enabled = false)
    public void annualIncomeInputBoxNoData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.annualIncomeInputBoxNoData("");
        String actualText = affordablityCalculator.incomeInputBoxErrorMessage.getText();
        String expectedText = "Annual household income is a required field";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC006", enabled = false)
    public void downPaymentInputBoxValidData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.downPaymentInputBoxValidData("40000");
        String actualText = affordablityCalculator.estimatePriceValueText.getText();
        String expectedText = "$286,942";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC007", enabled = false)
    public void downPaymentInputBoxInvalidData() {
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.downPaymentInputBoxInvalidData("abc");
        String actualText = affordablityCalculator.downPaymentErrorMessage.getText();
        String expectedText = "Down payment is a required field";
        Assert.assertEquals(actualText, expectedText);
    }
    @Test(description = "TC008", enabled = false)
    public void downPaymentInputBoxNegativeData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.downPaymentInputBoxNegativeData("-50000");
        String actualText = affordablityCalculator.downPaymentErrorMessage.getText();
        String expectedText = "Value must be greater than or equal to 0";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC009", enabled = false)
    public void downPaymentInputBoxNoData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.downPaymentInputBoxNoData("");
        String actualText = affordablityCalculator.incomeInputBoxErrorMessage.getText();
        String expectedText = "Down payment is a required field";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC010", enabled = false)
    public void monthlyDebtsInputBoxWithValidData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.monthlyDebtsInputBoxWithValidData("4000");
        String actualText = affordablityCalculator.estimatePriceValueText.getText();
        String expectedText = "$149,600";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC011", enabled = false)
    public void monthlyDebtsInputBoxWithInvalidData() {
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.monthlyDebtsInputBoxWithInvalidData("abc");
        String actualText = affordablityCalculator.monthlyDebtsErrorMessage.getText();
        String expectedText = "Monthly debts is a required field";
        Assert.assertEquals(actualText, expectedText);
    }
    @Test(description = "TC012", enabled = false)
    public void monthlyDebtsInputBoxWithNegativeData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.monthlyDebtsInputBoxWithNegativeData("-5000");
        String actualText = affordablityCalculator.monthlyDebtsErrorMessage.getText();
        String expectedText = "Value must be greater than or equal to 0";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(description = "TC013", enabled = false)
    public void monthlyDebtsInputBoxWithNoData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.monthlyDebtsInputBoxWithNoData("");
        String actualText = affordablityCalculator.monthlyDebtsErrorMessage.getText();
        String expectedText = "Monthly debts is a required field";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test (description = "TC014", enabled = false)
    public void whereAreYouBuyingInputBoxCity(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.whereAreYouBuyingInputBoxCity("New York");
    }
    @Test(description = "TC015", enabled = false)
    public void whereAreYouBuyingInputBoxInvalidCity(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.whereAreYouBuyingInputBoxInvalidCity("china");
    }
    @Test(description = "TC016",enabled = false)
    public void whereAreYouBuyingInputBoxNoData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.whereAreYouBuyingInputBoxNoData("");
    }
    @Test(description = "TC017",enabled = false)
    public void whereAreYouBuyingInputBoxNeighborhood(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.whereAreYouBuyingInputBoxNeighborhood("garden city");
    }
    @Test(description = "TC018",enabled = false)
    public void whereAreYouBuyingInputBoxInvalidNeighborhood(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.whereAreYouBuyingInputBoxInvalidNeighborhood("USA");
    }
    @Test(description = "TC019",enabled = false)
    public void whereAreYouBuyingInputBoxZip(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.whereAreYouBuyingInputBoxZip("11101");
    }
    @Test(description = "TC020",enabled = false)
    public void whereAreYouBuyingInputBoxInvalidZip(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.whereAreYouBuyingInputBoxInvalidZip("abc");
    }
    @Test(description = "TC021",enabled = false)
    public void whereAreYouBuyingInputBoxInvalidData(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.whereAreYouBuyingInputBoxInvalidData(" ");
    }
    @Test(description = "TC022", enabled = true)
    public void slideIt(){
        affordablityCalculator = new AffordablityCalculator();
        affordablityCalculator.moveSlider();
    }
}
