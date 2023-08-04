Feature
  Background
  Scenario
  Given
  When
  Then
  And
  But
  Scenario Outline
    Examples


#Feature:
#  The file should have extension .
#  feature and each feature file should have only one feature.
#  The feature keyword being with the Feature: and after that add,
#  a space and name of the feature will be written.
#
#  Scenario
#  Each feature file may have multiple scenarios,
#  and each scenario starts with Scenario:
#  followed by scenario name.
#
#  Background  keyword helps you to add some context to the scenario.
#  It can contain some steps of the scenario,
#  but the only difference is that it should be run before each scenario.
#
#  Given
#  The use of Given keyword is to put the system in a familiar state before the user starts
#  interacting with the system.However, you can omit writing user
#  interactions in Given steps if Given in the “Precondition” step.

#    Then:
#  The use of ‘then’ keyword is to see the outcome after the action in when step.
#  However, you can only verify noticeable changes.

#    And & But
#  You may have multiple given when or Then.
#
#  Syntax:
#
#  But
#  A But - additional test step which defines the 'action' 'outcome.'
#    But I should see "Welcome Tom."
#    And - additional test step that defines the 'action' performed
#    And I write  "EmailAddress" with "Tomjohn@gmail.com."



    @Then("The book is removed")
  public void bookIsRemoved() {
  Assert.assertEquals(204, response.getStatusCode());

  RestAssured.baseURI = BASE_URL;
  RequestSpecification request = RestAssured.given();

  request.header("Authorization", "Bearer " + token)
  .header("Content-Type", "application/json");

  response = request.get("/Account/v1/User/" + USER_ID);
  Assert.assertEquals(200, response.getStatusCode());

  jsonString = response.asString();
  List<Map<String, String>> booksOfUser = JsonPath.from(jsonString).get("books");
  Assert.assertEquals(0, booksOfUser.size());
  }
  }