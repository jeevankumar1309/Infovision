package share_Market_Trading_System;

public class Share_Market_APP {

	public static void main(String[] args) {
		
		
		        Market market = new Market();
		        market.addStock(new Stock("ST1", "Nippon_paint LTD", 100.0, 50));
		        market.addStock(new Stock("ST2", "GoldBees LTD", 150.0, 30));

		        Trader t1 = new Trader("T1", "Jeevan", market);
		        Trader t2 = new Trader("T2", "Kumar", market);

		        TraderThread thread1 = new TraderThread(t1);
		        TraderThread thread2 = new TraderThread(t2);

		        thread1.start();
		        thread2.start();

		        try {
		            thread1.join();
		            thread2.join();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        t1.printPortfolio();
		        t2.printPortfolio();
		    }
		
	}


