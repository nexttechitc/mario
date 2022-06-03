package SepDep;




import com.ActionPage.Demo.homePageAction;
import com.TestUtil.Demo.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class loginDep extends testBase {
	
	homePageAction homeAction = new homePageAction();
	
	@Given("^launch \"([^\"]*)\"$")
	public void launc(String URL) throws Throwable {
	    getURL(URL);
	 

}
	@Then("^Click login$")
	public void click_login() throws Throwable {
		homeAction.Clicklogin();	
	}

	@Then("^Enter username and password and click login$")
	public void enter_username_and_password_and_click_login() throws Throwable {
		homeAction.UserCard(pro.getProperty("username1"),pro.getProperty("password1") );
		
		
	}

	@Then("^Click Samsung(\\d+) hyperlink and add to cart$")
	public void click_Samsung_hyperlink_and_add_to_cart(int arg1) throws Throwable {
		homeAction.ClickSamsung6hyperlinkandaddtocart();
	}

	@Then("^Click Cart$")
	public void click_Cart() throws Throwable {
	homeAction.ClickCart();
	
	}

	@Then("^Verify Samsung(\\d+) added in cart$")
	public void verify_Samsung_added_in_cart(int arg1) throws Throwable {
		homeAction.VerifySamsung6addedincart();
	    
	}
	
	
}
