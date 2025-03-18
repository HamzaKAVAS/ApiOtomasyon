package tests;

import baseUrl.JPH_BaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testDatas.JPHDatas;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class P19_PUT_DeSerialization extends JPH_BaseUrl {

    /*
       https://jsonplaceholder.typicode.com/posts/70 url'ine
       asagidaki body'e sahip bir PUT request yolladigimizda
       donen response'in response body'sinin
       asagida verilen ile ayni oldugunu test ediniz
         Request Body
           {
              "title": "Ahmet",
              "body": "Merhaba",
              "userId": 10,
              "id": 70
           }

         Expected Data :
           {
              "title": "Ahmet",
              "body": "Merhaba",
              "userId": 10,
              "id": 70
           }
    */

    @Test
    public void test01() {
        // 1- Endpoint ve reqBody Hazırlanması
        specJPH.pathParams("pp1", "posts", "pp2", 70);
        Map<String, Object> reqMapBody = JPHDatas.mapDataOlustur();

        // 2- Expected Body
        Map<String, Object> expMapBody = JPHDatas.mapDataOlustur();

        // 3- Response Kaydedilir
        Response response = given().contentType(ContentType.JSON).spec(specJPH).when().body(reqMapBody).put("/{pp1}/{pp2}");

        // 4- Assertion İşlemleri
        Map<String, Object> resMap = response.as(HashMap.class);

        assertEquals(resMap.get("title"), expMapBody.get("title"));
        assertEquals(resMap.get("body"), expMapBody.get("body"));
        assertEquals(resMap.get("userId"), expMapBody.get("userId"));
        assertEquals(resMap.get("id"), expMapBody.get("id"));
    }

    @Test
    public void test02(){

    }
}
