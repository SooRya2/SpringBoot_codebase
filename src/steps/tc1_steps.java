package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc1_steps 
{
	
	@Given("the user is in the home page")
	public void the_user_is_in_the_home_page()
	{
		System.out.println("User is in the home page");
	}
	@When("he enters the valid details and submits")
	public void he_enters_the_valid_details_and_submits() 
	{
		System.out.println("He enters valid details");
	}
	@Then("the system navigates to home page")
	public void the_system_navigates_to_home_page() {
	    System.out.println("He reaches the home page");
	}
	}
	
	


