package org.acme.config;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ContainerConfig {


    private final GreetingConfiguration configuration;
    private final OtherConfiguration other;

    @Inject
    public ContainerConfig(GreetingConfiguration configuration, OtherConfiguration config){
        this.configuration = configuration;
        this.other = config;
    }

    public GreetingConfiguration getConfiguration() {
        return configuration;
    }

    public OtherConfiguration getOther() {
        return other;
    }
}
