package com.jsonplaceholder.request;

import com.jsonplaceholder.api.endpoints;
import com.jsonplaceholder.common.Spec;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserRequest {
    public static Response getUser(String username) {
        Response response = given()
                .spec(Spec.requestSpec)
                .param("username", username)
                .get(endpoints.USERS);
        response
                .then()
                .assertThat()
                .spec(Spec.successResponseSpec);
        return response;
    }
}
