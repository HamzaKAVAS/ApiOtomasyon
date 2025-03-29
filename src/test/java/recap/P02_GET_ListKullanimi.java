package recap;

import baseUrl.ReqResBaseUrl;

public class P02_GET_ListKullanimi extends ReqResBaseUrl {

    /*
       https://reqres.in/api/users?page=2 URL'sine bir GET isteği gönderin.
       Gelen yanıtın durum kodunun 200 olduğunu doğrulayın.
       Liste içerisindeki kullanıcı sayısının en az 1 olduğunu doğrulayın.
       İlk kullanıcının email adresinin boş olmadığını kontrol edin.
    */

    public void test(){
        // 1- Endpoint Hazırlanır.
        specReqRes.pathParams("pp1","api","pp2","users").queryParams("page",2);

        // 2- Expected Body Yok.
    }
}
