package POSTMethod;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postM {
	
public void test_method() {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("name", "morpheus");
	map.put("job","leader");
	System.out.println(map);
	
	JSONObject req = new JSONObject(map);
	System.out.println(req.toJSONString());
	given()
	.body(req.toJSONString())
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201)
	.log().all();
}
@Test
	public void test_method_01() {
		JSONObject req1 = new JSONObject();
		req1.put("name", "Suraj");
		req1.put("job", "QA");
		System.out.println(req1.toJSONString());
		given()
		.body(req1.toJSONString())
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
	}
}
