package com.ActionPage.Demo;


import org.testng.Assert;

import com.LocatorPage.Demo.comAboutPageLocator;
import com.TestUtil.Demo.testBase;

public class comAboutPageAction extends testBase{
	
	comAboutPageLocator aboutPageLocator = new comAboutPageLocator();
			
			
			
	public void Verifyaboutuspage() throws Exception {
		
		Thread.sleep(10000);
		boolean aboutusPage =aboutPageLocator.AboutusPage.isDisplayed();
		Assert.assertTrue(aboutusPage);
		
		
		
	}
	

}
