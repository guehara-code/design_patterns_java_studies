public interface Animal {
    void talk();
}

class Tiger implements Animal {

    @Override
    public void talk() {
        System.out.println("Arrrhhhhh....");
    }
}


class Duck implements Animal {

    @Override
    public void talk() {
        System.out.println("Quack quack....");
    }
}
