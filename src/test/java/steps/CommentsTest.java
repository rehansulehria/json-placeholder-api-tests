package steps;

import com.jsonplaceholder.models.CommentResponse;
import com.jsonplaceholder.request.CommentRequest;
import cucumber.api.java.en.Given;
import io.restassured.common.mapper.TypeRef;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CommentsTest {
    public List<CommentResponse> commentsRes;

    @Given("^I search for comments by user$")
    public void CommentsTest() {
        commentsRes = List.of(CommentRequest.fetchCommentOnPost(Integer.parseInt("9")).as(CommentResponse[].class));
        assertThat("verify email found", commentsRes.stream().anyMatch(e->e.getEmail().
                equals("Lucio@gladys.tv")), is(true));


    }
}
