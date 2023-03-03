package Example_AbstractClass;

public class TemperatureMain {
    private static final Temperature WATER_FREEZING_TEMPERATURE = new Celsius(0);
    public static void main(String[] args) {
        Temperature temperature1 = new Kelvin(274);
        Temperature temperature2 = new Kelvin(273);
        Temperature temperature3 = new Celsius(3);
        Temperature temperature4 = new Celsius(-5);
        Temperature temperature5 = new Fahrenheit(50);

        System.out.println(getDisplayForecast(temperature1)); //На улице 274К тепла
        System.out.println(getDisplayForecast(temperature2)); //На улице 273К мороза
        System.out.println(getDisplayForecast(temperature3)); //На улице 3°C тепла
        System.out.println(getDisplayForecast(temperature4)); //На улице -5°C мороза
        System.out.println(getDisplayForecast(temperature5)); //На улице 50°F тепла
    }

    public static String getDisplayForecast(Temperature temperature){
        return "На улице " + temperature.toIntegerString()
                + (temperature.isWarmer(WATER_FREEZING_TEMPERATURE) ? " тепла" : " мороза");
    }
}
