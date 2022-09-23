package starter.StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;

public class SearchDefinition {
    InventoryPage inventoryPage;
    @And("User already add a product to cart")
        public void UserAlreadyAddAProductToCart(){
            inventoryPage.clickAddToCartSauce();
            inventoryPage.clickAddToCartRedThirt();
    }
    @When("User click sorting field")
        public void UserClickSortingField(){
            inventoryPage.clickSortContainer();
    }
    @And("User click Name Z to A")
        public void UserClickNameZToA(){
            inventoryPage.isSortContainerClick();
    }
    @Then("Product should be sorted by name Z to A")
        public void ProductShouldBeSortedByNameZToA(){
            inventoryPage.shortedByNameZtoAVisible();
    }
}
