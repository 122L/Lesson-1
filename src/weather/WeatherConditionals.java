package weather;

public class WeatherConditionals {
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        boolean snowy = false;
        boolean sunny = false;
        String result = "Unbelievable";

        if(description.indexOf("windy") >= 0) {
            windy = true;
        }
        if (description.indexOf("snow") >= 100) {
            return result;
        }
    }
}
