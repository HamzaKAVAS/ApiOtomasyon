package tests;

import baseUrl.RESTFULL_BaseUrl;
import org.testng.annotations.Test;
import pojo.RestFullBookingdatesPOJO;
import pojo.RestFullExpBodyPOJO;
import pojo.RestFullReqBodyPOJO;

public class P22_POST_POJOClass extends RESTFULL_BaseUrl {

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
           }
    */

    @Test
    public void test01(){
        // 1- Endpoint ve reqBody Hazırlanması
        specRestFull.pathParam("pp1", "booking");
        RestFullBookingdatesPOJO bookingdates = new RestFullBookingdatesPOJO("2021-06-01", "2021-06-10");
        RestFullReqBodyPOJO reqBody = new RestFullReqBodyPOJO("Hayri", "Yiğit", 275, true, bookingdates, "wi-fi");

        // 2- Expected Body
        RestFullExpBodyPOJO expBody = new RestFullExpBodyPOJO(24, reqBody);
    }
}
