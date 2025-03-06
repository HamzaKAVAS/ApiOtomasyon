package tests;
import baseUrl.JPH_BaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class P12_GET_JPH_BaseUrl extends JPH_BaseUrl {

    /*
        https://jsonplaceholder.typicode.com/posts endpointine
        bir GET request gonderdigimizde
        donen response'un status code'unun 200 oldugunu ve
        Response'ta 100 kayit oldugunu test edin
    */

    @Test
    public void test01() {
        // 1- Endpoint Hazırlanır.
        specJPH.pathParam("pp1", "posts");

        // 2- Expected Body Yok.

        // 3- Response Kaydedilir.
        Response response = given().spec(specJPH).when().get("/{pp1}");

        // 4- Assertion İşlemleri Yapılır.
        response.then().assertThat().statusCode(200).body("booking", hasSize(100));
    }

    /*
       https://jsonplaceholder.typicode.com/posts/44 endpointine
       bir GET request gonderdigimizde donen response'un
       status code'unun 200 oldugunu ve "title" degerinin
       "optio dolor molestias sit" oldugunu test edin
    */

    @Test
    public void test02() {
        // 1- EndPoint hazırlanır.
        specJPH.pathParams("pp1", "posts", "pp2", 44);

        // 2- Expected Body Yok.

        // 3- Response Kaydedilir.
        Response response = given().spec(specJPH).when().get("/{pp1}/{pp2}");

        // 4- Assertion İşlemleri Yapılır.
        response.then().assertThat().statusCode(200).body("title", equalTo("optio dolor molestias sit"));
    }
}
