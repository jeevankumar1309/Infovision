package share_Market_Trading_System;

public class TraderThread extends Thread {
	
    private Trader trader;

    public TraderThread(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void run() {
        try {
            trader.buyStock("ST1", 5);
            trader.sellStock("ST1", 2);
            //trader.sellStock("ST1", 4);
        } catch (StockNotFoundException | InsufficientSharesException | InsufficientMarketSharesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

