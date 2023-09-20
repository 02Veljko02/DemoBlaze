package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.CartPage;
import page.HomePage;

public class Navigator {
    private WebDriver driver;
    public Navigator(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage returnToHomePage(){
        driver.findElement(By.linkText("home")).click();
        return new HomePage(driver);
    }
    public CartPage clickCart(){
        driver.findElement(By.id("cartur")).click();
        return new CartPage(driver);
    }
}
