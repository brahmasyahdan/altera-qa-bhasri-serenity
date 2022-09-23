package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageObject {
    @Managed
    WebDriver driver=getDriver();

    public String getUrl() {return driver.getCurrentUrl();}
    //Remove BTN
    private final By removeBtnRedTshirt= By.id("remove-test.allthethings()-t-shirt-(red)");
    public void clickRemoveBtnRedTshirt(){driver.findElement(removeBtnRedTshirt).click();}

    //Item should be removed from cart
    private final By cartBadge=By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    public String getCartBadge(){return driver.findElement(cartBadge).getText();}


    //User click on continue shopping button
    private final By continueBtn=By.id("continue-shopping");
    public void clickContinueBtn(){driver.findElement(continueBtn).click();}
}
