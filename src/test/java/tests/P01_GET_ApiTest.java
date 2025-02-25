package tests;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class P01_GET_ApiTest {

    /*
        https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.
    */

    /* ===========================================================================================================
                          -------- Tüm API sorguları 4 aşamada yapılır --------
       1- EndPoint hazırlanır (Url ve varsa (PUT-POST-PATCH) Request Body hazırlanır)
       2- Soruda verilmiş ise Expected Data hazırlanır, verilmemişse hazırlanmaz.
       3- Dönen cevap kaydedilir.
       4- Assertion işlemleri yapılır.
       =========================================================================================================== */

    @Test
    public void test() {
        // 1- EndPoint hazırlanır.
        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2- Expected Data verilmemiş.

        // 3- Dönen cevap kaydedilir.
        Response response = given().when().get(url);

        // 4- Assertion işlemleri yapılır.
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Content Type: " + response.getContentType());
        System.out.println("Server name with Header: " + response.getHeader("Server"));
        System.out.println("Status Line: " + response.getStatusLine());
        System.out.println("Response Time: " + response.getTime());
    }
}
