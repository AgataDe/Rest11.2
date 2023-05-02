import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest extends BaseTest {
    @Test
    public void shouldDeletePost() {
        given()
                .pathParams("id", "1")
                .when()
                .delete(POSTS + "/{id}")
                .then().statusCode(200);
    }
}
