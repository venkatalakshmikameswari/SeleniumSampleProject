package dataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import helper.ExcelUtil;

public class ExcelDataProvider {

	@DataProvider
	
	public static Object[][] fileExcelDataProvider() throws IOException{
		
	Object[][]	objArray = ExcelUtil.readsExcelFile("C:\\Users\\meetr\\OneDrive\\Documents\\login.xls","Sheet1");
	System.out.println(String.format("objArray : %1$s %2$s", objArray[0][0],objArray[0][1]));
	return objArray;
			
		
	}
}
