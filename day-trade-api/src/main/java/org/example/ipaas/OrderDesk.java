package org.example.ipaas;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Path("/orders")
@Service
public interface OrderDesk {

    // Place a trade
    @POST
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    void placeTrade(Trade trade);

    // Get most recent trade
    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    Trade getTrade();
    
    // Get a specific trade
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Trade getTrade(@PathParam("id") String id);
}
