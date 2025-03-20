package tests;

import baseUrl.JPH_BaseUrl;
import org.testng.annotations.Test;
import pojo.PojoJPH;

public class P21_PUT_PojoClass extends JPH_BaseUrl {

    /*
       https://jsonplaceholder.typicode.com/posts/70 url'ine
       asagidaki body'e sahip bir PUT request yolladigimizda
       donen response'in response body'sinin
       asagida verilen ile ayni oldugunu test ediniz

       Request Body
       {
         "title": "Ahmet",
         "body": "Merhaba",
         "userId": 10,
         "id": 70
       }

       Expected Data :
       {
         "title": "Ahmet",
         "body": "Merhaba",
         "userId": 10,
         "id": 70
       }
    */

    @Test
    public void pojoPutTest(){
        // 1- Endpoint ve reqBody Hazırlanması
        specJPH.pathParams("pp1","posts","pp2",70);
        PojoJPH reqPojo = new PojoJPH("Hadi","Korkmaz",10,70);
    }
}
