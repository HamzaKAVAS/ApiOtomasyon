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

    // 3- Tüm variable'ları içeren parametreli constructor oluşturuyoruz.
    public PojoJPH(String title, String body, int userId, int id) {
        this.title = title;
        this.body = body;
        this.userId = userId;
        this.id = id;
    }

    // 4- Default constructor öldüğü için onun işlevini yapacak bir parametresiz constructor oluşturalım.
    public PojoJPH() {
    }

    // 5- Verileri yazdırma durumunda ihtiyaç olursa diye toString methodu da eklenir.
    @Override
    public String toString() {
        return "==========PojoJPH==========" + "\n" +
                "title: " + title + "\n" +
                "body: " + body + "\n" +
                "userId: " + userId + "\n" +
                "id: " + id;
    }
}
