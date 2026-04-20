package stepdefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SearchPage;

public class SearchSteps {

    HomePage home = new HomePage();
    SearchPage search = new SearchPage();

    @Given("user is on homepage")
    public void user_on_homepage() {
        home.openHomePage();
    }

    @When("user searches for {string}")
    public void search_product(String product) {
        search.search(product);
    }

    @Then("results should be displayed")
    public void results_should_be_displayed() {
        System.out.println("Results displayed");
    }
}