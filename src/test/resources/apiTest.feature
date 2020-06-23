@FeatureApiTest
Feature: Api post control

  @JsonApiControl

  Scenario: Control of user's post
    Given I get a response code using the API endpoint
    Then Api response code is successful