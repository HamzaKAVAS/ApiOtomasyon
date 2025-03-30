package recap;

import baseUrl.ReqResBaseUrl;
import org.junit.jupiter.api.Test;

public class P03_POST_ApiSorgusu extends ReqResBaseUrl {

    /*
       https://reqres.in/api/users URL'sine
       header derğeri "Content-Type", "application/json" olan bir POST isteği gönderin.
       İstek için JSON formatında şu bilgileri içeren bir body kullanın:
         { "name": "morpheus",
           "job": "leader" }
       Gelen yanıtın durum kodunun 201 olduğunu doğrulayın.
       Yanıtın JSON body'sinde name alanının morpheus olduğunu kontrol edin.
    */

    @Test
    public void postApiSorgusuTest(){
        // 1- EndPoint ve ReqBody Hazırlanır.
        specReqRes.pathParams("pp1","api","pp2","users");

    }
}
