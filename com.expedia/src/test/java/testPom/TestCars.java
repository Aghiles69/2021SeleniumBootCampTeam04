package testPom;
import org.testng.annotations.Test;
import testBase.Cars;
import testBase.TestBase;

public class TestCars extends TestBase {

    Cars cars;

    @Test (description = "TC001" , enabled = true)
    public void testSearchCarsWithoutPickingDateAndTime() {
        cars = getHomepage();
        cars.searchCarsWithoutPickingDateAndTime();
    }

    @Test (description = "TC002" , enabled = false)
    public void testSearchcarswithDate (){
        cars = getHomepage();
        cars.searchcarswithDate();
    }
    @Test (description = "TC003", enabled = false)
    public void testSearchcarsWithTime(){
        cars = getHomepage();
        cars.searchcarsWithTime();
    }
    @Test (description = "TC004", enabled = false)
    public void testSearchcarsForAARPMembers(){
        cars = getHomepage();
        cars.searchcarsForAARPMembers();
    }
    @Test (description = "TC005", enabled = false)
    public void testSearchcarsWithInvalidData(){
        cars = getHomepage();
        cars.searchcarsWithInvalidData();
    }
    @Test(description = "TC006", enabled = false)
    public void testPickPrefferedBrand(){
        cars = getHomepage();
        cars.pickPrefferedBrand();
    }
}
