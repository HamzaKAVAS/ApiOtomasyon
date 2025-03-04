package tests;

import org.testng.annotations.Test;

public class P11_GET_ResponseBodyTestListKullanimi {

    /*
       https://api.collectapi.com/health/dutyPharmacy?il=Kırıkkale url'ine bir GET request yolladigimizda
       donen Response'in
       status code'unun 200,
       ve content type'inin application/json,
       ve response body'sindeki
       eczane sayısıın sayisinin 4
       ve eczane'lerden birinin "ENES ECZANESİ"
       ve eczanele ilçelerinde icinde Merkez ,Delice ve Keskin degerinin oldugunu test edin.
    */

    @Test
    public void test(){
        // 1- EndPoint Hazırlama
        String url = "https://api.collectapi.com/health/dutyPharmacy?il=Kırıkkale";
        String apiKey = "apikey 7oz12GLMsEHKccL5kM3kah:5t9yvaRbrmIzEjsWljC330";


    }
}
