package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com/");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Electronics"));

        //Mouse hover actions on an element using Actions Class:
        action.moveToElement(element).build().perform();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Smart Watches")));


        WebElement element2 = driver.findElement(By.linkText("Smart Watches"));
        action.moveToElement(element2);
        //Mouse hover actions on a sub-element using Actions Class:
        action.click().build().perform();

        System.out.println(driver.getCurrentUrl());

        driver.close();

    }
}