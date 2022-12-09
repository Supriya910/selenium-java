package Common;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReadFromTheFileTest {

	public static void main(String[] args) {
		JSONParser parser =new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C:/Users/welcome/eclipse-workspace-selenium/selenium-automation/src/main/resources/Text.Json"));
			JSONObject jsonObject = (JSONObject)obj;
			String functional_testing =(String)jsonObject.get("functional_testing");
			String non_functional_testing = (String)jsonObject.get("non_functional_testing");
			JSONArray testing_type = (JSONArray)jsonObject.get("testing_type");
			
			
			System.out.println("testing_type:");
			
			Iterator iterator = testing_type.iterator();
			while (iterator.hasNext()){
				System.out.println(iterator.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
