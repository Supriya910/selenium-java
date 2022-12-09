package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Common.WebDriverFactory;

public class Homepage {


	@FindBy(id="welcome")
	WebElement WelcomeText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement UserManagement;
	
	@FindBy(id="menu_admin_Qualifications")
	WebElement Qualifications;
	
	@FindBy(id="menu_admin_viewSkills")
	WebElement skillsSubMenu;
	
	
	public Homepage() {//No Argument /Parameter Constructor Function
		System.out.println("No Argument/Parameter Constructor called...");
		PageFactory.initElements(WebDriverFactory.getDriver(),this);
	}
	
	
	public Homepage verifyWelcomeText(String expectedWelcomeText)

	{
		Assert.assertEquals(WelcomeText.getText(), expectedWelcomeText);
		
		return this;
		
		//HomePage hp= new HomePage();
		// return hp;
	
	}
	
	
	
}
