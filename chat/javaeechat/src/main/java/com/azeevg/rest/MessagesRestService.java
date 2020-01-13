package com.azeevg.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/messages")
public class MessagesRestService {
    @GET
    @Path("/{userId}")
    public Response getMessages(@PathParam("userId") String userId) {
        return Response.ok("{}", MediaType.APPLICATION_JSON).build();
    }
}
