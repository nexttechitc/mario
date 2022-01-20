package com.ActionPage.Demo;

import org.testng.Assert;

import com.LocatorPage.Demo.homePageLocator;
import com.TestUtil.Demo.testBase;
import com.TestUtil.Demo.testData;
import com.TestUtil.Demo.utiliti;

public class homePageAction extends testBase{
	
	homePageLocator HomePageLocator = new homePageLocator();
	
	public void ClickonSigninLink() {
		HomePageLocator.SigninLink.click();
		
		
	}
	public void ClickonSigninButton() throws Exception {
		//Thread.sleep(5000);
		HomePageLocator.SigninButton.click();
		
	}
	
	public void UserCredential(String u, String p) {
		HomePageLocator.Username.sendKeys(u);
		HomePageLocator.Password.sendKeys(p);
		HomePageLocator.LoginButton.click();
		
		
		
	}
	public void Verifyuserloginsuccessfully() {
		
		boolean verifyresult = HomePageLocator.VerifyLogin.isDisplayed();
		Assert.assertTrue(verifyresult);
		utiliti.takescreenshot(driver, "ProfilePage");
	}
	public void Typeproductname() {
		HomePageLocator.SearchField.sendKeys(testData.product1);
		
	}
	public void Clicksearch() {
		HomePageLocator.SearchButton.click();
		
		
	}
	public void VerifySearchresult() {
		boolean verifySearchresult = HomePageLocator.VerifySearchResult.isDisplayed();
		Assert.assertTrue(verifySearchresult);
		utiliti.takescreenshot(driver, "SearchPage");
		
	}

}
