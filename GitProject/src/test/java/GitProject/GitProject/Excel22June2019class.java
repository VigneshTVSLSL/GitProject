package GitProject.GitProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel22June2019class {

	// static String projectpath = System.getProperty("user.dir");

	public Excel22June2019class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		getDataFromExcel();

	}

	public static void getDataFromExcel() throws EncryptedDocumentException, IOException

	{

		File excelFilePath = new File(
				"D:\\OneDrive - TVS Logistics Services Limited\\Automation\\Automation\\Git\\Gitproject\\GitProject\\GitProject\\TestData\\ExcelTestDataSheet.xlsx");

		FileInputStream excelfis = new FileInputStream(excelFilePath);

		Workbook workbookfact = new WorkbookFactory().create(excelFilePath);

		Sheet excelsheet = (Sheet) workbookfact.getSheet("Sheet1");

		Row rowvalue = ((org.apache.poi.ss.usermodel.Sheet) excelsheet).getRow(1);

		Cell columnvalue = rowvalue.getCell(1);

		System.out.println("Column Value is " + columnvalue);

	}

}
