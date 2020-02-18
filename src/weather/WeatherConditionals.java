package weather;

public class WeatherConditionals {
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;

        if(description.indexOf("windy") >= 0) {
            windy = true;
        }
        if(((description.indexOf("snow") >= 0) && temperature >= 33)) {
            return("It’s safe to go outside, 33 degrees and sunny.");
        }
        else if(((description.indexOf("sunny") >= 0) && temperature >= 34)) {
            return("It’s safe to go outside, 34 degrees and sunny.");
        }
        else if(((description.indexOf("snow") >= 0) && temperature > 100)) {
            return("Bruh Moment");
        }
        else {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
    }
}
