package testBase;

import base.BaseClass;
import pom.Cars;

public class TestBase extends BaseClass {
    public Cars getHomepage(){
        return new Cars();
    }
}
