public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu vn = keeper.getNonVegMenu();
        Both b = keeper.getVegNonMenu();

    }
}
