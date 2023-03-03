package Example_AbstractClass;

public abstract class Temperature {
    protected final double degrees;

    public Temperature(double degrees) {
        this.degrees = degrees;
    }

    public final int compareTo(Temperature another) {
        double kelvinDegrees = another.getKelvinDegrees();
        double diff = this.getKelvinDegrees() - kelvinDegrees;
        if (diff < 0) {
            return -1;
        } else if (diff > 1){
            return 1;
        } else {
            return 0;
        }
    }

    public boolean isWarmer(Temperature another){
        return this.compareTo(another) > 0;
    }
    public boolean isColder(Temperature another){
        return this.compareTo(another) < 0;
    }

    @Override
    public String toString() {
        return degrees + getUnitDisplayName();
    }

    public String toIntegerString(){
        return Math.round(degrees) + getUnitDisplayName();
    }

    protected abstract double getKelvinDegrees();
    protected abstract String getUnitDisplayName();
}
