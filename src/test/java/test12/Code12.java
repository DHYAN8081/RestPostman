package test12;
import static io.restassured.RestAssured.*;

import  static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;

public class Code12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		given().auth().basic("Admin", "psw123")
		.contentType(ContentType.JSON)
		.when().get("http://localhost:3000/booking")
		.then()
		.statusCode(200)
		.time(lessThan(1000L))
		.body("name", hasItem("Emirates"))
		.log().all();
		
		

	}

}
