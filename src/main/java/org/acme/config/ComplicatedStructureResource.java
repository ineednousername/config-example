package org.acme.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.MessageFormat;

@Path("/greeting/complex")
public class ComplicatedStructureResource {

    @Inject
    ContainerConfig configuration;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return  configuration.getConfiguration().build();
    }

    @Path(value = "/other")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String other() {
        return  configuration.getOther().build();
    }
}
