package org.acme.config;

import io.quarkus.test.junit.QuarkusTestProfile;

public class CoolProfile implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "coolTest";
    }
}
