package tests;

import baseUrl.CollectApiBaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class P24_CollectApi_NobetciEczaneler extends CollectApiBaseUrl {

    /*
       https://api.collectapi.com/health/dutyPharmacy?il=Istanbul&ilce=Üsküdar
       adresine asağıdaki bilgilerle bir GET request yapınca
       dönen cevabı yazdırınız.

       header
       Content-Type : application/json
       Authorization : apikey 7oz12GLMsEHKccL5kM3kah:5t9yvaRbrmIzEjsWljC330
    */

    @Test
    public void test01(){
        // 1- Endpoint Hazırlanması
        specCollectApi.pathParams("pp1", "health", "pp2", "dutyPharmacy")
                .queryParams("il", "Bursa", "ilce", "Osmangazi");

        // 2- Expected Body Yok

        // 3- Response Kaydedilir
        Response response = given().spec(specCollectApi).when().header("Content-Type", "application/json")
                .header("Authorization", "apikey 7oz12GLMsEHKccL5kM3kah:5t9yvaRbrmIzEjsWljC330").get("/{pp1}/{pp2}");

        response.prettyPrint();
    }
}
