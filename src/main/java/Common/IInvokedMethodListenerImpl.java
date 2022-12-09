package Common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener {


	@Override
  public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context)
	{
	System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
	
	// WebDriverFactory.driver = new ChromeDriver();
	   WebDriverFactory.setDriver(new ChromeDriver());
	//WebDriverFactory.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
	   WebDriverFactory.getDriver().manage().window().maximize();
	   WebDriverFactory.getDriver().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
	}
	
   @Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context)
  {
  	WebDriverFactory.getDriver().quit();
		
  }
	
	
	
	
	
}
