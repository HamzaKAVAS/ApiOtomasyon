package tests;

import baseUrl.RESTFULL_BaseUrl;
import org.testng.annotations.Test;

public class P15_HerOkuAppQueryParams extends RESTFULL_BaseUrl {

    /*
       https://restful-booker.herokuapp.com/booking endpointine
       gerekli Query parametrelerini yazarak
       "firstname" degeri "Josh" ve "lastname" degeri "Allen" olan rezervasyon oldugunu
       test edecek bir GET request gonderdigimizde,
       donen response'un status code'unun 200 oldugunu ve
       "Jim Jackson" ismine sahip en az bir booking oldugunu test edin
    */

    @Test
    public void test01(){
        // 1- EndPoint ve Query Hazırlanır.
        specRestFull.pathParam("pp1","booking").queryParams("firstname","Josh","lastname","Allen");

        // 2- Expected Body Yok.

    }
}
