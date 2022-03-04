package br.com.hunterapi.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import br.com.hunteapi.core.*;

public class EmailTest extends BaseTest {


    @Test
    public void emailSearch() {
        given()
                .queryParam("api_key", "6e3a7b039546ae7d5532b615bafe1656fb8082b1")
                .queryParam("domain", "intercom.io")
                .queryParam("first_name", "Adam")
                .queryParam("last_name", "Risman")
        .when()
                .get("/email-finder")
        .then()
                .statusCode(200)
                .body("data.domain", is("intercom.io"))
                .body("data.first_name", is("Adam"))
                .body("data.last_name", is("Risman"))
        ;
    }
    
    @Test
    public void emailVerifier() {
    	given()
    		.queryParam("api_key", "6e3a7b039546ae7d5532b615bafe1656fb8082b1")
    		.queryParam("email", "adam.risman@intercom.io")
    	.when()
    		.get("/email-verifier")
    	.then()
    		.statusCode(200)
    		.body("data.email", is("adam.risman@intercom.io"))
    		.body("meta.params.email", is("adam.risman@intercom.io"))
    		;
    }
    
    @Test
    public void emailCount() {
    	given()
			.queryParam("domain", "intercom.io")
		.when()
			.get("/email-count")
		.then()
			.statusCode(200)
			.body("data.total", is(35))
			;
    }

}
