package testDatas;

import org.json.JSONObject;

public class JPHDatas {

    public static int basariliStatusCode = 200;

    public static JSONObject expData(){
        JSONObject expBody = new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut sed omnis non odio expedita earum mollitia molestiae aut atque rem suscipit nam impedit esse");

        return expBody;
    }
}
