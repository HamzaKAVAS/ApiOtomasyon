package tests;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class P07_GET_BodyTekrarlardanKurtulma {

    /*
       https://restful-booker.herokuapp.com/booking/99 url'ine
       bir GET request gonderdigimizde donen Response'un,
       status code'unun 200,
       ve content type'inin application/json; charset=utf-8,
       ve response body'sindeki
       "firstname"in, "John",
       ve "lastname"in, "Smith",
       ve "totalprice"in, 111,
       ve "depositpaid"in, true,
       ve "additionalneeds"in, "Breakfast" oldugunu test edin
    */

    @Test
    public void test() {
        // 1- EndPoint hazırlanır.
        String url = "https://restful-booker.herokuapp.com/booking/99";

        // 2- Expected Data verilmemiş.

        // 3- Response kaydedilir.
        Response response = given().when().get(url);

        // 4- Assertion işlemleri yapılır.
        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("firstname", equalTo("John"),
                        "lastname", equalTo("Smith"),
                        "totalprice", equalTo(111),
                        "depositpaid", equalTo(true),
                        "additionalneeds", equalTo("Breakfast"));
    }
}
