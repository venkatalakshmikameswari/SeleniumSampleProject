package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {
	
	static WebDriver driver;
	
	public static WebDriver browserFactoryMethod(String browser,String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\meetr\\OneDrive\\Desktop\\New folder\\chromedriver_win32version_92\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get(url);
		}
		if(browser.equalsIgnoreCase("firefox")) {
			
		}
		return driver;
		
	}

}
