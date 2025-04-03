package recap;

import baseUrl.OpenWeatherBaseUrl;
import org.junit.jupiter.api.Test;

public class P07_GET_OpenWeather extends OpenWeatherBaseUrl {

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
        // 1- EndPoint Hazırlanır.
        specOpenWeather.pathParams("pp1","data","pp2",2.5,"pp3","weather")
                .queryParams("q","Istanbul","appid",myApiKey);

        // 2- Expected Body Yok.
    }
}
