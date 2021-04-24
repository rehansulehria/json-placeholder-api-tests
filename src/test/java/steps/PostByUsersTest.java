package steps;

import com.jsonplaceholder.models.PostsResponse;
import com.jsonplaceholder.request.PostsRequest;
import cucumber.api.java.en.Then;

import java.util.List;

public class PostByUsersTest {
    public List<PostsResponse> posts;


    @Then("^I search for user post by user \"([^\"]*)\"$")
    public void searchPostByUser(String username) {
        posts = List.of(PostsRequest.getPosts("9").getBody().as(PostsResponse[].class));
    }
}
