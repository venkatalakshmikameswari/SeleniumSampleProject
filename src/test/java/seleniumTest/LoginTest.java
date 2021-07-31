package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataProvider.ExcelDataProvider;
import dataProvider.LoginDataProvider;
import helper.BrowserUtil;
import pages.LoginPage;


public class LoginTest {
	WebDriver driver=BrowserUtil.startBrowser("chrome","https://www.phptravels.net/login");
	
	
	@Test(enabled=false)
/**
 Test method to verify user is able to login
 */
	
public void loginTest() {
     LoginPage login = new LoginPage(driver);
	login.setEmail("user@phptravels.com");
	login.setPassword("demouser");
	login.loginButton();
	
	Assert.assertEquals(driver.getTitle(),"Login");
}
	
	/**
	 * Test Method To verify user to login using TESTNG xml file
	 */
	
	@Test(enabled=false)
	@Parameters({"email","password"})
	public void testParametersWithXML(String email,String password) {
		
		System.out.println("Test Parameters with XML");
		 LoginPage login = new LoginPage(driver);
			login.setEmail(email);
			login.setPassword(password);
			login.loginButton();
			System.out.println(String.format("email : %1$s", email));
			System.out.println(String.format("password : %1$s",password));
			Assert.assertEquals(driver.getTitle(), "Login");
	}
	
	/**
	 * Test Method to verify user to login using custom dataprovider
	 */
	@Test(dataProvider = "getDataFromDataProvider", dataProviderClass = LoginDataProvider.class,enabled=false)
	
	public void testWithCustomDataProvider(String email,String password) {
		
		 LoginPage login = new LoginPage(driver);
		 System.out.println("Test with custom DataProvider");
			login.setEmail(email);
			login.setPassword(password);
			login.loginButton();
			System.out.println(String.format("email : %1$s", email));
			System.out.println(String.format("password : %1$s",password));
		System.out.println("testWithCustomDataProvider method completed");
			Assert.assertEquals(driver.getTitle(), "Login");
	}
	
	
	/**
	 * Test method to verify user to login using dataprovider with excelsheet
	 */
	
	@Test(dataProvider="fileExcelDataProvider",dataProviderClass = ExcelDataProvider.class)
	
	public void testWithExcelDataProvider(String email,String password) {
		LoginPage login = new LoginPage(driver);
		 System.out.println("Test with custom DataProvider");
			login.setEmail(email);
			login.setPassword(password);
			login.loginButton();
			System.out.println(String.format("email : %1$s", email));
			System.out.println(String.format("password : %1$s",password));
		System.out.println("testWithCustomDataProvider method completed");
			Assert.assertEquals(driver.getTitle(), "Login");
	}
}
