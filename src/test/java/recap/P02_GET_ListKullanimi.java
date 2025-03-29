package recap;

import baseUrl.ReqResBaseUrl;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class P02_GET_ListKullanimi extends ReqResBaseUrl {

    /*
       https://reqres.in/api/users?page=2 URL'sine bir GET isteği gönderin.
       Gelen yanıtın durum kodunun 200 olduğunu doğrulayın.
       Liste içerisindeki kullanıcı sayısının en az 1 olduğunu doğrulayın.
       İlk kullanıcının email adresinin boş olmadığını kontrol edin.
    */

    @Test
    public void test() {
        // 1- Endpoint Hazırlanır.
        specReqRes.pathParams("pp1", "api", "pp2", "users").queryParams("page", 2);

        // 2- Expected Body Yok.

        // 3- Response Kaydedilir.
        Response response = given().spec(specReqRes).when().get("/{pp1}/{pp2}");

        // 4- Assertions İşlemleri Yapılır.
        assertEquals(200, response.getStatusCode());
        assertFalse(response.jsonPath().getList("data").isEmpty());
        assertNotNull(response.jsonPath().get("data[0].email"));
        System.out.println("========Assertion İşlemleri Başarılı Olmuştur========");
    }
}
