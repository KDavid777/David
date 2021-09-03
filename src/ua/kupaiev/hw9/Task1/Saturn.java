package src.ua.kupaiev.hw9.Task1;

public class Saturn implements Planet {
    protected boolean water = false;
    protected boolean oxygen = false;
    double accelerationOfGravity = 10.44;

    public void rings() {
        System.out.println("Эта планета имеет кольца ");
    }

    ;

    public void weight () {
        int weight = 5680;
    }


    public void age() {
        System.out.println("4,5682±0,0006 млрд лет ");

    }


    public void averageTemperature() {
        System.out.println("Температура планеты Сатурн : -140°C ");

    }

    @Override
    public double getAccelerationOfGravity() {
        return accelerationOfGravity;
    }
}
