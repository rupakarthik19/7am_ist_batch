package Com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_from_excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  FileInputStream fi = new FileInputStream("./src/test/resources/Testdata/testdata.xlsx");
		  Workbook wb = new XSSFWorkbook(fi);
		  Sheet s= wb.getSheet("Sheet1");
		  Row r = s.getRow(1);
		  System.out.println(r.getCell(0));
		  }

}
