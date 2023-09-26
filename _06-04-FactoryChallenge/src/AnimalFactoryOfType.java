public class AnimalFactoryOfType {
    public static Animal getAnimal(String animalType) {
        if(animalType == null) {
            return null;
        } else if(animalType.equalsIgnoreCase("TIGER")) {
            return new Tiger();
        } else if(animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();
        }
        return null;
    }
}
