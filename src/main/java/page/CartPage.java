package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By nameField = By.id("name");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
 //   public String getTitle(){
 //      return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
 //   }
    public void clickPlaceOrder(){
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
    }
}
