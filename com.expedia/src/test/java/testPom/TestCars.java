package testPom;
import org.testng.annotations.Test;
import pom.Cars;
import testBase.TestBase;

public class TestCars extends TestBase {

    Cars cars;

    @Test (description = "TC001" , enabled = false)
    public void searchCarsWithoutPickingDateAndTime() {
        cars = getHomepage();
        cars.searchCarsWithoutPickingDateAndTime();
    }

    @Test (description = "TC002" , enabled = true)
    public void searchcarswithDate (){
        cars = getHomepage();
        cars.searchcarswithDate();
    }
    @Test (description = "TC003", enabled = false)
    public void searchcarsWithTime(){
        cars = getHomepage();
        cars.searchcarsWithTime();
    }
    @Test (description = "TC004", enabled = false)
    public void searchcarsForAARPMembers(){
        cars = getHomepage();
        cars.searchcarsForAARPMembers();
    }
    @Test (description = "TC005", enabled = false)
    public void searchcarsWithInvalidData(){
        cars = getHomepage();
        cars.searchcarsWithInvalidData();
    }
    @Test(description = "TC006", enabled = false)
    public void pickPrefferedBrand(){
        cars = getHomepage();
        cars.pickPrefferedBrand();
    }
}
