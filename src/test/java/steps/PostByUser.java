package steps;

import com.jsonplaceholder.models.PostsResponse;
import com.jsonplaceholder.models.UsersResponse;
import com.jsonplaceholder.request.PostsRequest;
import com.jsonplaceholder.request.UserRequest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Arrays;
import java.util.List;

public class PostByUser {
    public List<PostsResponse> posts;


    @Then("^I search for user post by user \"([^\"]*)\"$")
    public void searchPostByUser(String username) {
        posts = Arrays.asList(PostsRequest.getPosts("1").getBody().as(PostsResponse[].class));
    }
}
