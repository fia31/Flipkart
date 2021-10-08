package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment extends Methods{
	public Payment() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="")
	private WebElement paymentoptions;
	
	@FindBy(id="")
	private WebElement phonepe;
	
	@FindBy(id="")
	private WebElement con;
	
	@FindBy(id="")
	private WebElement logintophonepe;
	
	@FindBy(id="")
	private WebElement sendotp;
	
	@FindBy(id="")
	private WebElement upiId;
	
	@FindBy(id="")
	private WebElement enterupi;
	
	@FindBy(id="")
	private WebElement payupi;
	
	@FindBy(id="")
	private WebElement paytm;
	
	@FindBy(id="")
	private WebElement paytmnum;
	
	@FindBy(id="")
	private WebElement paytmlink;
	
	@FindBy(id="")
	private WebElement continuepaytm;
	
	@FindBy(id="")
	private WebElement cardnum;
	
	@FindBy(id="")
	private WebElement month;
	
	@FindBy(id="")
	private  WebElement year;
	
	@FindBy(id="")
	private WebElement cvv;
	
	@FindBy(id="")
	private WebElement paycard;
	
	@FindBy(id="")
	private WebElement popularbank;
	
	@FindBy(id="")
	private WebElement selectbank;
	
	@FindBy(id="")
	private WebElement paynetbanking;
	
	public WebElement getPaymentoptions() {
		return paymentoptions;
	}

	public WebElement getPhonepe() {
		return phonepe;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getLogintophonepe(String value) {
		logintophonepe.sendKeys(value);
		return logintophonepe;
	}

	public WebElement getSendotp() {
		return sendotp;
	}

	public WebElement getUpiId() {
		return upiId;
	}

	public WebElement getEnterupi(String value) {
		enterupi.sendKeys(value);
		return enterupi;
	}

	public WebElement getPayupi() {
		return payupi;
	}

	public WebElement getPaytm() {
		return paytm;
	}

	public WebElement getPaytmnum(String value) {
		paytmnum.sendKeys(value);
		return paytmnum;
	}

	public WebElement getPaytmlink() {
		return paytmlink;
	}

	public WebElement getContinuepaytm() {
		return continuepaytm;
	}

	public WebElement getCardnum(String value) {
		cardnum.sendKeys(value);
		return cardnum;
	}

	public WebElement getMonth(String value) {
		Select s = new Select(month);
		s.selectByValue(value);
		return month;
	}

	public WebElement getYear(String value) {
		Select s = new Select(year);
		s.selectByValue(value);
		return year;
	}

	public WebElement getCvv(String value) {
		cvv.sendKeys(value);
		return cvv;
	}
	
	public WebElement getPaycard() {
		return paycard;
	}

	public WebElement getPopularbank() {
		return popularbank;
	}

	public WebElement getSelectbank(String value) {
		Select s = new Select(selectbank);
		s.selectByValue(value);
		return selectbank;
	}

	public WebElement getPaynetbanking() {
		return paynetbanking;
	}
}
