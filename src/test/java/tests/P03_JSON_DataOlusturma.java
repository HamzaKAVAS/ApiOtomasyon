package tests;

import org.json.JSONObject;
import org.junit.Test;

public class P03_JSON_DataOlusturma {

    /*
       Asagidaki JSON Objesini olusturup konsolda yazdirin.
       {
         "title":"Ahmet",
         "body":"Merhaba",
         "userId":1
       }
    */

    @Test
    public void test01(){
        JSONObject data = new JSONObject();

        data.put("title","Ahmet");
        data.put("body","Merhaba");
        data.put("userId",1);

        System.out.println(data);
        System.out.println("=======================================================================");
    }
}
