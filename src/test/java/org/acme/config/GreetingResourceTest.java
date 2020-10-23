package org.acme.config;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/greeting")
          .then()
             .statusCode(200)
             .body(is("message=hello world!"));
    }

    @Test
    public void testHelloEndpointComplex() {
        given()
                .when().get("/greeting/complex")
                .then()
                .statusCode(200)
                .body(is("message=hello world!"));
    }

    @Test
    public void testHelloEndpointComplexOther() {
        given()
                .when().get("/greeting/complex/other")
                .then()
                .statusCode(200)
                .body(is("does=0 true!"));
    }

    @Test
    public void testHelloEndpointOther() {
        given()
                .when().get("/greeting/other")
                .then()
                .statusCode(200)
                .body(is("does=0 true!"));
    }

}
