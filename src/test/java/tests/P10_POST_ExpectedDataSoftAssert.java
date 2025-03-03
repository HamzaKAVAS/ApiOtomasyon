package tests;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class P10_POST_ExpectedDataSoftAssert {

    /*

       https://restful-booker.herokuapp.com/booking url'ine
       asagidaki body'ye sahip bir POST request gonderdigimizde

       Request body
         {
           "firstname": "Ahmet",
           "lastname": "Bulut",
           "totalprice": 120,
           "depositpaid": true,
           "bookingdates": {
            "checkin": "2021-06-01",
            "checkout": "2021-06-10"
           },
           "additionalneeds": "wi-fi"
         }

       donen response'un id haric asagidaki gibi oldugunu test edin.
       Response Body - Expected Data
         {
           "bookingid": 146,
           "booking": {
           "firstname": "Ahmet",
           "lastname": "Bulut",
           "totalprice": 120,
           "depositpaid": true,
           "bookingdates": {
            "checkin": "2021-06-01",
            "checkout": "2021-06-10"
           },
           additionalneeds": "wi-fi"
         }
    */

    @Test
    public void expectedDataSoftAssertTest(){
        // 1- EndPoint ve reqBody Hazırlama
        String url = "https://restful-booker.herokuapp.com/booking";

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin","2021-06-01");
        bookingdates.put("checkout","2021-06-10");

        JSONObject reqBody = new JSONObject();
        reqBody.put("firstname","Hayri");
        reqBody.put("lastname","Koru");
        reqBody.put("totalprice",550);
        reqBody.put("depositpaid",true);
        reqBody.put("bookingdates",bookingdates);
        reqBody.put("additionalneeds","Breakfast");


    }
}
