import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.Posts;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import request.PostRequestSpecification;

public class searchTest {
    PostRequestSpecification request = new PostRequestSpecification();

public searchTest (){

}

//@BeforeTest
//public static void setUp(){
//        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//
//    }

@Test
public void searchUser()
{
    request.getPosts();

}
}
