package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/AmazonSearch.feature"},
		 glue = {"StepDefinations"},
		// tags = "@smoke or @prod",
		 plugin = {"pretty"}
		
		)

public class AmazonSearchPage {

}
