package com.jsonplaceholder.request;

import com.jsonplaceholder.api.endpoints;
import com.jsonplaceholder.common.Spec;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CommentRequest {
    public static Response fetchCommentOnPost(int postId) {
        Response commentsOnPost = given()
                .spec(Spec.requestSpec)
                .param("postId", postId)
                .get(endpoints.COMMENTS);
        commentsOnPost
                .then()
                .assertThat()
                .spec(Spec.successResponseSpec);
        return commentsOnPost;
    }
}
