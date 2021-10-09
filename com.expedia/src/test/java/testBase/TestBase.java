package testBase;

import base.BaseClass;
import org.jsoup.Connection;

public class TestBase extends BaseClass {
    public Cars getHomepage(){
        return new Cars();
    }
}