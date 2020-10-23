package org.acme.config;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestProfile(value = CoolProfile.class)
public class GreetingResource2Test {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/greeting")
          .then()
             .statusCode(200)
             .body(is("something=bye another world!"));
    }

    @Test
    public void testHelloEndpointComplex() {
        given()
                .when().get("/greeting/complex")
                .then()
                .statusCode(200)
                .body(is("something=bye another world!"));
    }

    @Test
    public void testHelloEndpointComplexOther() {
        given()
                .when().get("/greeting/complex/other")
                .then()
                .statusCode(200)
                .body(is("message=1 true!"));
    }

    @Test
    public void testHelloEndpointOther() {
        given()
                .when().get("/greeting/other")
                .then()
                .statusCode(200)
                .body(is("message=1 true!"));
    }

}
