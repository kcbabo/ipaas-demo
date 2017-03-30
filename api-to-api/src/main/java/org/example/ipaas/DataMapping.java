package org.example.ipaas;

public class DataMapping {

    public Trade map(Suggestion suggestion) {
        Trade trade = new Trade();
        trade.setAction(suggestion.getOrder().split(" ")[0]);
        trade.setTicker(suggestion.getOrder().split(" ")[1]);
        trade.setQuantity(suggestion.getDetail().getNumShares());
        trade.setLimit(suggestion.getDetail().getTargetPrice());
        trade.setExpiration(suggestion.getContext().getTradeWindowEnd());
        return trade;
    }
}
