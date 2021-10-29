package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class HomeSteps {
    @Given("^I am navigated to Expedia$")
    public void navigateToExpedia(){
        System.out.println("navigateToExpedia");
    }
    @When("^I choose Hotel Booking tab$")
    public void chooseHotelBookingTab(){
        System.out.println("I Choose Hotel Tab");
    }
    @And("^I provide Hotel Booking Information$")
    public void provideHotelBookingInformation(){
        System.out.println("Provide Hotel Booking Information");
    }
}
