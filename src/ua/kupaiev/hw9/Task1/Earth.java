package src.ua.kupaiev.hw9.Task1;

public class Earth implements Planet {
    protected boolean water = true;
    protected boolean oxygen = true;
    double accelerationOfGravity = 9.8;

    public void weight () {
        int weight = 59;
        System.out.println(weight);
    }

    public void age() {
        System.out.println("4,5682±0,0006 млрд лет ");
    }

    public void averageTemperature() {
        System.out.println("Температура планеты Земля : +15°C ");

    }

    @Override
    public double getAccelerationOfGravity() {
        return accelerationOfGravity;
    }
}
