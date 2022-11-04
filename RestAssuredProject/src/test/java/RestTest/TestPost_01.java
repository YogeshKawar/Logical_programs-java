package RestTest;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class TestPost_01 {

	public void test_01() {
		/*
		 * Creating body
		 * {
    "name": "morpheus",
    "job": "leader"
			}
		Like this*/
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("name", "Yogesh");
		map.put("job", "QA");
		
		System.out.println(map);

		JSONObject request = new JSONObject(map);
		//System.out.println(request);
		//alternative
		System.out.println(request.toJSONString());
	}
	//alternative
	public void test_02() {
		JSONObject request = new JSONObject();
		request.put("name", "Suraj");
		request.put("job", "Test Engineer");
		//System.out.println(request);
		//alternative
		String str = request.toJSONString();
		System.out.println(str);
		
		//now post request creating syntax
		given()
		//.header("Content-type","application/json")
		//alternative
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		//converting body to string
		.body(request.toJSONString())
		.patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		//print response
		.log().all();

	}
	
	@Test 
	public void delete_01() {
		given().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
	}
}

