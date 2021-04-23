package com.jsonplaceholder.common;

import com.jsonplaceholder.api.endpoints;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.hamcrest.Matchers.*;

public class Spec {
    public static RequestSpecification requestSpec;
    public static ResponseSpecification successResponseSpec;

    public Spec() {
        Spec.requestSpec = new RequestSpecBuilder()
                .setBaseUri(endpoints.BASEURI)
                .addHeader("Content-Type", "application/json")
                .build();
        Spec.successResponseSpec = new ResponseSpecBuilder()
                .expectStatusCode(anyOf(is(200), is(201)))
                .expectStatusCode(is(both(greaterThanOrEqualTo(100)).and(lessThanOrEqualTo(399))))
                .build();
    }
}
