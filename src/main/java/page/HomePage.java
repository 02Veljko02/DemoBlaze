package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPage clickProductByName(String productName){
       driver.findElement(By.linkText(productName)).click();
       return new ProductPage(driver);
    }
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
