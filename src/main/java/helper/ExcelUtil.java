package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

public class ExcelUtil {
	
	public static Object[][] readsExcelFile(String filepath, String sheet) throws IOException {

		File file = new File(filepath);
		FileInputStream inputstream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(inputstream);
		HSSFSheet hssfsheet = workbook.getSheet(sheet);

		int rowcount = hssfsheet.getPhysicalNumberOfRows();
		System.out.println(String.format("rowcount :%1$s", rowcount));
		int columncount = hssfsheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(String.format("columncount :%1$s", columncount));
		Object[][] data = new Object[rowcount][columncount];
		for (int i = 0; i < rowcount; i++) {
			Row row = hssfsheet.getRow(i);
			for (int j = 0; j < columncount; j++) {
				Cell cell = row.getCell(j);

				DataFormatter format = new DataFormatter();
				String value = format.formatCellValue(cell);
				data[i][j] = value;

				workbook.close();
				inputstream.close();
			}

		}
		return data;
	}
}
