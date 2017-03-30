package org.example.ipaas;

public class Suggestion {

    private String order;
    private OrderDetail detail;
    private TradeContext context;

    public Suggestion() {

    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public OrderDetail getDetail() {
        return detail;
    }

    public void setDetail(OrderDetail detail) {
        this.detail = detail;
    }

    public TradeContext getContext() {
        return context;
    }

    public void setContext(TradeContext context) {
        this.context = context;
    }

}

class OrderDetail {
    private int targetPrice;
    private int numShares;

    public OrderDetail() {

    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getNumShares() {
        return numShares;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }
}

class TradeContext {
    private int confidenceScore;
    private String tradeWindowStart;
    private String tradeWindowEnd;

    public TradeContext() {

    }

    public int getConfidenceScore() {
        return confidenceScore;
    }

    public void setConfidenceScore(int confidenceScore) {
        this.confidenceScore = confidenceScore;
    }

    public String getTradeWindowStart() {
        return tradeWindowStart;
    }

    public void setTradeWindowStart(String tradeWindowStart) {
        this.tradeWindowStart = tradeWindowStart;
    }

    public String getTradeWindowEnd() {
        return tradeWindowEnd;
    }

    public void setTradeWindowEnd(String tradeWindowEnd) {
        this.tradeWindowEnd = tradeWindowEnd;
    }
}
