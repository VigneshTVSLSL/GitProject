package testPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excel22June2019 {

	@Test
	public void getDataFromExcel() throws EncryptedDocumentException, IOException

	{

		// System.out.println("test");

		String projectpath = System.getProperty("user.dir");

		File excelFilePath = new File(projectpath + "\\TestData\\ExcelTestDataSheet.xlsx");

		FileInputStream excelfis = new FileInputStream(excelFilePath);

		Workbook workbookfact = new WorkbookFactory().create(excelFilePath);

		Sheet excelsheet = (Sheet) workbookfact.getSheet("Sheet1");

		Row rowvalue = ((org.apache.poi.ss.usermodel.Sheet) excelsheet).getRow(1);

		Cell columnvalue = rowvalue.getCell(1);

		System.out.println("Column Value is " + columnvalue);

		// Workbook wb = new WorkbookFactory().create(excelfile);

		// workbookfact = new WorkbookFactory().create(excelFilePath);

	}

}
