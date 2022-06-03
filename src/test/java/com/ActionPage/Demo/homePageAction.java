package com.ActionPage.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.LocatorPage.Demo.homePageLocator;
import com.TestUtil.Demo.testBase;
import com.TestUtil.Demo.testdata;

public class homePageAction extends testBase {
	
	
	homePageLocator homelocator = new homePageLocator();
	
	public void UserCard(String u, String p) throws Exception {
		
		homelocator.UserName.sendKeys(u);
		homelocator.Password.sendKeys(p);
		homelocator.LoginButton.click();
		
		Thread.sleep(5000);
		testdata.takescreenshot(driver, "Login Page");
	}
	public void Clicklogin() {
		
		homelocator.LoginLink.click();
		
	}
	public void ClickSamsung6hyperlinkandaddtocart() throws Exception {
		//homelocator.SamsungHyperLink.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",homelocator.SamsungHyperLink);
		homelocator.AddToCArt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		testdata.takescreenshot(driver, "Product Page");
		
	}
	public void ClickCart() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",homelocator.CART);
		
		
		//homelocator.CART.click();
	}
	public void VerifySamsung6addedincart () {
		boolean result = homelocator.VerifySamsung6Phone.isDisplayed();
		Assert.assertTrue(result);
		testdata.takescreenshot(driver, "Verfy Cart");
		
	}
	public void ClickAboutUS() {
		
		
		homelocator.AboutUSLink.click();
		
	}
	
	
	
	
	
	
}
