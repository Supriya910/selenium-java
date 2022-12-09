package TestCode;



	import org.testng.annotations.Test;
	import Common.BaseSeleniumTest;
	import Pages.Homepage;
	import Pages.LoginPage;

	public class LoginTestArray extends BaseSeleniumTest {
	     
		@Test (priority=2, enabled=true, groups= {"Critical","Negative","Regression"})//
		public void VerifyAdminNotAbleToLoginWithIncorrectPassword()
		
		{
			LoginPage lp = new LoginPage();
			lp.login("admin", "admin1");
			lp.verifyErrorMessage("Invalid credentials");
		}
		
		@Test(priority=1, enabled=true, groups= {"Critical","Positive","Regression"})
		public void VerifyAdminUserAbleToLoginSuccessfully()
		
		{
			LoginPage lp = new LoginPage();
			lp.login("admin", "admin");
			
			Homepage hp = new Homepage();
			hp.verifyWelcomeText("welcome Paul");
		}
	}

	

