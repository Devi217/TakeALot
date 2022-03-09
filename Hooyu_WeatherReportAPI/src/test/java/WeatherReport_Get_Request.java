import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class WeatherReport_Get_Request {

	@Test
	void getweatherDetails()
	{
		// specify base URI
		RestAssured.baseURI = "http://api.openweathermap.org/geo/1.0/direct";

		// specify type of request - RequestObject
		
		RequestSpecification httprequest = RestAssured.given();
		
		//Response object
		
		Response response = httprequest.request(Method.GET,"q=London&limit=5&appid=37b0edc29c25ed729883824587bc8f8a");
		String responseBody = response.getBody().asString();
		System.out.println("responseBody: " + responseBody);
		
		//verify status code
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, "200");
	}
}
