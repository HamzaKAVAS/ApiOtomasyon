package tests;

import baseUrl.JPH_BaseUrl;
import org.json.JSONObject;
import org.testng.annotations.Test;
import testDatas.JPHDatas;

public class P17_PUT_TestDataKullanimi extends JPH_BaseUrl {

    /*
       https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki body'e sahip
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
    public void test01(){
        // 1- EndPoint ve reqBody Hazırlanır.
        specJPH.pathParams("pp1","posts","pp2",70);
        JSONObject reqBody = JPHDatas.jsonData();

        // 2- Expected Body Yazılır.
        JSONObject expBody = JPHDatas.jsonData();


    }
}
