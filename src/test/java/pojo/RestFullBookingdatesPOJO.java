package pojo;

public class RestFullBookingdatesPOJO {

    /*
       {
         "checkin": "2021-06-01",
         "checkout": "2021-06-10"
       }
    */

    // 1- Tüm variable'lar private olarak oluşturulur.
    private String checkin;
    private String checkout;

    // 2- Tüm variable'lar için getter and setter olusturuyoruz.
    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    // 3- Tüm variable'ları içeren parametreli constructor oluşturuyoruz.
    public RestFullBookingdatesPOJO(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    // 4- Default constructor öldüğü için onun işlevini yapacak bir parametresiz constructor oluşturalım.
    public RestFullBookingdatesPOJO() {
    }

    // 5- Verileri yazdırma durumunda ihtiyaç olursa diye toString methodu da eklenir.
    @Override
    public String toString() {
        return "Bookingdates Bilgileri" + "\n" +
                "Checkin Tarihi:" + checkin + "\n" +
                "Checkout Tarihi:" + checkout;
    }
}
