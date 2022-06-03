package SepDep;

import com.ActionPage.Demo.comAboutPageAction;
import com.ActionPage.Demo.homePageAction;
import com.TestUtil.Demo.testBase;

import cucumber.api.java.en.Then;

public class feature2 extends testBase{
	
	homePageAction homeAction = new homePageAction();
	comAboutPageAction aboutPageAction = new comAboutPageAction();
	
	@Then("^Click About US$")
	public void click_About_US() throws Throwable {
		homeAction.ClickAboutUS();
	}

	@Then("^Verify about us page$")
	public void verify_about_us_page() throws Throwable {
		aboutPageAction.Verifyaboutuspage();
	}



}
