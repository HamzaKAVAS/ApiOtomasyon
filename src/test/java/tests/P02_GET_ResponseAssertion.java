package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class P02_GET_ResponseAssertion {

    /*
       https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde donen Response’un,
       status code’unun "200",
       ve content type’inin "application/json; charset=utf-8",
       ve "Server" isimli Header’in degerinin "Cowboy",
       ve status Line’in "HTTP/1.1 200 OK" oldugunu otomasyonla assert test ediniz.
    */

    @Test
    public void test() {
        // 1- EndPoint hazırlanır.
        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2- Expected Data verilmemiş.

        // 3- Response kaydedilir.
        Response response = RestAssured.get(url);

        // 4- Assertion işlemleri yapılır.
        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server", "Cowboy")
                .statusLine("HTTP/1.1 200 OK");
    }
}
