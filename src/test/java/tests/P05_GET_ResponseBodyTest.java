package tests;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class P05_GET_ResponseBodyTest {

    /*
       https://jsonplaceholder.typicode.com/posts/44 url'ine bir GET request yolladigimizda
       donen Response'in;
       status code'unun 200,
       ve content type'inin application/json,
       ve response body'sinde bulunan userId'nin 5,
       ve response body'sinde bulunan title'in "optio dolor molestias sit" oldugunu test edin.
    */

    @Test
    public void test() {
        // 1- EndPoint hazırlanır.
        String url = "https://jsonplaceholder.typicode.com/posts/44";

        // 2- Expected Data verilmemiş.

        // 3- Response kaydedilir.
        Response response = given().when().get(url);

        // 4- Assertion işlemleri yapılır.
        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json")
                .body("userId", equalTo(5), "title", equalTo("optio dolor molestias sit"));
    }
}
