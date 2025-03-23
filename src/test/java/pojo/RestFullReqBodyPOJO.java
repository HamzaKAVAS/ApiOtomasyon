package pojo;

public class RestFullReqBodyPOJO {

    /*
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
    */

    // 1- Tüm variable'lar private olarak oluşturulur.
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private RestFullBookingdatesPOJO bookingdates;
    private String additionalneeds;

    // 2- Tüm variable'lar için getter and setter olusturuyoruz.
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public RestFullBookingdatesPOJO getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(RestFullBookingdatesPOJO bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    // 3- Tüm variable'ları içeren parametreli constructor oluşturuyoruz.
    public RestFullReqBodyPOJO(String firstname, String lastname, int totalprice, boolean depositpaid, RestFullBookingdatesPOJO bookingdates, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }

    // 4- Default constructor öldüğü için onun işlevini yapacak bir parametresiz constructor oluşturalım.
    public RestFullReqBodyPOJO() {
    }

    // 5- Verileri yazdırma durumunda ihtiyaç olursa diye toString methodu da eklenir.
    @Override
    public String toString() {
        return "Rezervasyon Bilgileriniz: \n" +
                "Firstname: " + firstname + "\n" +
                "Lastname: " + lastname + "\n" +
                "Totalprice: " + totalprice + "\n" +
                "Depositpaid: " + depositpaid + "\n" +
                "Bookingdates: " + bookingdates + "\n" +
                "Additionalneeds: " + additionalneeds;
    }
}
