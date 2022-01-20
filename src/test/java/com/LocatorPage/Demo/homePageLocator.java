package com.LocatorPage.Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestUtil.Demo.testBase;

public class homePageLocator extends testBase{
	
	
	public homePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
	public WebElement SigninLink;
	
	@FindBy(how=How.XPATH, using="/html/body/main/section[1]/header/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/a[1]")
	public WebElement SigninButton;
	@FindBy(how=How.ID, using="EmailAddress")
	public WebElement Username;
	@FindBy(how=How.ID, using="Password")
	public WebElement Password;
	@FindBy(how=How.XPATH, using="//button[text()='Sign In']")
	public WebElement LoginButton;
	@FindBy(how=How.XPATH, using="//span[text()='MOHAMMAD']")
	public WebElement VerifyLogin;
	
	@FindBy(how=How.XPATH, using="//input[@class='mh-search-input']")
	public WebElement SearchField;
	@FindBy(how=How.XPATH, using="//button[@class='mh-search-btn mh-search-submit']")
	public WebElement SearchButton;
	@FindBy(how=How.XPATH, using="//*[contains(text(), 'Designed to be the best.')]")
	public WebElement VerifySearchResult;
	
	
	

}
