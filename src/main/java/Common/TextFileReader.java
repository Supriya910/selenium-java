package Common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader extends BaseSeleniumTest {

	public static void main(String[] args)  throws IOException{
		
		File file = new File("C:\\Users\\welcome\\eclipse-workspace-selenium\\selenium-automation\\src\\main\\resources\\LoginText.txt");
				
        FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String st;
		
		while ((st = br.readLine()) != null){
			System.out.println(st);
			//System.out.println(st.split(",")[0]+" "+st.split(",")[1]);
		}
	}

	
	}


