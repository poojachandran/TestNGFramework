package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured_GET_test {

	@Test
	public void restAssuredGET_test_method() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[3]", equalTo(10))
		.body("data.first_name[3]", is("Byron"));
	}
}
