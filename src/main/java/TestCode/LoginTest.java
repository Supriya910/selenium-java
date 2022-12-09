package TestCode;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Common.BaseSeleniumTest;
import Common.IInvokedMethodListenerImpl;
import Pages.LoginPage;


@Listeners(IInvokedMethodListenerImpl.class)
public class LoginTest extends BaseSeleniumTest  {
   
	
	@Test(dataProvider="LoginDataProvider")                               
	public void VerifyUserAbleToLoginSuccessfully(String userName,String password,String welcomeText)
	
	{
		LoginPage lp = new LoginPage();
		lp.login(userName, password);
		verifyWelcomeText(welcomeText);
		
		
		
		
	}
	

	 


	private void verifyWelcomeText(String welcomeText) {
		// TODO Auto-generated method stub
		
	}





	//	@Test (priority=2, enabled=true, groups= {"Critical","Negative","Regression"})//
	public void VerifyAdminNotAbleToLoginWithIncorrectPassword()
	
	{
		LoginPage lp = new LoginPage();
		lp.login("admin", "admin1");
		lp.verifyErrorMessage("Invalid credentials");
	}
	
}
