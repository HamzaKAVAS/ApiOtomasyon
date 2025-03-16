package testDatas;

import org.json.JSONObject;

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

}
