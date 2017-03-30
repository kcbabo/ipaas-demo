package org.example.ipaas;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Path("/trade-insight")
@Service
public interface TradingInsight {

	@GET
    @Path("buy")
    @Produces(MediaType.APPLICATION_JSON)
    Suggestion getBuySuggestion();
	
	@GET
    @Path("sell")
    @Produces(MediaType.APPLICATION_JSON)
    Suggestion getSellSuggestion();
	
	@GET
    @Path("top")
    @Produces(MediaType.APPLICATION_JSON)
    Suggestion getTopSuggestion();
	
}
