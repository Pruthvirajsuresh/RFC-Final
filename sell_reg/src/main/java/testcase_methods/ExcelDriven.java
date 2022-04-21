package testcase_methods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;

	public static void main(String[] args) throws IOException {

		String value = getCelldata(0, 0);
		System.out.println(value);
		String value1 = getCelldata(0, 1);
		System.out.println(value1);
		value = setCelldata("User credentails", 0, 1);
		System.out.println(value);

	}

	private static String setCellvalue(int i, int j) {

// TODO Auto-generated method stub

		return null;

	}

	public static String getCelldata(int rownum, int col) throws IOException

	{

		fis = new FileInputStream("/home/infibeam/login_test_data.xlsx");

		wb = new XSSFWorkbook(fis);

		sheet = wb.getSheet("Sheet1");

		row = sheet.getRow(1);

		cell = row.getCell(0);

		return cell.getStringCellValue();

	}

	public static String setCelldata(String text, int rownum, int col) throws IOException

	{

		fis = new FileInputStream("/home/infibeam/login_test_data.xlsx");

		wb = new XSSFWorkbook(fis);

		sheet = wb.getSheet("Sheet1");

		row = sheet.getRow(1);

		cell = row.getCell(1);

		cell.setCellValue(text);

		String celldata1 = cell.getStringCellValue();

		return celldata1;

	}

}