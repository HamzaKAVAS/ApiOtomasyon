package tests;

import baseUrl.JPH_BaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class P12_JPH_BaseUrl extends JPH_BaseUrl {

    /*
        https://jsonplaceholder.typicode.com/posts endpointine
        bir GET request gonderdigimizde
        donen response'un status code'unun 200 oldugunu ve
        Response'ta 100 kayit oldugunu test edin
    */

    @Test
    public void test01(){
        // 1- Endpoint Hazırlanır.
        specJPH.pathParam("pp1","posts");

        // 2- Expected Body Yok.

        // 3- Response Kaydedilir.
        Response response = given().spec(specJPH).when().get("/{pp1}");
    }
}
