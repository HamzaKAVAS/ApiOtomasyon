package testDatas;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JPHDatas {

    public static int basariliStatusCode = 200;
    public static String ContentType = "application/json; charset=utf-8";
    public static String ConnectionHeader = "keep-alive";

    public static JSONObject expData() {
        JSONObject expBody = new JSONObject();
        expBody.put("userId", 3);
        expBody.put("id", 22);
        expBody.put("title", "dolor sint quo a velit explicabo quia nam");
        expBody.put("body", "eos qui et ipsum ipsam suscipit aut\n" +
                "sed omnis non odio\n" +
                "expedita earum mollitia molestiae aut atque rem suscipit\n" +
                "nam impedit esse");

        return expBody;
    }

    public static JSONObject expDataParametreli(int userId, int id, String title, String body) {
        JSONObject expBody = new JSONObject();
        expBody.put("userId", userId);
        expBody.put("id", id);
        expBody.put("title", title);
        expBody.put("body", body);

        return expBody;
    }

    public static JSONObject expDataScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Gerekli Bilgileri Giriniz=====");

        System.out.print("userId: ");
        int userId = scanner.nextInt();
        System.out.print("id: ");
        int id = scanner.nextInt();
        System.out.print("title: ");
        String title = scanner.nextLine();
        System.out.print("body: ");
        String body = scanner.nextLine();

        JSONObject expBody = new JSONObject();
        expBody.put("userId", userId);
        expBody.put("id", id);
        expBody.put("title", title);
        expBody.put("body", body);

        return expBody;
    }

    /*
       Response Body
         {
           "title": "Talip",
           "body": "Bozlagan",
           "userId": 5,
           "id": 7
         }
    */

    public static JSONObject jsonData() {
        JSONObject jsonData = new JSONObject();
        jsonData.put("title", "Talip");
        jsonData.put("body", "Bozlagan");
        jsonData.put("userId", 5);
        jsonData.put("id", 7);

        return jsonData;
    }

    public static JSONObject jsonDataParametreli(String title, String body, int userId, int id) {
        JSONObject jsonData = new JSONObject();
        jsonData.put("title", title);
        jsonData.put("body", body);
        jsonData.put("userId", userId);
        jsonData.put("id", id);

        return jsonData;
    }

    public static Map<String,Object> mapDataOlustur(){
        Map<String,Object> reqMap = new HashMap<>();
        reqMap.put("userId",10.0);
        reqMap.put("title","Ahmet");
        reqMap.put("body","Merhaba");
        reqMap.put("id",70.0);

        return reqMap;
    }
}
