package tests;

import org.json.JSONObject;
import org.junit.Test;

public class P06_POST_ResponseBodyTest {

    /*
       https://jsonplaceholder.typicode.com/posts url'ine
       asagidaki body ile bir POST request gonderdigimizde
         {
          "title":"API",
          "body":"API ogrenmek ne guzel",
          "userId":10,
         }
       donen Response'un,
       status code'unun 201,
       ve content type'inin application/json
       ve Response Body'sindeki,
       "title"'in "API" oldugunu
       "userId" degerinin 100'den kucuk oldugunu
       "body" nin "API" kelimesi icerdigini test edin.
    */

    @Test
    public void postResponseBodyTest(){
        // 1- EndPoint ve reqBody hazırlanır.
        String url = "https://jsonplaceholder.typicode.com/posts";

        JSONObject reqBody = new JSONObject();
        reqBody.put("title","API");
        reqBody.put("body","API ogrenmek ne guzel");
        reqBody.put("userId",10);

        // 2- Expected Data verilmemiş.


    }
}
