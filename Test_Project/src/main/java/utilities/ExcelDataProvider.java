package utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider{
	
	public static Object[][] testData(String path, String sheetName) {
		
		ExcelReader e = new ExcelReader(path);
		
		int rowCount = e.rowCount(sheetName);	
		int colCount = e.columnCount(sheetName);
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String cellData = e.getCellData(sheetName, i, j);
				//System.out.println(cellData);				
				data[i-1][j] = cellData;
			}
		}
		return data;
	}
	
	
	@DataProvider(name = "textboxDP")
	public static Object[][] getTextboxData() {
		Object[][] data = testData(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx", "Textbox");
		return data;
	}
	
	@DataProvider(name = "practiceformDP")
	public static Object[][]getFormData(){
		Object[][] data = testData(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx", "Form");
		return data;
	}
	
	@DataProvider(name = "webtableDP")
	public static Object[][]getTableData(){
		Object[][] data = testData(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx", "Table");
		return data;
	}
	
	@Test(dataProvider = "webtableDP")
	public void test(String label, String value) {
		System.out.println("==> "+value);
	}
	
	
}
