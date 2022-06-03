package com.LocatorPage.Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestUtil.Demo.testBase;

public class comAboutPageLocator extends testBase{
	
public comAboutPageLocator() {
		
		PageFactory.initElements(driver, this);// page object model - maven 
		
	}

@FindBy(how=How.XPATH, using="//h5[text()='About us']")
public WebElement AboutusPage;


}
