import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class hooks {
    @BeforeTest
    public static void setUp(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

    }
}
