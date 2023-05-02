import io.restassured.http.ContentType;
import models.Post;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostTest extends BaseTest {
    String body = """
            {
                "userId": 1,
                "title": "Test Rest Demo",
                "body": "Should Create New Post"
              }""";

    @Test
    public void shouldCreateNewPost() {
        given()
                .body(body)
                .contentType(ContentType.JSON)
                .when().post(POSTS)
                .then().statusCode(201);
    }

    @Test
    public void shouldCreateNewPost2() {
        Post post = new Post("2", "Test Rest Demo #2", "Should Create Another New Post");
        given()
                .body(post)
                .contentType(ContentType.JSON)
                .when().post(POSTS)
                .then().statusCode(201);
    }
}
