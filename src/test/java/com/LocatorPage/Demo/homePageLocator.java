package com.LocatorPage.Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestUtil.Demo.testBase;

public class homePageLocator extends testBase{
	
public homePageLocator() {
		
		PageFactory.initElements(driver, this);// page object model - maven 
		
	}

@FindBy(how=How.ID, using="loginusername")
public WebElement UserName;

@FindBy(how=How.ID, using="loginpassword")
public WebElement Password;

@FindBy(how=How.XPATH, using="//button[text()='Log in']")
public WebElement LoginButton;

@FindBy(how=How.ID, using="login2")
public WebElement LoginLink;

@FindBy(how=How.XPATH, using="//a[text()='Samsung galaxy s6']")
public WebElement SamsungHyperLink;

@FindBy(how=How.XPATH, using="//a[text()='Add to cart']")
public WebElement AddToCArt;

@FindBy(how=How.XPATH, using="//a[text()='Cart']")
public WebElement CART;

@FindBy(how=How.XPATH, using="//td[text()='Samsung galaxy s6']")
public WebElement VerifySamsung6Phone;

@FindBy(how=How.XPATH, using="//a[text()='About us']")
public WebElement AboutUSLink;
	
	
	

}
