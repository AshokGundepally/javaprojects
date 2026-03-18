import org.json.JSONObject;
import org.json.JSONArray;
import java.text.SimpleDateFormat;
import java.util.Date;

class JsonParser{
    public void parse(String jsonResponse,String city){
        JSONObject jsonObject = new JSONObject(jsonResponse);
        // Parse the JSON response and extract weather information for the specified city
       
        if(jsonObject.getInt("cod") == 200){
           System.out.println("Weather forecast for " + city);
           JSONArray forecasts = jsonObject.getJSONArray("list");
           for(int i = 0;i<forecasts.length();i++){
               JSONObject forecast = forecasts.getJSONObject(i);
               long timestamp = forecast.getLong("dt");
               String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timestamp*1000));
               double temp = forecast.getJSONObject("main").getDouble("temp");
               int humidity = forecast.getJSONObject("main").getInt("humidity");
               String description = forecast.getJSONArray("weather").getJSONObject(0).getString("description");
               System.out.println("Date: " + date + ", Temperature: " + temp + "°C, Humidity: " + humidity + "%, Description: " + description);
           }
        }else {
            System.out.println("Error fetching weather data: " + jsonObject.getString("message"));
        }
    }
}