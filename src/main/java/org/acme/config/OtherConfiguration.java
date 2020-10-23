package org.acme.config;


import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.text.MessageFormat;

@ConfigProperties(prefix = "why")
public interface OtherConfiguration {

    @ConfigProperty(name = "does",defaultValue = "does")
    String does();

    @ConfigProperty(name = "this",defaultValue = "0")
    Integer thiis();

    @ConfigProperty(name = "work",defaultValue = "true")
    boolean work();

    default String build(){
        return MessageFormat.format("{0}={1} {2}!", does(), thiis(), work());
    }

}
