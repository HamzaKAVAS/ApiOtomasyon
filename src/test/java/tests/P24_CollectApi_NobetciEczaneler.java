package tests;

import baseUrl.CollectApiBaseUrl;
import org.testng.annotations.Test;

public class P24_CollectApi_NobetciEczaneler extends CollectApiBaseUrl {

    /*
       https://api.collectapi.com/health/dutyPharmacy?il=Istanbul&ilce=Üsküdar
       adresine asağıdaki bilgilerle bir GET request yapınca
       dönen cevabı yazdırınız.

       header
       Content-Type : application/json
       Authorization : apikey 7oz12GLMsEHKccL5kM3kah:5t9yvaRbrmIzEjsWljC330
    */

    @Test
    public void test01(){
        // 1- Endpoint Hazırlanması
        specCollectApi.pathParams("pp1", "health", "pp2", "dutyPharmacy")
                .queryParams("il", "Istanbul", "ilce", "Üsküdar");
    }
}
