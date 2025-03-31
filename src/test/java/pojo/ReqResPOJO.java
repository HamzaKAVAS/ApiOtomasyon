package pojo;

public class ReqResPOJO {

    /*
       {
         "name": "John Doe",
         "job": "Manager"
       }
    */

    // 1- Tüm variable'lar private olarak oluşturulur.
    private String name;
    private String job;

    // 2- Tüm variable'lar için getter and setter olusturuyoruz.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // 3- Tüm variable'ları içeren parametreli constructor oluşturuyoruz.
    public ReqResPOJO(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
