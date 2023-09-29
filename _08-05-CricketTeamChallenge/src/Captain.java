public class Captain {

    private int data = 0;

    private Captain() {
        System.out.println("New Captain selected for our team");
    }

    private static class singletonHelper {
        private static final Captain onlyCaptain = new Captain();
    }

    public static Captain getCaptain() {
        System.out.println("Trying to make a Captain for our team");
        return singletonHelper.onlyCaptain;
    }

}
