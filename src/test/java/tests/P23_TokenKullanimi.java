package tests;

import baseUrl.RESTFULL_BaseUrl;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class P23_TokenKullanimi extends RESTFULL_BaseUrl {

    /*
       https://restful-booker.herokuapp.com/booking/3170 (id güncellenmeli)
       adresindeki rezervasyon bilgilerini
       -H 'Content-Type: application/json' \
       -H 'Accept: application/json' \
       -H 'Cookie: token=abc123' \ veya -H 'Authorization:Basic YWRtaW46cGFzc3dvcmQxMjM=' \
       header değerleriyle PUT request göndererek update ediniz.

       Token Oluşturma
       Content-Type: application/json header derğeriyle aşağıdaki body ile
       {
         "username" : "admin",
         "password" : "password123"
       }
       Post Request yapınız
    */

    static String token;

    @Test
    public void createToken(){
        // 1- EndPoint Hazırlanır
        specRestFull.pathParam("pp1","auth");
        JSONObject data = new JSONObject();
        data.put("username", "admin");
        data.put("password", "password123");
    }
}
