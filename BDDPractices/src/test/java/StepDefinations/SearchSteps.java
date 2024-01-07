package StepDefinations;



import org.junit.Assert;

import AmazonImplemention.Product;
import AmazonImplemention.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	Product product;
	Search search;
	
	@Given("I have search field on Amazon Page")
	public void i_have_search_field_on_amazon_page() {
	    System.out.println("Step 1: I have search field on Amazon Page");
	   
	}

	@When("I search for product with name {string} and price {int}")
	public void i_search_for_product_with_name_and_price(String ProductName, Integer Price) {
	    System.out.println("Step 2: I search for product with name "+ ProductName+ " and "+Price+"");
	    product=new Product(ProductName,Price);
	    
	}

	@Then("Product name {string} Should be Display")
	public void product_name_should_be_display(String ProductName) {
	   System.out.println("Step 3: Product name " +ProductName+ " Should be Display");
	   search =new Search();
	   String name=search.dispalyproduct(product);
	   Assert.assertEquals(name, ProductName);
	   
	   
	}

}
