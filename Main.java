import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws  IOException {
        String cityName = "Moscow";
        String cityCode = RequestHandler.detectCityId(cityName);
        String forecast = RequestHandler.getForecast(cityCode);

        System.out.println(cityName);
        System.out.println(RequestHandler.detectCityId(cityName));
        System.out.println(RequestHandler.getForecast(cityCode));
    }

}
