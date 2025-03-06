package tests;
import baseUrl.RESTFULL_BaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

public class P13_GET_RESTFULL_BaseUrl extends RESTFULL_BaseUrl {

    /*
       https://restful-booker.herokuapp.com/booking endpointine
       bir GET request gonderdigimizde donen response'un
       status code'unun 200 oldugunu ve
       Response'ta 12 bookingid'sine sahip booking oldugunu test edin
    */

    @Test
    public void restFullBaseTest() {
        // 1- EndPoint Hazırlanır.
        specRestFull.pathParam("pp1", "booking");

        // 2- Expected Body Yok.

        // 3- Response Kaydedilir.
        Response response = given().spec(specRestFull).when().get("/{pp1}");

        // 4- Assertion İşlemleri Yapılır.
        response.then().assertThat().statusCode(200).body("bookingid", hasItem(12));
    }
}
