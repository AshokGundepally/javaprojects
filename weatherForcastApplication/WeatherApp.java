import java.io.IOException;
import java.util.Scanner;
public class WeatherApp {
    // javac -cp .;json-20251224.jar *.java
    // java -cp .;json-20251224.jar WeatherApp
    public static void main(String[] args) {
        Weather weather = new Weather();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter city name:");
            String city = sc.nextLine();
            String forecast = weather.getForecast(city);
            JsonParser parser = new JsonParser();
            parser.parse(forecast, city);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sc.close();
        }
    }
}