import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PatchTest extends BaseTest {

    String body = """
            {
                "userId": 1,
                "body": "Should Update Post"
              }""";

    @Test
    public void shouldUpdatePostWithTitle() {
        given()
                .body(body)
                .contentType(ContentType.JSON)
                .when()
                .patch(POSTS + "/1")
                .then().statusCode(200);
    }
}
