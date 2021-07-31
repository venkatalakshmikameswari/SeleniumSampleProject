package dataProvider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	
	
	@DataProvider
	
	public static Object[][] getDataFromDataProvider(){
		return new Object[][] {
			{"user@phptravels.com","demouser"}
		};
	}

}
