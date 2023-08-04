package org.example.stepsdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Random;

public class RandomDataStepDefs {

    private List<List<String>> dataTable;
    private List<String> randomData;

    @Given("I have a data table")
    public void i_have_a_data_table(DataTable dataTable) {
        this.dataTable = dataTable.asLists();
    }

    @When("I access random data from the table")
    public void i_access_random_data_from_the_table() {
        int rowCount = dataTable.size();
        if (rowCount > 0) {
            int randomIndex = new Random().nextInt(rowCount);
            randomData = dataTable.get(randomIndex);
        }
    }

    @Then("I should see the random data displayed")
    public void i_should_see_the_random_data_displayed() {
        System.out.println("Random Data:");
        for (String value : randomData) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

