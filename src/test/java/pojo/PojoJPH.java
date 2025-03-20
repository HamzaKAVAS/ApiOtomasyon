package pojo;

public class PojoJPH {

    /*
       Request Body
       {
         "title": "Ahmet",
         "body": "Merhaba",
         "userId": 10,
         "id": 70
       }
    */

    // 1- Tüm variable'lar private olarak oluşturulur.
    private String title;
    private String body;
    private int userId;
    private int id;

    // 2- Tüm variable'lar için getter and setter olusturuyoruz. ( sağ tıkla --> generate --> getter and setter )
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
