package Example_AbstractClass;

public class Celsius extends Temperature {

    public Celsius(double degrees) {
        super(degrees);
    }

    @Override
    protected double getKelvinDegrees() {
        return degrees + 273.15;
    }

    @Override
    protected String getUnitDisplayName() {
        return "°C";
    }
}
