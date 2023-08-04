package org.example.stepsdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Collections;
import java.util.List;

public class PractiseStepDefs {

    @Given("User Enters Valid UserName as {string} and Password {string}")
    public void user_enters_valid_user_name_as_and_password(String string, String string2) {
        System.out.println(string);
        System.out.println(string2);
    }
    @When("User is clicked on Signin button")
    public void user_is_clicked_on_signin_button() {
        System.out.println("Signin button");

    }
    @Then("User should be signin successfully")
    public void user_should_be_signin_successfully() {
        System.out.println("Successfull");
    }

    @Given("User is on Home page")
    public void user_is_on_home_page() {
        System.out.println("User is on Home Page");
    }
    @When("User is enters following details")
    public void user_is_enters_following_details(DataTable dataTable) {

        List<List<String>> obj= Collections.singletonList(dataTable.asList());
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
        System.out.println(obj.get(0).get(5));
        System.out.println(obj.get(0).get(6));


    }
    @When("Clicks on signup button")
    public void clicks_on_signup_button() {
        System.out.println("And Clicks on SignUp button");
    }


}
