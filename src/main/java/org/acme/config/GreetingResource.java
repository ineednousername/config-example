package org.acme.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.MessageFormat;

@Path("/greeting")
public class GreetingResource {

    @Inject
    GreetingConfiguration configuration;

    @Inject
    OtherConfiguration other;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return configuration.build();
    }

    @Path(value = "/other")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String other() {
        return  other.build();
    }
}
