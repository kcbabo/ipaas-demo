package org.example.ipaas;

import io.swagger.annotations.Api;

@Api("/apis")
public class OrderDeskBean implements OrderDesk {

    @Override
    public void placeTrade(Trade trade) {
        System.out.println("\n[Order Desk] placing trade order ...\n " + trade);
    }

    @Override
    public Trade getTrade() {
        return new Trade("RHT", 1000, "BUY", 80, "");
    }

    @Override
    public Trade getTrade(String id) {
        return new Trade("RHT", 1000, "BUY", 80, "");
    }

}
