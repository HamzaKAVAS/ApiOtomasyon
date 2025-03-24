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

    // 2- Tüm variable'lar için getter and setter olusturuyoruz.
    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public RestFullReqBodyPOJO getBooking() {
        return booking;
    }

    public void setBooking(RestFullReqBodyPOJO booking) {
        this.booking = booking;
    }

    // 3- Tüm variable'ları içeren parametreli constructor oluşturuyoruz.
    public RestFullExpBodyPOJO(int bookingid, RestFullReqBodyPOJO booking) {
        this.bookingid = bookingid;
        this.booking = booking;
    }

    // 4- Default constructor öldüğü için onun işlevini yapacak bir parametresiz constructor oluşturalım.
    public RestFullExpBodyPOJO() {
    }

}
