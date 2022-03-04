package br.com.hunterapi.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import br.com.hunteapi.core.BaseTest;

public class AccountTest extends BaseTest {
	
	@Test
	public void AccountInformation() {
	given()
		.queryParam("api_key", "6e3a7b039546ae7d5532b615bafe1656fb8082b1")
	.when()
		.get("/account")
	.then()
		.statusCode(200)
		.body("data.first_name", is("Kauan"))
		.body("data.last_name", is("Henrique"))
		.body("data.email", is("khds2013@gmail.com"))
	;
	}
}
