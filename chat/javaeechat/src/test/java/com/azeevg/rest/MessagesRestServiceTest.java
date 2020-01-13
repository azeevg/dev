package com.azeevg.rest;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MessagesRestServiceTest {

    @Test
    public void getMessages() {
        MessagesRestService service = new MessagesRestService();
        Response response = service.getMessages("id");

        Assert.assertEquals("Status code should be 200", 200, response.getStatus());
        Assert.assertEquals("application/json media type required", MediaType.APPLICATION_JSON, response.getMediaType().toString());
        Assert.assertEquals("{}", response.readEntity(String.class));
    }
}