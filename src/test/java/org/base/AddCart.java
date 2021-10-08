package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart extends Methods{
	public AddCart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="")
	private WebElement addcart;
	
	@FindBy(id="")
	private WebElement placeorder;

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}
}
