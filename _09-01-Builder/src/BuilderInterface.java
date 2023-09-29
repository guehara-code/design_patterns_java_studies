import javax.sound.sampled.Port;

public interface BuilderInterface {
    void buidBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}

class Car implements BuilderInterface {
    private Product product = new Product();


    @Override
    public void buidBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buidBody() {
        product.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlights is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}