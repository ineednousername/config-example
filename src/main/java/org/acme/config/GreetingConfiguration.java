package org.acme.config;


import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.text.MessageFormat;

@ConfigProperties(prefix = "greeting")
public interface GreetingConfiguration {

    @ConfigProperty(name = "message",defaultValue = "message")
    String message();

    @ConfigProperty(name = "hello",defaultValue = "hello")
    String hello();

    @ConfigProperty(name = "world",defaultValue = "world")
    String world();

    default String build(){
        return MessageFormat.format("{0}={1} {2}!", message(), hello(), world());
    }

}
