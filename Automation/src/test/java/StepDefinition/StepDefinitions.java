package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	@Given("User is on login page")
	public void HitUrl()
	{
		System.out.println("Calls Given");
	}
	
	@When("User logs in with Credentials")
	public void Login()
	{
		System.out.println("Calls When");
	}
	
	@Then("Home page is displayed")
	public void ValidateHome()
	{
		System.out.println("Calls Then");
	}
}
