package tests;
import baseUrl.JPH_BaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import testDatas.JPHDatas;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class P17_PUT_TestDataKullanimi extends JPH_BaseUrl {

    /*
       https://jsonplaceholder.typicode.com/posts/7 url'ine asagidaki body'e sahip
       bir PUT request yolladigimizda donen response'in
       status kodunun 200, content type'inin "application/json; charset=utf-8",
       Connection header degerinin "keep-alive"
       ve response body'sinin asagida verilen ile ayni oldugunu test ediniz
       Request Body
         {
           "title": "Talip",
           "body": "Bozlagan",
           "userId": 5,
           "id": 7
         }
       Response Body
         {
           "title": "Talip",
           "body": "Bozlagan",
           "userId": 5,
           "id": 7
         }
    */

    @Test
    public void test01() {
        // 1- EndPoint ve reqBody Hazırlanır.
        specJPH.pathParams("pp1", "posts", "pp2", 7);
        JSONObject reqBody = JPHDatas.jsonData();

        // 2- Expected Body Yazılır.
        JSONObject expBody = JPHDatas.jsonData();

        // 3- Response Kaydedilir.
        Response response = given().contentType(ContentType.JSON).spec(specJPH).when().body(reqBody.toString()).put("/{pp1}/{pp2}");

        // 4- Assertion İşlemleri Yapılır.
        JsonPath resJP = response.jsonPath();

        assertEquals(response.getStatusCode(), JPHDatas.basariliStatusCode);
        assertEquals(response.getContentType(), JPHDatas.ContentType);
        assertEquals(response.getHeader("Connection"), JPHDatas.ConnectionHeader);

        assertEquals(resJP.get("title"), expBody.get("title"));
        assertEquals(resJP.get("body"), expBody.get("body"));
        assertEquals(resJP.get("userId"), expBody.get("userId"));
        assertEquals(resJP.get("id"), expBody.get("id"));
    }

    @Test
    public void test02() {
        // 1- EndPoint ve reqBody Hazırlanır.
        specJPH.pathParams("pp1", "posts", "pp2", 7);
        JSONObject reqBody = JPHDatas.jsonData();

        // 2- Expected Body Yazılır.
        JSONObject expBody = JPHDatas.jsonDataParametreli("Talip", "Bozlagan", 5, 7);

        // 3- Response Kaydedilir.
        Response response = given().contentType(ContentType.JSON).spec(specJPH).when().body(reqBody.toString()).put("/{pp1}/{pp2}");

        // 4- Assertion İşlemleri Yapılır.
        JsonPath resJP = response.jsonPath();

        assertEquals(response.getStatusCode(), JPHDatas.basariliStatusCode);
        assertEquals(response.getContentType(), JPHDatas.ContentType);
        assertEquals(response.getHeader("Connection"), JPHDatas.ConnectionHeader);

        assertEquals(resJP.get("title"), expBody.get("title"));
        assertEquals(resJP.get("body"), expBody.get("body"));
        assertEquals(resJP.get("userId"), expBody.get("userId"));
        assertEquals(resJP.get("id"), expBody.get("id"));
    }
}
