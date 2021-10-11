package pom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LaunchChrome {
    public static WebDiver driver;
    public static void main (String[] args){
        System.setProperty("WebDriver.chrome.driver", "resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name=`firstname`]")).sendKeys("Bilal");
        driver.findElement(By.xpath("//input[@name=`lastname`]").sendkeys("Betatache"));
        //click on gender
        driver.findElement(By.id("femaleGender")).click();
        //Enter email id
        driver.findElement(By.id("email")).sendKeys("test@sqengineer.com");
        //select the New York option
        new Select(driver.findElement(By.id("selectBox"))).selectByVisibleText("New York");
        //get the text and print it
        String text = driver.findElement(By.xpath("//*[@id='readText']/b")).getText();
        System.out.println(text);
        //Submit the form
        driver.findElement(By.xpath("//*[@value='Submit']")).click();

        //This sleep time is given so that, You can see the form submission success message
        Thread.sleep(5000);

        driver.close();

    }

}


