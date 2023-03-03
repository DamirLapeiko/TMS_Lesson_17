package Example_AbstractClass;

public class Kelvin extends Temperature {

    public Kelvin(double degrees) {
        super(degrees);
    }

    @Override
    protected double getKelvinDegrees() {
        return degrees;
    }

    @Override
    protected String getUnitDisplayName() {
        return "K";
    }
}
