package tests;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class P11_GET_ResponseBodyTestListKullanimi {

    /*
       https://api.collectapi.com/health/dutyPharmacy?il=Kırıkkale url'ine bir GET request yolladigimizda
       donen Response'in
       status code'unun 200,
       ve content type'inin application/json,
       ve response body'sindeki
       eczane sayısıın sayisinin 4
       ve eczane'lerden birinin "ENES ECZANESİ"
       ve eczaneler ilçelerinde icinde Merkez ,Delice ve Keskin degerinin oldugunu test edin.
    */

    @Test
    public void test() {
        // 1- EndPoint Hazırlama
        String url = "https://api.collectapi.com/health/dutyPharmacy?il=Kırıkkale";
        String apiKey = "apikey 7oz12GLMsEHKccL5kM3kah:5t9yvaRbrmIzEjsWljC330";

        // 2- Expected Data Yok

        // 3- Response Kaydedilir.
        Response response = given().when().header("authorization", apiKey).get(url);
        //response.prettyPrint();

        // 4- Assertion İşlemleri Yapılır.
        response.then().assertThat().statusCode(200).contentType("application/json")
                .body("result.dist", hasSize(5), "result.name", hasItem("CENNET ECZANESI"),
                        "result.dist", hasItems("yahşihan", "keskin", "delice"));
    }
}
