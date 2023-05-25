package com.selldoPOM.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReuseableUtils;

public class LoginPage extends ReuseableUtils{

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "#user_email")
	private WebElement Email;
	@FindBy(how = How.CSS, using = "#user_password")
	private WebElement Password;
	@FindBy(how = How.CSS, using = ".btn.btn-primary")
	private WebElement SignIn;
	
	public void login(String userName,String password) {
		waitUntilVisiblity(Email).sendKeys(userName);
		waitUntilVisiblity(Password).sendKeys(password);
		waitUntilClickable(SignIn).click();
	}
	
}
