import javax.sound.sampled.Port;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorcycleBuilder = new MotorCycle();

        // making a car
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        // making a motorcycle
        director.construct(motorcycleBuilder);
        Product p2 = motorcycleBuilder.getVehicle();
        p2.show();
    }
}
