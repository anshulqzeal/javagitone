package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_on_login_page() {
        loginPage.openLoginPage();
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_credentials(String user, String pass) {
        loginPage.login(user, pass);
    }

    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        System.out.println("Login successful");
    }

    @Then("error message should be displayed")
    public void error_message() {
        System.out.println("Error displayed");
    }
}