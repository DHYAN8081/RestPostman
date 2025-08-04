package properties;


import java.io.FileInputStream;
import java.util.Properties;

import io.restassured.RestAssured;

public class setup {
//	public void method(){
//		RestAssured.baseURI="https://reqres.in/";
//		RestAssured.basePath="api/";
		public static Properties pr=new Properties();
		private FileInputStream fs;
		public void method() throws IOEException{
			fs=new FileInoutStream("C:\\Users\\ASUS\\Desktop\\CSE377 Testing\\RestAssured\\properties\\config.properties");
			pr.load(fs);
			RestAssured.baseURI=pr.getProperty("baseURI");
			RestAssured.basePath="api/";
					
					
		}
		
		
	}
	}


