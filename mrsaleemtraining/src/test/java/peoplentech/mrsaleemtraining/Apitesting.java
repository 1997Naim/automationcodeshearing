package peoplentech.mrsaleemtraining;
import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;
public class Apitesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Response responsive = get("https://reqres.in/api/users?page=2");
responsive.prettyPrint();
 int statusc=responsive.statusCode();
 System.out.println(statusc);
 Assert.assertEquals(statusc, 200);
 
 ResponseBody verifying=responsive.getBody();
String converts= verifying.asString();
Assert.assertEquals(converts.contains("Funke"), true);
File it=new File("C:\\Users\\naimu\\git\\repository\\mrsaleemtraining\\apiautomation.json");
Response gt=given().contentType(ContentType.JSON).body(it).post("https://reqres.in/api/users?page=2");
gt.prettyPrint();
	}

}
