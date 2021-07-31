package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@type='email']")
	WebElement Email;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButton;
	
	
	public void setEmail(String email) {
		Email.clear();
		Email.sendKeys(email);
	}

	public void setPassword(String pswd){
		password.clear();
		password.sendKeys(pswd);
	}
	public void loginButton() {
		LoginButton.click();
	}
}
