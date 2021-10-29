package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class SearchResultStep {
   @Then("^I should be able to view list of Hotel search result$")
    public void listOfHotelResults(){

       System.out.println("List of Hotels");
    }
}
