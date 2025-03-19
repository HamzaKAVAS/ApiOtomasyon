package testDatas;

import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class RestFullDatas {

    public static JSONObject JSONDataOlustur(){

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin","2021-06-01");
        bookingdates.put("checkout","2021-06-10");

        JSONObject reqBody = new JSONObject();
        reqBody.put("firstname","Ahmet");
        reqBody.put("lastname","Bulut");
        reqBody.put("totalprice",1500);
        reqBody.put("depositpaid",true);
        reqBody.put("bookingdates",bookingdates);
        reqBody.put("additionalneeds","wi-fi");

        return reqBody;
    }

    public static JSONObject bookingDatesOlustur2 (String checkin, String checkout){

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin",checkin);
        bookingdates.put("checkout",checkout);

        return bookingdates;
    }

    public static JSONObject reqBodyOlustur2 (String firstname, String lastname, int totalprice, boolean depositpaid, JSONObject bookingdates, String additionalneeds){

        JSONObject reqBody = new JSONObject();
        reqBody.put("firstname",firstname);
        reqBody.put("lastname",lastname);
        reqBody.put("totalprice",totalprice);
        reqBody.put("depositpaid",depositpaid);
        reqBody.put("bookingdates",bookingdates);
        reqBody.put("additionalneeds",additionalneeds);

        return reqBody;
    }

    public static Map<String,Object> mapDataOLustur(){
        Map<String,Object> innerMapBody = new HashMap<>();
        innerMapBody.put("checkin","2021-06-01");
        innerMapBody.put("checkout","2021-06-10");

        Map<String,Object> reqMapBody = new HashMap<>();
        reqMapBody.put("firstname","Ahmet");
        reqMapBody.put("lastname","Bulut");
        reqMapBody.put("totalprice",500.0);
        reqMapBody.put("depositpaid",true);
        reqMapBody.put("bookingdates",innerMapBody);
        reqMapBody.put("additionalneeds","wi-fi");

        return reqMapBody;
    }

    public static Map<String,Object> expMapDataOlustur(){
        Map<String, Object> expMapBody = new HashMap<>();
        expMapBody.put("bookingid",25);
        expMapBody.put("booking",mapDataOLustur());

        return expMapBody;
    }

}
