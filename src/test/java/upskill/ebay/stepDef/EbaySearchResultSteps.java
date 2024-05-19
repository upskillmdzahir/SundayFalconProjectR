package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShoesItems();
	}
	
	@Then("^Item list should have only Shirts related products$")
	public void item_list_should_have_only_Shirts_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShirtsItems();
	}
	
	@Then("^Item list should have only Pants related products$")
	public void item_list_should_have_only_Pants_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyPantsItems();
	}
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionsObj.filterBrand(brand);
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchResultActionsObj.verifyBrandItems(brand);
	}
	
	@When("^Specific color of \"([^\"]*)\"$")
	public void specific_color_of(String color) throws Throwable {
		EbaySearchResultActionsObj.filterColor(color);
	}

	@Then("^Item list should have \"([^\"]*)\"$")
	public void item_list_should_have(String color) throws Throwable {
		EbaySearchResultActionsObj.verifyColorItems(color);
	}
	
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.selectCottonTee();
	}
}