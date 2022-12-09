package Common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class BaseSeleniumTest {
	 
		@DataProvider(name="LoginDataProvider")
		public String[][] getLoginData()
		{
			String[][] loginData = {
					                 {"admin","admin","Welcome Paul"},
					                 {"ess","ess123","Welcome ESS"},
					                 {"adm","admin123","Welcome Adm"}
					
			                       };
			return loginData;
		}
		

               
         @DataProvider(name="CSVDataProvider")
         public String[][] getDataFromCSVFile() throws IOException {
         File file = new File("/selenium-automation/src/main/resources/LoginText.txt");
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr); //Ram->Cache-> Buffer
         
        String st;
        
        int numberofRows=4;       //write a function to find number of lines in file
        int numberofColumns=3;   //write a function to find number of columns in file
        
 		{
 			String[][] loginData = new String[numberofRows][numberofColumns];
 			
 			int i = 0;
 			while ((st = br.readLine()) != null) {
 				System.out.println(st);
 				String[] lineArray = st.split(",");
 				loginData[i]= lineArray;
 				i= i + 1;
 				System.out.println("");
 			}
 			
 			
 						
 			                           
 		}
 					                 
 		private int getNumberofRows()	                       
 			{
 					int row = 0;
 			
 					return row;
 			
 			}
 		
 		private int getNumberofColumns()
 		   {
 			     int columns = 0;
 			     
 			     return columns;
 			     
 		  }
 		
         		
}