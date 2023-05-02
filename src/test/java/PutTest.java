import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PutTest extends BaseTest {

    String body = """
            {
                "userId": 1,
                "body": "Should Update Post"
              }""";

    @Test
    public void shouldUpdatePost() {
        given()
                .body(body)
                .contentType(ContentType.JSON)
                .when()
                .put(POSTS + "/1")
                .then().statusCode(200);
    }
}
