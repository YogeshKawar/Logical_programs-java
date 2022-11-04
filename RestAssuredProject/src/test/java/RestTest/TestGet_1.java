package RestTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class TestGet_1 {
@Test

public void test_01() {
	given()
	.header("Content-Type","application/json")
	.get("https://reqres.in/api/users?page=2")
	.then()
	.statusCode(200)
	.body("data.id[0]",equalTo(7))
	.body("data.first_name", hasItems("Michael","Lindsay"));
	
}
}
