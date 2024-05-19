package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		
	}
	
	public void verifyPantsItems(){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	}
	
	public void verifyShirtsItems(){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	}
	
	public void filterBrand(String brand){
		if(brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		} else {
			System.out.println("Brand not found");
		}
	}
	
	public void verifyBrandItems(String brand){
		if(brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
		} else if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.txtPants.isDisplayed();
		} else {
			System.out.println("Brand not found");
		}
	}
	
	public void filterColor(String color){
		if(color.equals("Black")){
			EbaySearchResultLocatorsObj.cbxColorBlack.click();
		} else if(color.equals("White")){
			EbaySearchResultLocatorsObj.cbxColorWhite.click();
		} else if(color.equals("Tall")){
			EbaySearchResultLocatorsObj.cbxColorTall.click();
		} else {
			System.out.println("Color not found");
		}
	}
	
	public void verifyColorItems(String color){
		if(color.equals("White")){
			EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
		} else if(color.equals("Black")){
			EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		} else if(color.equals("Tall")){
			EbaySearchResultLocatorsObj.txtPants.isDisplayed();
		} else {
			System.out.println("Color not found");
		}
	}
	
	public void selectCottonTee(){
		EbaySearchResultLocatorsObj.linkShirtItems.click();
	}
}