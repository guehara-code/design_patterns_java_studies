import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");


        Robot shape = null;

      // Here we are trying to get 3 king type robots

        for(int i=0; i<3; i++) {
            shape = (Robot)myFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        // Here we are trying to get 3 queen type robots

        for(int i=0; i<3; i++) {
            shape = (Robot)myFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int NumOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\n Finally number of Distinct Robot objects created: " + NumOfDistinctRobots);
    }

    static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if(random%2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
