package TestBase;
import static org.testng.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


    class DropDownListSortedOrNot {
    @Test
    public void dropDownListSortedOrNot() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.ebay.com/");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("gh-cat"));
        element.click();
        List<WebElement> dropDownvalues = element.findElements(By.tagName("option"));
        ArrayList<String> listValues = new ArrayList<String>();
        for(WebElement value : dropDownvalues) {
            System.out.println("values are"+ value.getText());
            listValues.add(value.getText());
        }
        boolean sortedOrNot = sortedOrNot(listValues);
        assertEquals(true, sortedOrNot);
        driver.close();
    }
    public boolean sortedOrNot(ArrayList<String> dropDownValues) {
        System.out.println("number of values "+ dropDownValues.size());
        for(int i=0; i<dropDownValues.size();i++) {
            int temp = dropDownValues.get(i).compareTo(dropDownValues.get(i+1));
            if(temp>1) {
                System.out.println("i value"+i);
                return false;
            }
        }
        return true;
    }
}

public class DropDown {

}
