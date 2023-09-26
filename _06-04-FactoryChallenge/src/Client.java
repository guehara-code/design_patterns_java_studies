public class Client {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactoryOfType.getAnimal("TIGER");
        animal1.talk();

        Animal animal2 = AnimalFactoryOfType.getAnimal("DUCK");
        animal2.talk();
    }
}
