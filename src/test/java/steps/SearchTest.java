package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import cucumber.api.java.en.Given;


import cucumber.api.java.en.Then;
import com.jsonplaceholder.models.UsersResponse;
import com.jsonplaceholder.request.UserRequest;

import java.util.Arrays;

public class SearchTest {
    private UsersResponse[] response;

    @Given("^I search for user \"([^\"]*)\"$")
    public void searchUser(String username) {
        response = UserRequest.getUser(username).as(UsersResponse[].class);

    }

    @Then("^User \"([^\"]*)\" is returned in response$")
    public void userIsFound(String username) {
        assertThat(Arrays.stream(response).anyMatch(s -> s.getUsername().contains(username)), is(true));
    }
}
