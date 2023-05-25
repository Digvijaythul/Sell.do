package com.selldoPOM.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReuseableUtils;

public class ClientLoginPage extends ReuseableUtils{

	public WebDriver driver;
	
	public ClientLoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@class='select2-chosen']")
	private WebElement SelectAClientField;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/div/input")
	private WebElement SelectAClientFieldInput;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li[1]/div")
	private WebElement ClientName;
	@FindBy(how = How.ID, using = "search_clients")
	private WebElement SearchButton;
	@FindBy(how = How.XPATH, using = "//a[@title='Login as client']")
	private WebElement Login;
	@FindBy(how = How.XPATH, using = "//a[text()='Add a Client']")
	private WebElement CreateClientButton;
	@FindBy(how = How.XPATH, using = "//a[@href='/users/logout']")
	private WebElement Logout;
	@FindBy(how = How.XPATH, using = "//a[text()='Clients']")
	private WebElement Clients;
	@FindBy(how = How.CSS, using = "i.fa.fa-ellipsis-v")
	private WebElement ActionBar;
	@FindBy(how = How.CSS, using = "i#user-account-icon")
	private WebElement userAccount;
	
	public void clientLogin(String clientName) {
		waitUntilClickable(SelectAClientField);
		SelectAClientField.click();
		
		waitUntilClickable(SelectAClientFieldInput);
		SelectAClientFieldInput.sendKeys(clientName);
		
		waitUntilClickable(ClientName);
		ClientName.click();
		
		waitUntilClickable(SearchButton);
		SearchButton.click();
		
		Login.click();
	}
	
	public void logout() {
		waitUntilClickable(userAccount);

		userAccount.click();
		waitUntilClickable(Logout);

		Logout.click();
	}
	
}
