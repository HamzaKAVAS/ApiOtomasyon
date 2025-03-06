package tests;
import baseUrl.JPH_BaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import testDatas.JPHDatas;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class P16_GET_TestDataClassKullanimi extends JPH_BaseUrl {

    /*
       https://jsonplaceholder.typicode.com/posts/22 url'ine bir GET request yolladigimizda donen response'in
       status kodunun 200 ve
       response body'sinin asagida verilen ile ayni oldugunu test ediniz
       Response body : (expected data)
       {
         "userId": 3,
         "id": 22,
         "title": "dolor sint quo a velit explicabo quia nam",
         "body": "eos qui et ipsum ipsam suscipit aut sed omnis non odio expedita earum mollitia molestiae aut atque rem suscipit nam impedit esse"
       }
    */

    @Test
    public void testDataKullanimi1() {
        // 1- EndPoint ve PathParams Hazırlanır.
        specJPH.pathParams("pp1", "posts", "pp2", 22);

        // 2- Expected Body Yazılır.
        JSONObject expData = JPHDatas.expData();

        // 3- Response Kaydedilir.
        Response response = given().spec(specJPH).when().get("/{pp1}/{pp2}");
        JsonPath resJP = response.jsonPath();

        // 4- Assertion İşlemleri Yapılır.
        assertEquals(response.getStatusCode(), JPHDatas.basariliStatusCode);
        assertEquals(resJP.get("userId"), expData.get("userId"));
        assertEquals(resJP.get("id"), expData.get("id"));
        assertEquals(resJP.get("title"), expData.get("title"));
        assertEquals(resJP.get("body"), expData.get("body"));
    }
}
