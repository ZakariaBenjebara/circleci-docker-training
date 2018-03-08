package io.zgeeks.ci.zgeekscirclecitraining.config;

import io.zgeeks.ci.zgeekscirclecitraining.rest.CircleApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        register(CircleApi.class);
    }
}
