package recap;

import baseUrl.ReqResBaseUrl;
import org.junit.jupiter.api.Test;

public class P06_DELETE extends ReqResBaseUrl {

    /*
       https://reqres.in/api/users/57 URL'sine bir DELETE isteği gönderin.
       Gelen yanıtın durum kodunun 204 olduğunu doğrulayın.
    */

    @Test
    public void deleteTest(){
        // 1- EndPoint Hazırlanır.
        specReqRes.pathParams("pp1","api","pp2","users","pp3",57);
    }
}
