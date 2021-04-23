package request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.Posts;

import static Endpoints.api.POSTS;

public class PostRequestSpecification {

    public Posts getPosts() {
        return RestAssured
                .given().contentType(ContentType.JSON)
                .when()
                .get(POSTS)
                .then().extract().response().as(Posts.class);
    }
}