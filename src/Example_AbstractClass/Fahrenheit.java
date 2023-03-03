package Example_AbstractClass;

public class Fahrenheit extends Temperature {

    public Fahrenheit(double degrees) {
        super(degrees);
    }

    @Override
    protected double getKelvinDegrees() {
        return (degrees - 32) * 5 / 9.0 + 273.15;
    }

    @Override
    protected String getUnitDisplayName() {
        return "°F";
    }
}
