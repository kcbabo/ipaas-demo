package org.example.ipaas;

import java.util.Calendar;

public class TradingInsightBean implements TradingInsight {

    @Override
    public Suggestion getBuySuggestion() {
        return buyData();
    }

    @Override
    public Suggestion getSellSuggestion() {
        return sellData();
    }

    @Override
    public Suggestion getTopSuggestion() {
        return topData();
    }

    private Suggestion buyData() {
        Suggestion buy = new Suggestion();
        buy.setOrder("BUY BABO");
        TradeContext tc = new TradeContext();
        tc.setConfidenceScore(10);
        Calendar window = Calendar.getInstance();
        tc.setTradeWindowStart(window.getTime().toString());
        window.add(Calendar.HOUR, 5);
        tc.setTradeWindowEnd(window.getTime().toString());
        OrderDetail order = new OrderDetail();
        order.setNumShares(1000);
        order.setTargetPrice(10);
        buy.setContext(tc);
        buy.setDetail(order);
        return buy;
    }

    private Suggestion sellData() {
        Suggestion buy = new Suggestion();
        buy.setOrder("SELL TODD");
        TradeContext tc = new TradeContext();
        tc.setConfidenceScore(2);
        Calendar window = Calendar.getInstance();
        tc.setTradeWindowStart(window.getTime().toString());
        window.add(Calendar.MINUTE, 30);
        tc.setTradeWindowEnd(window.getTime().toString());
        OrderDetail order = new OrderDetail();
        order.setNumShares(50);
        order.setTargetPrice(85);
        buy.setContext(tc);
        buy.setDetail(order);
        return buy;
    }

    private Suggestion topData() {
        Suggestion buy = new Suggestion();
        buy.setOrder("BUY JAMS");
        TradeContext tc = new TradeContext();
        tc.setConfidenceScore(6);
        Calendar window = Calendar.getInstance();
        tc.setTradeWindowStart(window.getTime().toString());
        window.add(Calendar.MINUTE, 5);
        tc.setTradeWindowEnd(window.getTime().toString());
        OrderDetail order = new OrderDetail();
        order.setNumShares(750);
        order.setTargetPrice(15);
        buy.setContext(tc);
        buy.setDetail(order);
        return buy;
    }
}
