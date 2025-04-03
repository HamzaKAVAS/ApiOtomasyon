package recap;

import org.junit.jupiter.api.Test;

public class P07_GET_OpenWeather {

    /*
       Endpoint: https://api.openweathermap.org/data/2.5/weather?q=Istanbul&appid=YOUR_API_KEY
       HTTP Metodu: GET
       Senaryo:
       Bu endpoint'e bir GET request gönderdiğimizde dönen Response’un:
       Status code’unun 200,
       Content-Type’ının application/json; charset=utf-8,
       Response Body’sinde "name" alanının "Istanbul" olduğunu,
       Response Body’sinde "main.temp" değerinin -50 ile 50 arasında olduğunu test ediniz.
    */

    static String myApiKey = "89057ad0892940ef7b7f932cab562fbd";

    @Test
    public void openWeatherTest(){

    }
}
