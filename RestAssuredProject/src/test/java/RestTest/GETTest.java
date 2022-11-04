package RestTest;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GETTest {
@Test

public void testGetMethod() {
	Response response = get("https://reqres.in/api/users?page=2");
	System.out.println(response.asString());
	System.out.println("");
	System.out.println(response.getBody());
	System.out.println("");
	System.out.println("Status Code is: "+response.getStatusCode());
	
	int code = response.getStatusCode();
	
	Assert.assertEquals(code, 200);
	Reporter.log("Code matches");
	
}
@Test
public void testGetMethod_01() {
	given()
	.get("https://reqres.in/api/users?page=2")
	.then()
	.statusCode(200)
	.body("data.id[1]",equalTo(8));
}
}
