import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
import java.net.URL;
public class Weather {
    private final String API_KEY = "your_api_key";
    private final String BASE_URL = "http://api.openweathermap.org/data/2.5/forecast";

    public String getForecast(String city) throws IOException {
        String apiUrl = BASE_URL + "?q=" + java.net.URLEncoder.encode(city, "UTF-8")+"&appid="+ API_KEY+"&units=metric";
        URL url = URI.create(apiUrl).toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null){
            response.append(line);
        }
        reader.close();
        return response.toString();
    }
}
