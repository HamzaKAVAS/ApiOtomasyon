package testDatas;

import org.json.JSONObject;

public class JPHDatas {

    public static int basariliStatusCode = 200;

    public static JSONObject expData(){
        JSONObject expBody = new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut\n" +
                "sed omnis non odio\n" +
                "expedita earum mollitia molestiae aut atque rem suscipit\n" +
                "nam impedit esse");

        return expBody;
    }

    public static JSONObject expDataParametreli(int userId, int id, String title, String body){
        JSONObject expBody = new JSONObject();
        expBody.put("userId",userId);
        expBody.put("id",id);
        expBody.put("title",title);
        expBody.put("body",body);

        return expBody;
    }
}
