package com.selldo.Utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ReuseableUtils {

	private  WebDriver driver;
	private final static int waitingTime_Sec = 5;
	
	public ReuseableUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	
	protected WebElement waitUntilVisiblity(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitingTime_Sec));
		wait.until(ExpectedConditions.visibilityOf(we));
		return we;
	}
	protected WebElement waitUntilClickable(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitingTime_Sec));
		wait.until(ExpectedConditions.elementToBeClickable(we));
		return we;
	}
	
	protected void jsClick(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime_Sec));
		wait.until(ExpectedConditions.elementToBeClickable(we));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeAsyncScript("arguments[0].click();", we);
	} 
	
}
