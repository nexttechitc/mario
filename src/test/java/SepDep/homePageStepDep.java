package SepDep;

import com.ActionPage.Demo.homePageAction;
import com.TestUtil.Demo.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class homePageStepDep extends testBase {
	
	
	homePageAction HomePageAction = new homePageAction();
	
	
	@Given("^launc \"([^\"]*)\"$")
	public void launc(String URL) throws Throwable {
	    getURL(URL);

}
	@Then("^Click on Signin Link$")
	public void click_on_Signin_Link() throws Throwable {
		HomePageAction.ClickonSigninLink();
	}

	@Then("^Click on Signin Button$")
	public void click_on_Signin_Button() throws Throwable {
		HomePageAction.ClickonSigninButton();
	}

	@Then("^Enter UserPass and click login$")
	public void enter_UserPass_and_click_login() throws Throwable {
		HomePageAction.UserCredential(pro.getProperty("username1"), pro.getProperty("password1"));
	}

	@Then("^Verify user login successfully$")
	public void verify_user_login_successfully() throws Throwable {
		HomePageAction.Verifyuserloginsuccessfully();
	}
	@Then("^Type product name$")
	public void type_product_name() throws Throwable {
		HomePageAction.Typeproductname(); 
	}
	@Then("^Click search$")
	public void click_search() throws Throwable {
		HomePageAction.Clicksearch(); 
	}

	@Then("^Verify Search result$")
	public void verify_Search_result() throws Throwable {
		HomePageAction.VerifySearchresult();
	}

	


}
