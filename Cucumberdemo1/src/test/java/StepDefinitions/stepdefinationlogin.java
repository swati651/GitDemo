
package StepDefinitions;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinationlogin 
{
	 @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
		 System.out.println("Validate the browser");
	 }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	       System.out.println("Browser is triggered");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("check if browser is started");
	    }
	 @Given("^user is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	       System.out.println("user is on NetBanking landing page");
	    }
	@When("^user login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Navigated to populated URL");
	}

	@And("^cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are_something(String strArg1) throws Throwable {
		System.out.println("cards are displayed");
	}
	@When("^user signup with below details$")
	public void user_signup_with_below_details(DataTable data) throws Throwable 
	{

       List<List<String>> rows = data.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
		System.out.println(rows.get(0).get(2));
    }
	 @When("^user login in to application with (.+) and (.+)$")
	    public void user_login_in_to_application_with_and(String username, String password) throws Throwable {
	       System.out.println(username);
	       System.out.println(password);
	    }

}
