package starter.StepDefinitions;

import io.cucumber.java.en.And;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;

public class ContinueStepDefinition {
    InventoryPage inventoryPage;
    CartPage cartPage;

    @And("User already add a different product to cart")
    public void userAlreadyAddADifferentProductToCart() {
        inventoryPage.clickAddToCardSauceLabsBikeLight();
        inventoryPage.clickAddSauceLabsBackpack();
    }

    @And("User click on continue shopping button")
    public void userClickOnContinueShoppingButton() {
        cartPage.clickContinueBtn();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
