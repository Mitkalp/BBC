package stepsDefination;

import Pages_actions.LoginPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import utill.SeleniumDriver;

public class Login_Page_Steps {

    LoginPageAction action;

    @Given("User Launch Chrome browser  and open Url {string}")
    public void user_launch_chrome_browser_and_open_url(String url) {
       // SeleniumDriver.openPage("https://www.bbc.co.uk/sport/football/scores-fixtures");
        SeleniumDriver.openPage(url);


    }

    @When("User clicks on Sign in label")
    public void user_clicks_on_sign_in_label() {
    action=new LoginPageAction();
    action.homePageSignIn();


    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
    action.doLogin(email,password);

    }

    @When("User Enter Sign in button")
    public void user_enter_sign_in_button() {
        action.signInButton();

    }
    @Then("user gets {string} message")
    public void user_gets_message(String error) {

        String passwordErrorText =action.passwordErrorText();
        System.out.println(passwordErrorText);
        String generalErrorText=action.usernameGeneralErrorText();
        System.out.println(generalErrorText);
    }

    @Then(":close browser")
    public void close_browser() {

    }

}
