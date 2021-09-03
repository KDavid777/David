package src.ua.kupaiev.hw9.Task1;

public class Mars implements Planet {
    protected boolean water = false;
    protected boolean oxygen = false;
    double accelerationOfGravity = 3.86;

    public void weight () {
        int weight = 6;
    }


    public void age() {
        System.out.println("4,5682±0,0006 млрд лет ");
    }


    public void averageTemperature() {
        System.out.println("Температура планеты Марс : -30°C ");
    }


    @Override
    public double getAccelerationOfGravity() {
        return accelerationOfGravity;
    }
}
