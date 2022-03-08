package br.com.hunterapi.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import br.com.hunteapi.core.BaseTest;

public class LeadsTest extends BaseTest {
	
	@Test
	public void successCreate() {
	
		Lead lead = new Lead();
		lead.setEmail("kauan.henrique@wecares.com");
		lead.setFirst_name("Kauan");
		lead.setLast_name("Henrique");
		lead.setPosition("Cofounder");
		lead.setCompany("WeCares");
		lead.setCompany_industry("Personal Care");
		lead.setCompany_size("1-50 employees");
		lead.setConfidence_score(50);
		lead.setWebsite("wecares.com.br");
			
		given()
			.queryParam("api_key", "6e3a7b039546ae7d5532b615bafe1656fb8082b1")
			.body(lead)
		.when()
			.post("/leads")
		.then()
			.statusCode(201)
			.body("data.email", is("kauan.henrique@wecares.com"))
			.body("data.first_name", is("Kauan"))
			.body("data.last_name", is("Henrique"))
			.body("data.position", is("Cofounder"))
			.body("data.company", is("WeCares"))
			.body("data.company_industry", is("Personal Care"))
			.body("data.confidence_score", is(50))
			.body("data.website", is("wecares.com.br"))
			.body("data.company_size", is("1-50 employees"))
		;
	}

}
