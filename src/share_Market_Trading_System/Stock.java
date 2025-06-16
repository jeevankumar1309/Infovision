package share_Market_Trading_System;

public class Stock {
	
	    private String stockId;
	    private String stockName;
	    private double pricePerShare;
	    private int availableShares;

	    public Stock(String stockId, String stockName, double pricePerShare, int availableShares) {
	        this.stockId = stockId;
	        this.stockName = stockName;
	        this.pricePerShare = pricePerShare;
	        this.availableShares = availableShares;
	    }

	    public synchronized void updateShares(int quantity) {
	        this.availableShares += quantity;
	    }

	    public String getStockId() { return stockId; }
	    public String getStockName() { return stockName; }
	    public double getPricePerShare() { return pricePerShare; }
	    public int getAvailableShares() { return availableShares; }
	}



