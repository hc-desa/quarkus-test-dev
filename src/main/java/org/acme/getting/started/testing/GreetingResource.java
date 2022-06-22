package org.acme.getting.started.testing;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/param/{name}")
    public String greeting(String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Test Quarkus\n";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/data}")
    public String dataJson() {
        return "{ \"message\": \"Json MESSAGE\"}";
    }
}