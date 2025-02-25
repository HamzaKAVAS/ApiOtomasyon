package tests;
import org.json.JSONObject;
import org.junit.Test;

public class P03_JSON_DataOlusturma {

    JSONObject data;
    JSONObject innerData;

    /*
       Asagidaki JSON Objesini olusturup konsolda yazdirin.
       {
         "title":"Ahmet",
         "body":"Merhaba",
         "userId":1
       }
    */

    @Test
    public void test01() {
        data = new JSONObject();

        data.put("title", "Ahmet");
        data.put("body", "Merhaba");
        data.put("userId", 1);

        System.out.println(data);
        System.out.println("=======================================================================");
    }

    /*
       {
         "firstname":"Jim",
         "additionalneeds":"Breakfast",
         "bookingdates":
         {
            "checkin":"2018-01-01",
            "checkout":"2019-01-01"
         },
         "totalprice":111,
         "depositpaid":true,
         "lastname":"Brown"
       }
         Bu gibi iç içe veri bulunduran datalarla çalışırken önce en içerdekinden başlanır.
    */

    @Test
    public void test02() {
        innerData = new JSONObject();

        innerData.put("checkin", "2018-01-01");
        innerData.put("checkout", "2019-01-01");

        data = new JSONObject();

        data.put("firstname", "Jim");
        data.put("lastname", "Brown");
        data.put("additionalneeds", "Breakfast");
        data.put("bookingdates", innerData);
        data.put("totalprice", 111);
        data.put("depositpaid", true);

        System.out.println(data);
    }
}
