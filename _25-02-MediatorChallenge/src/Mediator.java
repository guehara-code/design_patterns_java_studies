import java.util.ArrayList;

interface Mediator {
    public void addBuyer(Buyer buyer);
    public void findHighestBidder();
}

class AuctionMediator implements Mediator {
    // this class implements mediator interface and holds all the buyers in
    // an arraylist. We can add buyers and find the highest bidder
    private ArrayList buyers;

    public AuctionMediator() {
        buyers = new ArrayList<AuctionBuyer>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for(Object a : buyers) {
            AuctionBuyer b = (AuctionBuyer) a;
            if(b.price > maxBid) {
                maxBid = b.price;
                winner = b;
            }
            b.auctionHasEnded();
        }
        System.out.println("The auction winner is " + winner.name + ". He paid " + winner.price + "$ for the item.");
    }
}