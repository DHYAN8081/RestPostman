package test12;
import  io.restassured.http.ContentType;
import properties.setup;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import io.restassured.RestAssured;
public class properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		setup obj1=new setup();
		obj1.method();
		given().auth()
		.basic(pr.getProperty ("usename"),pr.getProperty("password"))
		// how to call the properties
//		RestAssured.baseURI="https://reqres.in/";
//		RestAssured.basePath="api/";
//		given().auth().basic("admin","psw123")
		.contentType(ContentType.JSON)
//		.when().get("https://reqres.in/api/users")
		.when().get(pr.getProperty("endURI"))
		.then()
		.statusCode(200)
		.log().all();

	}

}
