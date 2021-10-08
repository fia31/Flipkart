package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Address extends Methods{
	Methods m = new Methods();
	
	public Address() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="")
	private WebElement addAddress;
	
	@FindBy(id="")
	private WebElement newaddress;
	
	@FindBy(id="")
	private WebElement currentlocation;
	
	@FindBy(id="")
	private WebElement name;
	
	@FindBy(id="")
	private WebElement mobilenumber;
	
	@FindBy(id="")
	private WebElement pincode;
	
	@FindBy(id="")
	private WebElement locality;
	
	@FindBy(id="")
	private WebElement address;
	
	@FindBy(id="")
	private WebElement city;
	
	@FindBy(id="")
	private WebElement state;
	
	@FindBy(id="")
	private WebElement landmark;
	
	@FindBy(id="")
	private WebElement alternatenumber;
	
	@FindBy(id="")
	private WebElement addresstype;
	
	@FindBy(id="")
	private WebElement deliverhere;
	
	@FindBy(id="")
	private WebElement time;
	
	@FindBy(id="")
	private WebElement contin;
	
	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getNewaddress() {
		return newaddress;
	}

	public WebElement getCurrentlocation() {
		return currentlocation;
	}

	public WebElement getName(String value) {
		name.sendKeys(value);
		return name;
	}

	public WebElement getMobilenumber(String value) {
		mobilenumber.sendKeys(value);
		return mobilenumber;
	}

	public WebElement getPincode(String value) {
		pincode.sendKeys(value);
		return pincode;
	}

	public WebElement getLocality(String value) {
		locality.sendKeys(value);
		return locality;
	}

	public WebElement getAddress(String value) {
		address.sendKeys(value);
		return address;
	}

	public WebElement getCity(String value) {
		city.sendKeys(value);
		return city;
	}

	public WebElement getState(String text) {
		Select s = new Select(state);
		s.selectByVisibleText(text);
		return state;
	}

	public WebElement getLandmark(String value) {
		landmark.sendKeys(value);
		return landmark;
	}

	public WebElement getAlternatenumber(String value) {
		alternatenumber.sendKeys(value);
		return alternatenumber;
	}

	public WebElement getAddresstype() {
		return addresstype;
	}

	public WebElement getDeliverhere() {
		return deliverhere;
	}
	
	public WebElement getTime() {
		return time;
	}

	public WebElement getContin() {
		return contin;
	}
	
}
