package org.acme.resteasy;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    @ConfigProperty(name = "org.acme.greeting.suffix",defaultValue = "!!")
    String suffix;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello PVH" + suffix;
    }
}