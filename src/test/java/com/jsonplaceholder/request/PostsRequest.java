package com.jsonplaceholder.request;

import com.jsonplaceholder.common.Spec;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static com.jsonplaceholder.api.endpoints.POSTS;
import static io.restassured.RestAssured.given;

public class PostsRequest {

    public static Response getPosts(String userId) {
        Response response = given()
                .contentType(ContentType.JSON)
                .param("userId", userId)
                .get(POSTS);
        response
                .then()
                .assertThat()
                .spec(Spec.successResponseSpec);
        return response;
    }
}