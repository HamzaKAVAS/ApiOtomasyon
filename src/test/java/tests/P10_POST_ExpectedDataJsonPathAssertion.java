package tests;

import org.json.JSONObject;
import org.junit.Test;

public class P10_POST_ExpectedDataJsonPathAssertion {

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
    public void test(){
        // 1- EndPoint ve reqBody Hazırlama
        String url = "https://restful-booker.herokuapp.com/booking";

        JSONObject innerData = new JSONObject();
        innerData.put("checkin", "2021-06-01");
        innerData.put("checkout", "2021-06-10");

        JSONObject reqBody = new JSONObject();
        reqBody.put("firstname", "Ahmet");
        reqBody.put("lastname", "Bulut");
        reqBody.put("totalprice", 120);
        reqBody.put("depositpaid", true);
        reqBody.put("bookingdates", innerData);
        reqBody.put("additionalneeds", "wi-fi");

        // 2- Expected Data Oluşturmak
        JSONObject expBody = new JSONObject();
        expBody.put("bookingid", 146);
        expBody.put("booking", reqBody);
    }
}
