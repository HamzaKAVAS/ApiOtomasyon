package tests;
import baseUrl.RESTFULL_BaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class P14_POST_RestFull extends RESTFULL_BaseUrl {

    /*
       https://restful-booker.herokuapp.com/booking endpointine
       asagidaki body'ye sahip bir POST request gonderdigimizde donen response'un
       status code'unun 200 oldugunu ve "firstname" degerinin "Kerem" oldugunu test edin
         {
           "firstname" : "Kerem",
           "lastname" : "Bürsin",
           "totalprice" : 1275,
           "depositpaid" : true,
           "bookingdates" :  {
              "checkin" : "2025-07-01",
              "checkout" : "2025-07-15"
                             },
           "additionalneeds" : "Breakfast,Dinner,Wi-fi"
         }
    */

    @Test
    public void postRestFullTest() {
        // 1- EndPoint ve reqBody Hazırlanır.
        specRestFull.pathParam("pp1", "booking");

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2025-07-01");
        bookingdates.put("checkout", "2025-07-15");

        JSONObject reqBody = new JSONObject();
        reqBody.put("firstname", "Kerem");
        reqBody.put("lastname", "Bürsin");
        reqBody.put("totalprice", 1275);
        reqBody.put("depositpaid", true);
        reqBody.put("bookingdates", bookingdates);
        reqBody.put("additionalneeds", "Breakfast,Dinner,Wi-fi");

        // 2- Expected Body Yok.

        // 3- Response Kaydedilir.
        Response response = given().contentType(ContentType.JSON).spec(specRestFull).when().body(reqBody.toString()).post("/{pp1}");

        // 4- Assertion İşlemleri Yapılır.
        response.then().assertThat().statusCode(200).
                body("booking.firstname", equalTo("Kerem"),
                        "booking.lastname", equalTo("Bürsin"),
                        "booking.totalprice", equalTo(1275),
                        "booking.depositpaid", equalTo(true),
                        "booking.bookingdates.checkin", equalTo("2025-07-01"),
                        "booking.bookingdates.checkout", equalTo("2025-07-15"),
                        "booking.additionalneeds", equalTo("Breakfast,Dinner,Wi-fi"));
    }
}
