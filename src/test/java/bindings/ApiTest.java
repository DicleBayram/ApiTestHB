package bindings;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ApiTest {

    public int jsonResponse = 0;

    @Given("^I get a response code using the API endpoint$")
    public void get_blog_posts_using_API() throws Throwable {
        ApiRequest apiRequest = new ApiRequest();
        jsonResponse = apiRequest.GetJsonResultFromApi();
    }

    @Then("^Api response code is successful$")
    public void is_response_code_successful() throws Throwable {
        Boolean responseCodeIsSuccessful = (jsonResponse == 200);
        assertTrue(responseCodeIsSuccessful);
    }
}