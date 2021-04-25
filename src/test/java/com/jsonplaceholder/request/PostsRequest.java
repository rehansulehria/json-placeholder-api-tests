package com.jsonplaceholder.request;

import com.jsonplaceholder.common.Spec;
import io.restassured.response.Response;

import static com.jsonplaceholder.api.endpoints.POSTS;
import static io.restassured.RestAssured.given;

public class PostsRequest {

    public static Response getPosts(String userID) {
        Response response = given()
                .spec(Spec.getCommonSpec())
                .queryParam("userId", userID)
                .get(POSTS);
        response.then().log().all();
        return response;
    }
}