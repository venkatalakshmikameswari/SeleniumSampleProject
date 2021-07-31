package helper;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserUtil {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browserName,String url)
	{
		if(browserName.equalsIgnoreCase("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\meetr\\OneDrive\\Desktop\\New folder\\chromedriver_win32version_92\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(url);
		}
		
		if(browserName.equalsIgnoreCase("ie"))
		{
			throw new NotImplementedException("IE need to be implemented.");
		
		}
		
		return driver;
	}
	

}


