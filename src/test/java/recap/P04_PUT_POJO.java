package recap;

import baseUrl.ReqResBaseUrl;
import org.junit.jupiter.api.Test;
import pojo.ReqResPOJO;

public class P04_PUT_POJO extends ReqResBaseUrl {

    /*
       https://reqres.in/api/users/2 URL'sine header değeri "Content-Type","application/json" olan bir PUT isteği gönderin.
       Kullanıcıyı şu şekilde güncelleyin:
         {
           "name": "John Doe",
           "job": "Manager"
         }
       Yanıtın durum kodunun 200 olduğunu doğrulayın ve name alanının John Doe olduğunu doğrulayın.
    */

    @Test
    public void putPojoTest(){
        // 1- EndPoint ve ReqBody Hazırlanır.
        specReqRes.pathParams("pp1","api","pp2","users","pp3",2);
        ReqResPOJO reqBody = new ReqResPOJO("John Doe","QA Tester");

        // 2- ExpBody Yok.
    }
}
