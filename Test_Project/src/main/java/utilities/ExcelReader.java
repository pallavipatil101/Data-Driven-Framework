package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public  String path;
	public  FileInputStream fin = null;
	public  FileOutputStream fileOut =null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	
	
	public ExcelReader(String path) {		
		this.path=path;
		try {
			fin = new FileInputStream(path);
			workbook = new XSSFWorkbook(fin);
			sheet = workbook.getSheetAt(0);
			fin.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 		
	}
	
	
	//Check if sheet exists or not.
	public boolean doesSheetExist(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if(index == -1)
		{
			return false;
		}
		else {
			return true;
		}
	}
	
	
	//Return number of rows.
	public int rowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if(index == -1)
		{
			return 0;
		}
		else{
			sheet = workbook.getSheet(sheetName);
			int rowNum = sheet.getLastRowNum()+1;
			return rowNum;
		}
	}
	
	
	//Return number of columns.
	public int columnCount(String sheetName) {
		
		if(!doesSheetExist(sheetName)) {
			 return -1;
		}
		
		sheet = workbook.getSheet(sheetName);
		int colNum = sheet.getRow(0).getLastCellNum();		
		return colNum;
	}
	
	
	// returns the data from a cell
	public String getCellData(String sheetName, String colName, int rowNum){
	
	try{
			if(rowNum <= 0)
				return "";
		
		int index = workbook.getSheetIndex(sheetName);
		int columnNum = -1;
		if(index == -1)
			return "";
		
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(0);
		for(int i=0; i<row.getLastCellNum(); i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
				columnNum = i;
		}
		
		if(columnNum == -1)
			return "";
		
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum);
		if(row == null)
			return "";
		
		cell = row.getCell(columnNum);
		
		if(cell == null)
			return "";
		
		if(cell.getCellType() == CellType.STRING)
		{
			  return cell.getStringCellValue();
		}		
		
		else if(cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA )
		{			  
			  String cellText  = String.valueOf(cell.getNumericCellValue());
			  
			  return cellText;
		}
		
		else if(cell.getCellType() == CellType.BLANK)
		{
		      return ""; 
		}
		
		else
		{
			  return String.valueOf(cell.getBooleanCellValue());
		}
		
		}
		catch(Exception e){		
			e.printStackTrace();
			return "Row: "+rowNum+" or column: "+colName +" does not exist in the sheet.";
		}
		
	}

	
	// returns the data from a cell
	public String getCellData(String sheetName,int rowNum,int colNum){
		try{
			if(rowNum <=0)
				return "";
				
			int index = workbook.getSheetIndex(sheetName);
			if(index==-1)
				return "";
						
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum);
			if(row==null)
				return "";
				
			cell = row.getCell(colNum);
			if(cell==null)
				return "";
				
			DataFormatter formatter = new DataFormatter();
	        return formatter.formatCellValue(cell);
				  
		  }
		catch(Exception e){
			e.printStackTrace();
			return "row "+rowNum+" or column "+colNum +" does not exist  in xls";
		}
	}
	
	
	
	//Returns data as string
	public String getData(String sheetName, String colName, int rowNum)
	{
		try{
			if(rowNum <=0)
				return "";
		
		int index = workbook.getSheetIndex(sheetName);
		int col_Num=-1;
		if(index==-1)
			return "";
		
		sheet = workbook.getSheetAt(index);
		row=sheet.getRow(0);
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
				col_Num=i;
		}
		
		if(col_Num==-1)
			return "";
		
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum);
		if(row==null)
			return "";
		
		cell = row.getCell(col_Num);
		if(cell==null)
			return "";
		 
		DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(cell);
		
		}
		catch(Exception e){		
			e.printStackTrace();
			return "Row: "+rowNum+" or column: "+colName +" does not exist in the sheet.";
		}
		
	}
}
