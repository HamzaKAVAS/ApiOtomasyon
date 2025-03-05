package tests;
import baseUrl.RESTFULL_BaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class P15_HerOkuAppQueryParams extends RESTFULL_BaseUrl {

    /*
       https://restful-booker.herokuapp.com/booking endpointine
       gerekli Query parametrelerini yazarak
       "firstname" degeri "Josh" ve "lastname" degeri "Allen" olan rezervasyon oldugunu
       test edecek bir GET request gonderdigimizde,
       donen response'un status code'unun 200 oldugunu ve
       "Josh Allen" ismine sahip en az bir booking oldugunu test edin
    */

    @Test
    public void test01() {
        // 1- EndPoint ve Query Hazırlanır.
        specRestFull.pathParam("pp1", "booking").queryParams("firstname", "Josh", "lastname", "Allen");

        // 2- Expected Body Yok.

        // 3- Response Kaydedilir.
        Response response = given().spec(specRestFull).when().get("/{pp1}");

        // 4- Assertion İşlemleri Yapılır.
        response.then().assertThat().statusCode(200).body("size()", greaterThan(0));
    }

    /*
       https://restful-booker.herokuapp.com/booking endpointine
       gerekli Query parametrelerini yazarak
       “firstname” degeri “Eric” olan rezervasyon oldugunu test edecek
       bir GET request gonderdigimizde, donen response’un status code’unun
       200 oldugunu ve “Eric” ismine sahip en az bir booking var olup olmadıgını test edin
    */

    @Test
    public void test02() {
        // 1- EndPoint ve Query Hazırlanır.
        specRestFull.pathParam("pp1", "booking").queryParams("firstname", "Eric");

        // 2- Expected Body Yok.

        // 3- Response Kaydedilir.
        Response response = given().spec(specRestFull).when().get("/{pp1}");

        // 4- Assertion İşlemleri Yapılır.
        response.then().assertThat().statusCode(200).body("size()", greaterThanOrEqualTo(0));
    }
}
