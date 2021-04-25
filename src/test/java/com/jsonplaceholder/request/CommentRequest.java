package com.jsonplaceholder.request;

import com.jsonplaceholder.common.Spec;
import io.restassured.response.Response;

import static com.jsonplaceholder.api.endpoints.COMMENTS;
import static com.jsonplaceholder.api.endpoints.POSTS;
import static io.restassured.RestAssured.given;

public class CommentRequest {
    public static Response fetchCommentOnPost(int postId) {
        Response response = given()
                .spec(Spec.getCommonSpec())
                .pathParam("postId", postId)
                .get(POSTS + "/{postId}" + COMMENTS);
        response.then().log().all();
        return response;
    }
}
