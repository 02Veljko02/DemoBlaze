package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAddToCartButton(){
        driver.findElement(By.linkText("Add to cart")).click();
    }
    public String getAlertText(){
       return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
