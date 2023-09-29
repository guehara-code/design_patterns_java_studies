public class Main {
    public static void main(String[] args) {

        Captain captain = Captain.getCaptain();


        Captain captain2 = Captain.getCaptain();

        if(captain == captain2) {
            System.out.println("You already hava a Captain for your team. Send him for the toss.");
            System.out.println("c1 and c2 are same instance.");
        }

    }
}