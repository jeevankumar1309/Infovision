package share_Market_Trading_System;

import java.util.*;

public class Trader implements Tradeable {
	
    private String traderId;
    private String name;
    private Market market;
    private Map<String, Integer> portfolio = new HashMap<>();

    public Trader(String traderId, String name, Market market) {
        this.traderId = traderId;
        this.name = name;
        this.market = market;
    }

    @Override
    public void buyStock(String stockId, int quantity)
            throws StockNotFoundException, InsufficientMarketSharesException {
        Stock stock = market.getStock(stockId);
        synchronized (stock) {
            if (stock.getAvailableShares() < quantity) {
                throw new InsufficientMarketSharesException("Not enough shares in market for " + stockId);
            }
            stock.updateShares(-quantity);
        }
        portfolio.put(stockId, portfolio.getOrDefault(stockId, 0) + quantity);
        System.out.println(name + " bought " + quantity + " of " + stockId);
    }

    @Override
    public void sellStock(String stockId, int quantity)
            throws StockNotFoundException, InsufficientSharesException {
        if (!portfolio.containsKey(stockId) || portfolio.get(stockId) < quantity) {
            throw new InsufficientSharesException("Not enough shares to sell for " + stockId);
        }
        Stock stock = market.getStock(stockId);
        synchronized (stock) {
            stock.updateShares(quantity);
        }
        portfolio.put(stockId, portfolio.get(stockId) - quantity);
        System.out.println(name + " sold " + quantity + " of " + stockId);
    }

    public void printPortfolio() {
        System.out.println("Portfolio of " + name + ": " + portfolio);
    }
}

