package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends Methods{
	public Search() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="")
	private WebElement searchbox;
	
	@FindBy(id="")
	private WebElement enter;
	
	@FindBy(id="")
	private WebElement proselect;

	public WebElement getSearchbox(String value) {
		searchbox.sendKeys(value);
		return searchbox;
	}

	public WebElement getEnter() {
		return enter;
	}

	public WebElement getProselect() {
		return proselect;
	}
}
