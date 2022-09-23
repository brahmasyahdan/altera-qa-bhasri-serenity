package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends PageObject {
    @Managed
    WebDriver driver=getDriver();
    private final By headerTitle=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By cartIcon=By.cssSelector("#shopping_cart_container > a");
    public String getUrl() {return driver.getCurrentUrl();}
    public String getHeaderTitle(){
        return  driver.findElement(headerTitle).getText();
    }
    public Boolean isCartVisible(){
        return driver.findElement(cartIcon).isDisplayed();
    }
    //PreCondition Add to Product
    private final By addToCardSauce =By.id("add-to-cart-sauce-labs-onesie");
    public void clickAddToCartSauce(){driver.findElement(addToCardSauce).click();}

    private final By addToCardRedThirt=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    public void clickAddToCartRedThirt(){driver.findElement(addToCardRedThirt).click();}

    //click SortContainer
    private final By sortContainer=By.className("product_sort_container");
    public void clickSortContainer(){driver.findElement(sortContainer).click();}

    //Name Z to A
    private final By choseSortContainer=By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]");
    public void isSortContainerClick(){driver.findElement(choseSortContainer).click();}

    //Product should be sorted by name Z to A
    private final By shortedByNameZtoA=By.xpath("//*[@id=\"item_3_title_link\"]/div");
    public Boolean shortedByNameZtoAVisible(){
        return driver.findElement(shortedByNameZtoA).isDisplayed();
    }

    //userClickedCartIcon
    private final By cartCliked=By.id("shopping_cart_container");
    public void getCartCliked(){driver.findElement(cartCliked).click();}

    //User already add a different product to cart
    private final By addToCardSauceLabsBikeLight=By.id("add-to-cart-sauce-labs-bike-light");
    public void clickAddToCardSauceLabsBikeLight(){driver.findElement(addToCardSauceLabsBikeLight).click();}
    private final By addSauceLabsBackpack=By.id("add-to-cart-sauce-labs-backpack");
    public void clickAddSauceLabsBackpack(){driver.findElement(addSauceLabsBackpack).click();}
}
