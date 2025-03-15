package tests;

import baseUrl.RESTFULL_BaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import testDatas.RestFullDatas;

import static io.restassured.RestAssured.given;

public class P18_POST_TestDataKullanimi extends RESTFULL_BaseUrl {

    /*
       https://restful-booker.herokuapp.com/booking url'ine asagidaki body'ye sahip
       bir POST request gonderdigimizde donen response'un
       id haric asagidaki gibi oldugunu test edin.

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
       Response Body
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
         }
    */

    @Test
    public void test01() {
        // 1- Endpoint ve reqBody Hazırlanması
        specRestFull.pathParam("pp1", "booking");
        JSONObject reqBody = RestFullDatas.JSONDataOlustur();

        // 2- Expected Body
        JSONObject expBody = new JSONObject();
        expBody.put("bookingid", 24);
        expBody.put("booking", RestFullDatas.JSONDataOlustur());

        // 3- Response Kaydedilir
        Response response = given().contentType(ContentType.JSON).spec(specRestFull).when().body(reqBody.toString()).post("/{pp1}");
    }
}
