package stepsDefination;

import Pages_actions.SearchPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utill.SeleniumDriver;

public class SearchSteps {
    SearchPageAction action;

    @Given("go to \"\"https:\\/\\/www.bbc.co.uk\\/sport\\/football\\/scores-fixtures\"\"")
    public void go_to_https_www_bbc_co_uk_sport_football_scores_fixtures() {
        SeleniumDriver.openPage("https://www.bbc.co.uk/sport/football/scores-fixtures");

    }

    @Given("enter {string} Search text box")
    public void enter_search_text_box(String string) {
        action=new SearchPageAction();
        String title= action.getPageTitle();
        System.out.println("Home page title is :"+ title);
        Assert.assertEquals(title,"Scores & Fixtures - Football - BBC Sport");

    }



    @When("click on search button")
    public void click_on_search_button() {
        action.search();


    }

    @Then("redirect to related page")
    public void redirect_to_related_page() {

        action.getAllLinks();

    }


}
