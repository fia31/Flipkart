package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Methods{
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="")
	private WebElement cancel;

	@FindBy(id="")
	private WebElement username;
	
	@FindBy(id="")
	private WebElement password;
	
	@FindBy(id="")
	private WebElement login;
	
	public WebElement getCancel() {
		return cancel;
	}
	
	public WebElement getUsername(String value) {
		username.sendKeys(value);
		return username;
	}

	public WebElement getPassword(String value) {
		password.sendKeys(value);
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
