package com.LocatorPage.Demo;

import org.openqa.selenium.support.PageFactory;

import com.TestUtil.Demo.testBase;

public class comPageLocator extends testBase{
	
	
public comPageLocator() {
		
		PageFactory.initElements(driver, this);// page object model - maven 
		
	}

}
