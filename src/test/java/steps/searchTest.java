package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import cucumber.api.java.en.Given;


import cucumber.api.java.en.Then;
import com.jsonplaceholder.models.UsersResponse;
import com.jsonplaceholder.request.UserRequest;

import java.util.Arrays;
import java.util.List;

public class searchTest {
    public List<UsersResponse> users;

    public searchTest() {

    }

    @Given("^I search for user \"([^\"]*)\"$")
    public void searchUser(String username) {
        users = Arrays.asList(UserRequest.getUser(username).getBody().as(UsersResponse[].class));
    }

    @Then("^User \"([^\"]*)\" is returned in response$")
    public void userIsFound(String username) {
        assertThat(users.stream().anyMatch(s -> s.getUsername().contains(username)), is(true));
    }
}
