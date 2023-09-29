public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buidBody();
        myBuilder.insertWheels();
        myBuilder.addHeadLights();
    }
}
