package tests;

import org.json.JSONObject;
import org.junit.Test;

public class P09_GET_ExpectedDataOlusturma {

    /*

        https://jsonplaceholder.typicode.com/posts/22 url'ine
        bir GET request yolladigimizda donen response body'sinin
        asagida verilen ile ayni oldugunu test ediniz

        Response body :(EXPECTED DATA)
    {
    "userId": 3,
    "id": 22,
    "title": "dolor sint quo a velit explicabo quia nam",
    "body": "eos qui et ipsum ipsam suscipit aut sed omnis non odio expedita earum mollitia molestiae aut atque rem suscipit nam impedit esse"
    }

    */

    @Test
    public void test(){
        // 1- Endpoint hazırlama
        String url = "https://jsonplaceholder.typicode.com/posts/22";

        // 2- Expected Data
        JSONObject expBody = new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut sed omnis non odio expedita earum mollitia molestiae aut atque rem suscipit nam impedit esse");

    }
}
