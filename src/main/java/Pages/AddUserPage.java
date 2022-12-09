package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.WebDriverFactory;

public class AddUserPage {


	@FindBy(id="systemUser_userType")
	WebElement UserRole;
	
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement EmployeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement loginButton;
	
	
	@FindBy(id="spanMessage")
	WebElement loginErrorMessage;
	
	public AddUserPage() {//No Argument /Parameter Constructor Function
		System.out.println("No Argument/Parameter Constructor called...");
		PageFactory.initElements(WebDriverFactory.getDriver(),this);
	}
	
	
	
}
