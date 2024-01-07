package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberStepDefination {
	@Given("user wants to select car type {string} from uber application")
	public void user_wants_to_select_car_type_from_uber_application(String string) {
	    System.out.println("user wants to select car type {string} from uber application");
	    
	}

	@When("user selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user selects car {string} and pick up point {string} and drop location {string}");
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Driver starts the journey");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    System.out.println("Driver ends the journey");
	}

	@Then("user pay {int} USD")
	public void user_pay_usd(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user pay {int} USD");
	}


}
