package com.jsonplaceholder.request;

import com.jsonplaceholder.common.Spec;
import io.restassured.response.Response;

import static com.jsonplaceholder.api.endpoints.USERS;
import static io.restassured.RestAssured.given;

public class UserRequest {
    public static Response getUser(String username) {
        Response response = given()
                .spec(Spec.getCommonSpec())
                .get(USERS);
        response.then().log().all();
        return response;
    }
}
