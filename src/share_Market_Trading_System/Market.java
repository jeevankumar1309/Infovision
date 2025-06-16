package share_Market_Trading_System;

import java.util.*;

public class Market {
    private Map<String, Stock> stocks = new HashMap<>();

    public void addStock(Stock stock) {
        stocks.put(stock.getStockId(), stock);
    }

    public synchronized Stock getStock(String stockId) throws StockNotFoundException {
        if (!stocks.containsKey(stockId)) {
            throw new StockNotFoundException("Stock ID " + stockId + " not found.");
        }
        return stocks.get(stockId);
    }

    public Collection<Stock> getAllStocks() {
        return stocks.values();
    }
}

