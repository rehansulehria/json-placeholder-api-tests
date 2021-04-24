package com.jsonplaceholder.request;

import com.jsonplaceholder.api.endpoints;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CommentRequest {
    public static Response fetchCommentOnPost(int postId) {
        Response commentsOnPost = given()
                .param("postId", postId)
                .get(endpoints.COMMENTS);
        return commentsOnPost;
    }
}
