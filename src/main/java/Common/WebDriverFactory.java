package Common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

	
	private static ThreadLocal<WebDriver>threadLocalStorage= new ThreadLocal<WebDriver>();
	//Static variable / Class Level Variable
	
	//Function -> Method
	public static WebDriver getDriver()  //Getter
	{
		return threadLocalStorage.get();
			
	}
	
	
	public static void setDriver(WebDriver  localDriver)  //setter
	{
		threadLocalStorage.set(localDriver);
	}
}
