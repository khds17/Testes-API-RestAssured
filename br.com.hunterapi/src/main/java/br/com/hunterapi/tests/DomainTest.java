package br.com.hunterapi.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import br.com.hunteapi.core.*;

public class DomainTest extends BaseTest {
	

	@Test
	public void domainSearch() {
		given()
			.queryParam("api_key", "6e3a7b039546ae7d5532b615bafe1656fb8082b1")
			.queryParam("domain", "intercom.io")
		.when()
			.get("/domain-search")
		.then()
			.statusCode(200)
			.body("data.domain", is("intercom.io"))
			.body("meta.params.domain", is("intercom.io"))
		;
	}
	
}
