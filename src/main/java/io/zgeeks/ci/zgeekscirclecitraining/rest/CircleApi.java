package io.zgeeks.ci.zgeekscirclecitraining.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api")
@Component
public class CircleApi {

    @Path("/hello")
    @GET
    public String helloCircleCi() {
        return "hello circle ci docker";
    }
}
