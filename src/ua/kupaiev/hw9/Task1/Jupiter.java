package src.ua.kupaiev.hw9.Task1;

public class Jupiter implements Planet {
    protected boolean water = false;
    protected boolean oxygen = false;
    double accelerationOfGravity = 24.79;

    public void weight () {
        int weight = 1900;
    }


    public void age() {
        System.out.println("4,5682±0,0006 млрд лет ");

    }


    public void averageTemperature() {
        System.out.println("Температура планеты Юпитер : -110°C ");

    }
    @Override
    public double getAccelerationOfGravity() {
        return accelerationOfGravity;
    }
}
