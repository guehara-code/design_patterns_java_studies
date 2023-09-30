public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

abstract class Burguer implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}

class VegBurguer extends Burguer {
    @Override
    public float price() {
        return 3.50f;
    }
    @Override
    public String name() {
        return "Veg Burguer";
    }

}

class ChickenBurguer extends Burguer {
    @Override
    public float price() {
        return 4.50f;
    }
    @Override
    public String name() {
        return "Chicker Burguer";
    }
}

abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 1.50f;
    }
    @Override
    public String name() {
        return "Pepsi";
    }
}

class Coke extends ColdDrink {
    @Override
    public float price() {
        return 1.75f;
    }
    @Override
    public String name() {
        return "Coke";
    }
}

interface Packing {
    public String pack();
}

class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wapper";
    }
}

class Bottle implements Packing {
    @Override
    public String pack(){
        return "Bottle";
    }
}