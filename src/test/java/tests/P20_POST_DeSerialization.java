package tests;

import baseUrl.RESTFULL_BaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testDatas.RestFullDatas;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class P20_POST_DeSerialization extends RESTFULL_BaseUrl {

    /*
       https://restful-booker.herokuapp.com/booking url'ine
       asagidaki body'ye sahip bir POST request gonderdigimizde
       donen response'un id haric asagidaki gibi oldugunu test edin.

         Request body
           {
              "firstname" : "Ahmet",
              "lastname" : "Bulut",
              "totalprice" : 500,
              "depositpaid" : false,
              "bookingdates" :
              {
                 "checkin" : "2021-06-01",
                 "checkout" : "2021-06-10"
              },
              "additionalneeds" : "wi-fi"
           }

         Response Body // expected data
           {
              "bookingid": 24,
              "booking":
              {
              "firstname": "Ahmet",
              "lastname": "Bulut",
              "totalprice": 500,
              "depositpaid": false,
              "bookingdates":
              {
                 "checkin": "2021-06-01",
                 "checkout": "2021-06-10"
              },
              "additionalneeds": "wi-fi"
           }
     */

    @Test
    public void test01(){
        // 1- Endpoint ve reqBody Hazırlanır
        specRestFull.pathParams("pp1","booking");
        Map<String,Object> reqMapBody = RestFullDatas.mapDataOLustur();

        // 2- Expected Body yazılır
        Map<String,Object> expMapBody = RestFullDatas.expMapDataOlustur();

        // 3- Response Kaydedilir
        Response response = given().contentType(ContentType.JSON).spec(specRestFull).when().body(reqMapBody).post("/{pp1}");
    }
}
