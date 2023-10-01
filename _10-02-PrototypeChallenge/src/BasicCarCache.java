import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> basicCarMap = new Hashtable<String,BasicCar>();

    public static BasicCar getCar(String carName) {
        BasicCar cachedBasicCar = basicCarMap.get(carName);
        return (BasicCar) cachedBasicCar.clone();
    }

    public static void loadCache() {
        BasicCar nano_basic = new Nano("Green Nano");
        nano_basic.price = 100000;
        basicCarMap.put("Green Nano", nano_basic);

        BasicCar ford_basic = new Ford("Ford Yellow");
        ford_basic.price = 500000;
        basicCarMap.put("Ford Yellow", ford_basic);
    }

}
