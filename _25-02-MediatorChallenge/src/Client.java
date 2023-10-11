public class Client {
    public static void main(String[] args) {
        AuctionMediator med = new AuctionMediator();

        AuctionBuyer b1 = new AuctionBuyer(med, "Jason");
        AuctionBuyer b2 = new AuctionBuyer(med, "Ian");
        AuctionBuyer b3 = new AuctionBuyer(med, "Myra");

        // Create and add buyers
        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight we are selling a vacation to Vegas. Please bid your offers. ");
        System.out.println("-------------------------------");

        System.out.println("Waiting for the buyer's offers...");

        // Making bids
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("--------------------------------");
        med.findHighestBidder();

        b2.cancelTheBid();
        System.out.println(b2.name + " has canceled his bid! In this case ");

        med.findHighestBidder();
    }
}
