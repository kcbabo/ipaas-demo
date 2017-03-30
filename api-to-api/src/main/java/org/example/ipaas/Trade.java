package org.example.ipaas;

public class Trade {

    private int limit;
    private String ticker;
    private int quantity;
    private String action;
    private String expiration;

    public Trade() {

    }

    public Trade(String ticker, int quantity, String action, int limit, String expiration) {
        this.limit = limit;
        this.ticker = ticker;
        this.quantity = quantity;
        this.action = action;
        this.expiration = expiration;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
    
    public String toString() {
        return "\nlimit   = " + limit
             + "\nticker  = " + ticker
             + "\nquantity  = " + quantity
             + "\nexpires = " + expiration
             + "\naction  = " + action;
    }
}
