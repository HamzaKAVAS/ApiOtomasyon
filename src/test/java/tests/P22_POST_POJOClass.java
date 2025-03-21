package tests;

import baseUrl.RESTFULL_BaseUrl;

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
}
