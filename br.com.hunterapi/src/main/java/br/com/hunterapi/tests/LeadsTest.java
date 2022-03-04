package br.com.hunterapi.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import br.com.hunteapi.core.BaseTest;

public class LeadsTest extends BaseTest {
	
	@Test
	public void successCreate() {
	given()
		.queryParam("api_key", "6e3a7b039546ae7d5532b615bafe1656fb8082b1")
		.body("{\n"
				+ "    \"email\": \"kauan.henrique@wecares.com\",\n"
				+ "    \"first_name\": \"Kauan\",\n"
				+ "    \"last_name\": \"Henrique\",\n"
				+ "    \"position\": \"Cofounder\",\n"
				+ "    \"company\": \"WeCares\",\n"
				+ "    \"company_industry\": \"Personal Care\",\n"
				+ "    \"company_size\": \"1-50 employees\",\n"
				+ "    \"confidence_score\": 17,\n"
				+ "    \"website\": \"wecares.com.br\",\n"
				+ "    \"custom_attributes\": {\n"
				+ "        \"customer_id\": \"\"\n"
				+ "    }\n"
				+ "}")
	.when()
		.post("/leads")
	.then()
		.statusCode(201)
		.body("data.first_name", is("Kauan"))
		.body("data.last_name", is("Henrique"))
		.body("data.email", is("khds2013@gmail.com"))
		.body("data.website", is("wecares.com.br"))
	;
	}

}
