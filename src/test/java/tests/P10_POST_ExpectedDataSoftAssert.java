package tests;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static io.restassured.RestAssured.given;

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
    public void expectedDataSoftAssertTest() {
        // 1- EndPoint ve reqBody Hazırlama
        String url = "https://restful-booker.herokuapp.com/booking";

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2021-06-01");
        bookingdates.put("checkout", "2021-06-10");

        JSONObject reqBody = new JSONObject();
        reqBody.put("firstname", "Hayri");
        reqBody.put("lastname", "Koru");
        reqBody.put("totalprice", 550);
        reqBody.put("depositpaid", true);
        reqBody.put("bookingdates", bookingdates);
        reqBody.put("additionalneeds", "Breakfast");

        // 2- Expected Data Oluşturmak
        JSONObject expBody = new JSONObject();
        expBody.put("bookingid", 255);
        expBody.put("booking", reqBody);

        // 3- Response kaydetmek
        Response response = given().contentType(ContentType.JSON).when().body(reqBody.toString()).post(url);

        // 4- Assertion işlemi
        JsonPath resJP = response.jsonPath();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(resJP.get("booking.firstname"), expBody.getJSONObject("booking").get("firstname"));
        softAssert.assertEquals(resJP.get("booking.lastname"), expBody.getJSONObject("booking").get("lastname"));
        softAssert.assertEquals(resJP.get("booking.totalprice"), expBody.getJSONObject("booking").get("totalprice"));
        softAssert.assertEquals(resJP.get("booking.depositpaid"), expBody.getJSONObject("booking").get("depositpaid"));
        softAssert.assertEquals(resJP.get("booking.additionalneeds"), expBody.getJSONObject("booking").get("additionalneeds"));
        softAssert.assertEquals(resJP.get("booking.bookingdates.checkin"), expBody.getJSONObject("booking").getJSONObject("bookingdates").get("checkin"));
        softAssert.assertEquals(resJP.get("booking.bookingdates.checkout"), expBody.getJSONObject("booking").getJSONObject("bookingdates").get("checkout"));

        softAssert.assertAll();
    }
}
