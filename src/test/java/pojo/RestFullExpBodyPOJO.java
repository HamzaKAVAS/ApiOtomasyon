package pojo;

public class RestFullExpBodyPOJO {

    /*
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

    // 1- Tüm variable'lar private olarak oluşturulur.
    private int bookingid;
    private RestFullReqBodyPOJO booking;

}
