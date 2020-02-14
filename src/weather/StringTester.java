package weather;

public class StringTester {
    public static void main(String[] args) {
        String weatherCondition = "not available";

        System.out.println(weatherCondition.indexOf("thunder"));

        System.out.println(WeatherConditionals.getWeatherAdvice(32,"heavy snow"));
    }
}
