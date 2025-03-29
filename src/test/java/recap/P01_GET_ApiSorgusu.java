package recap;

import org.testng.annotations.Test;

public class P01_GET_ApiSorgusu {

    /*
       https://reqres.in/api/users/2 URL'sine bir GET isteği gönderin.
       Gelen yanıtın durum kodunun 200 olduğunu doğrulayın.
       Yanıtın JSON body'sinde yer alan data.id değerinin 2 olduğunu doğrulayın.
       Yanıt süresinin 2 saniyeden kısa olduğunu kontrol edin.
    */

    @Test
    public void test(){
        // 1- Endpoint Hazırlanır
        String url = "https://reqres.in/api/users/2";

    }
}
