package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Common.WebDriverFactory;

public class LoginPage {


	@FindBy(id="txtUsername")
	private WebElement userName;
	
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	
	@FindBy(id="spanMessage")
	private WebElement loginErrorMessage;
	
	public LoginPage() {//No Argument /Parameter Constructor Function
		System.out.println("No Argument/Parameter Constructor called...");
		PageFactory.initElements(WebDriverFactory.getDriver(),this);
	}
	
	
	
	
	public void login(String strUserName,String strPassword)
	{
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
		
	}
	
	
	public void LoginWithEmptyData()
	{
		userName.clear();
		password.clear();
		loginButton.click();
	}
	
	public void verifyErrorMessage(String expectedErrorMessage)
	{
	 Assert.assertEquals(loginErrorMessage.getText(), expectedErrorMessage);
	}
	
	
	
	
	
	
	
	
}
