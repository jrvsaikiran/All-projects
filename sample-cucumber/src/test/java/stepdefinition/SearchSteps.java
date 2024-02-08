package stepdefinition;

import io.cucumber.java.en.*;

public class SearchSteps {
	
	
		
		@Given("I have a search field in amazon")
		public void i_have_a_search_field_in_amazon() {
		  System.out.println("hai");
		}
		
		@When("I search for a product {string}")
		public void i_search_for_a_product(String string) {
			System.out.println("hai");
		}
		
		@Then("The product will displayed.")
		public void the_product_will_displayed() {
			System.out.println("hai");
		}

}
