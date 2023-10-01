interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Goggle gobble");
    }

    public void fly() {
        System.out.println("I am flying");
    }
}
