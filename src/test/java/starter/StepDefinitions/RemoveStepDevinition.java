package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;


import static org.junit.Assert.*;//fungsi assert

public class RemoveStepDevinition {
    InventoryPage inventoryPage;
    CartPage cartPage;


    @And("User Already have two items in chart")
    public void userAlreadyHaveTwoItemsInChart() {
        inventoryPage.clickAddToCartSauce();
        inventoryPage.clickAddToCartRedThirt();
    }

    @When("User clicked Cart icon")
    public void userClickedCartIcon() {
        inventoryPage.getCartCliked();

    }

    @And("Directed to Cart Page")
    public void directedToCartPage() {
        assertEquals("https://www.saucedemo.com/cart.html",cartPage.getUrl());

    }

    @And("User clicked Remove Button for one of the items")
    public void userClickedRemoveButtonForOneOfTheItems() {
        cartPage.clickRemoveBtnRedTshirt();
    }

    @Then("Item should be removed from cart")
    public void itemShouldBeRemovedFromCart() {
        assertEquals("1",cartPage.getCartBadge());
    }
}
