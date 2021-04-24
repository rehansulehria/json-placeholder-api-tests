package com.jsonplaceholder.common;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Before;

import static com.jsonplaceholder.api.endpoints.BASEURI;
import static org.hamcrest.Matchers.*;

public class Spec {
    public static RequestSpecBuilder requestSpec;
    public static ResponseSpecification successResponseSpec;


    @Before
    public static RequestSpecification getCommonSpec() {
        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        reqBuilder.setBaseUri(BASEURI)
                .setContentType(ContentType.JSON);
        RequestSpecification reqSpec = reqBuilder.build();
        return reqSpec;
    }
}
