package utilities;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDP{
	
	
	@DataProvider(name = "dp")
	public Object[][] getData(Method m) {
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "/src/test/resources/Data_DemoQA.xlsx");
		String sheetName = m.getName();
		int rows = excel.rowCount(sheetName);
		int cols = excel.columnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		
		Hashtable<String,String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

			table = new Hashtable<String,String>();
			
			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0]
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, rowNum, colNum));
				data[rowNum - 2][0] = table;
			}

		}

		return data;

	}
	
	@Test(dataProvider="dp")
	public void signIn(Hashtable<String,String> data) {				
		
			System.out.println(data.get("Name"));
	
	}
}
