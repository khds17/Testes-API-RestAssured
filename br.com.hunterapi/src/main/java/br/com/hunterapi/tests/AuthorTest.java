package br.com.hunterapi.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import br.com.hunteapi.core.BaseTest;

public class AuthorTest extends BaseTest {
	
	@Test
	public void authorFinder() {
	given()
		.queryParam("api_key", "6e3a7b039546ae7d5532b615bafe1656fb8082b1")
		.queryParam("url", "https://hunter.io/blog/how-to-know-if-someone-read-your-email")
	.when()
		.get("/author-finder")
	.then()
		.statusCode(200)
		.body("data.first_name", is("Irina"))
		.body("data.last_name", is("Maltseva"))
		.body("data.email", is("irina@hunter.io"))
	;
	}

}
